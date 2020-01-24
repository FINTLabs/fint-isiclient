package no.fint.isiclient;

import biz.ist.isi.types.*;
import biz.ist.isi.wsdl.IsiPartnerInterface;
import biz.ist.isi.wsdl.IsiPartnerService;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import no.fint.isiclient.dto.IsiClientConfig;
import org.apache.commons.io.IOUtils;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;

@Slf4j
public class FintIsiclient {

    @Setter
    private int version = 2;

    @Setter
    private int fetchSize = 32;

    @Setter
    private int timeout = 45000;

    @Setter
    private int pullMaxRetries = 50;

    @Setter
    private long pullRetryInterval = TimeUnit.MILLISECONDS.convert(10, TimeUnit.SECONDS);

    private static final QName SERVICE_NAME = new QName("http://isi.ist.biz/wsdl", "isiPartnerService");

    public boolean createFile(IsiClientConfig config) throws IOException {
        String triggerId = createTrigger(config);
        log.debug("Created trigger {}", triggerId);
        Optional<byte[]> content = getFileContent(triggerId, config);
        if (content.isPresent()) {
            FileOutputStream file = new FileOutputStream(config.getFilePath());
            file.write(content.get());
            file.close();
            return true;
        }
        return false;
    }

    public String getFileContent(IsiClientConfig config) throws IOException {
        String triggerId = createTrigger(config);
        Optional<byte[]> content = getFileContent(triggerId, config);
        if (content.isPresent()) {
            return new String(content.get(), "UTF-8");
        } else {
            return null;
        }
    }

    private String createTrigger(IsiClientConfig config) {
        IsiPartnerInterface port = getIsiPartnerInterface(config);

        IsiPartnerPushResponse response = port.isiPartnerPush(createTriggerData(config));
        if (response == null || response.getTriggerRegistered() == null || response.getTriggerRegistered().size() == 0) {
            return null;
        } else {
            return response.getTriggerRegistered().get(0).getTriggerId();
        }
    }

    private IsiPartnerInterface getIsiPartnerInterface(IsiClientConfig config) {
        URL wsdlURL = IsiPartnerService.WSDL_LOCATION;
        IsiPartnerService ss = new IsiPartnerService(wsdlURL, SERVICE_NAME);
        IsiPartnerInterface isiPartnerPort = ss.getIsiPartnerPort();
        if (config.getEndpoint() != null && config.getEndpoint().length() > 0) {
            BindingProvider bp = (BindingProvider) isiPartnerPort;
            bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, config.getEndpoint());
        }
        return isiPartnerPort;
    }

    private IsiPartnerPush createTriggerData(IsiClientConfig config) {
        IsiSystem system = new IsiSystem();
        system.setSystemId(config.getSourceSystemId());
        system.setPassword(config.getPassword());

        IsiPartnerPush isiPartnerPush = new IsiPartnerPush();
        isiPartnerPush.setVersion(version);
        isiPartnerPush.setSystem(system);

        IsiSystem source = new IsiSystem();
        source.setSystemId(config.getSourceSystemId());

        IsiSystem dest = new IsiSystem();
        dest.setSystemId(config.getDestSystemId());

        IsiTrigger trigger = new IsiTrigger();
        trigger.setServiceClass(config.getServiceClass());
        trigger.setMessageClass(config.getMessageClass());
        trigger.setSource(source);
        trigger.setDest(dest);

        config.getParameters().forEach((key, value) -> {
            IsiParam param = new IsiParam();
            param.setKey(key);
            param.setValue(value);
            trigger.getParam().add(param);
        });

        isiPartnerPush.getTrigger().add(trigger);

        return isiPartnerPush;
    }

    private Optional<byte[]> getFileContent(String triggerId, IsiClientConfig config) throws IOException {
        IsiPartnerInterface port = getIsiPartnerInterface(config);

        int counter = 0;
        while (counter < pullMaxRetries) {
            log.debug("Attempt {}/{}", counter+1, pullMaxRetries);
            IsiPartnerPullResponse response = port.isiPartnerPull(createPullData(triggerId, config));
            if (response.getMessage() != null && response.getMessage().size() > 0) {
                byte[] byteContent = response.getMessage().get(0).getContent();
                GZIPInputStream inputStream = new GZIPInputStream(new ByteArrayInputStream(byteContent));
                ByteArrayOutputStream output = new ByteArrayOutputStream();
                IOUtils.copy(inputStream, output);
                return Optional.ofNullable(output.toByteArray());
            }

            log.debug("Sleeping for {} ms ...", pullRetryInterval);
            try {
                Thread.sleep(pullRetryInterval);
            } catch (InterruptedException ignored) {
            }
            counter++;
        }
        return Optional.empty();
    }

    private IsiPartnerPull createPullData(String triggerId, IsiClientConfig config) {
        IsiPartnerPull pull = new IsiPartnerPull();
        pull.setVersion(version);
        pull.setFetchSize(fetchSize);
        pull.setTimeout(timeout);

        IsiSystem system = new IsiSystem();
        system.setSystemId(config.getSourceSystemId());
        system.setPassword(config.getPassword());
        pull.setSystem(system);

        IsiSystem registeredSource = new IsiSystem();
        registeredSource.setSystemId(config.getSourceSystemId());
        registeredSource.setName(config.getSourceSystemName());
        registeredSource.setType(config.getSourceSystemType());

        IsiTriggerRegistered registered = new IsiTriggerRegistered();
        registered.setServiceClass(config.getServiceClass());
        registered.setMessageClass(config.getMessageClass());
        registered.setTriggerId(triggerId);
        registered.setSource(registeredSource);
        pull.getResponseToTrigger().add(registered);

        IsiSystem statusSource = new IsiSystem();
        statusSource.setSystemId(config.getSourceSystemId());
        statusSource.setName(config.getSourceSystemName());
        statusSource.setType(config.getSourceSystemType());

        IsiSystem statusDest = new IsiSystem();
        statusDest.setSystemId(config.getDestSystemId());
        statusDest.setName(config.getDestSystemName());
        statusDest.setType(config.getDestSystemType());

        IsiTriggerRegistered status = new IsiTriggerRegistered();
        status.setServiceClass(config.getServiceClass());
        status.setMessageClass(config.getMessageClass());
        status.setTriggerId(triggerId);
        status.setSource(statusSource);
        status.setDest(statusDest);
        pull.getStatusTrigger().add(status);
        return pull;
    }
}
