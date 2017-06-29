package no.fint.isiclient;

import biz.ist.isi.types.*;
import biz.ist.isi.wsdl.IsiPartnerInterface;
import biz.ist.isi.wsdl.IsiPartnerService;
import lombok.Setter;
import no.fint.isiclient.dto.IsiclientConfig;
import org.apache.commons.io.IOUtils;

import javax.xml.namespace.QName;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;

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

    public boolean createFile(IsiclientConfig config) throws IOException {
        String triggerId = createTrigger(config);
        Optional<byte[]> content = getFileContent(triggerId, config);
        if (content.isPresent()) {
            FileOutputStream file = new FileOutputStream(config.getFilePath());
            file.write(content.get());
            file.close();
            return true;
        }
        return false;
    }

    public String getFileContent(IsiclientConfig config) throws IOException {
        String triggerId = createTrigger(config);
        Optional<byte[]> content = getFileContent(triggerId, config);
        if (content.isPresent()) {
            return new String(content.get(), "UTF-8");
        } else {
            return null;
        }
    }

    private String createTrigger(IsiclientConfig config) {
        URL wsdlURL = IsiPartnerService.WSDL_LOCATION;
        IsiPartnerService ss = new IsiPartnerService(wsdlURL, SERVICE_NAME);
        IsiPartnerInterface port = ss.getIsiPartnerPort();

        IsiPartnerPushResponse response = port.isiPartnerPush(createTriggerData(config));
        if (response == null || response.getTriggerRegistered() == null || response.getTriggerRegistered().size() == 0) {
            return null;
        } else {
            return response.getTriggerRegistered().get(0).getTriggerId();
        }
    }

    private IsiPartnerPush createTriggerData(IsiclientConfig config) {
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

        IsiParam param = new IsiParam();
        param.setKey(config.getKey());
        param.setValue(config.getValue());
        trigger.getParam().add(param);
        isiPartnerPush.getTrigger().add(trigger);

        return isiPartnerPush;
    }

    private Optional<byte[]> getFileContent(String triggerId, IsiclientConfig config) throws IOException {
        URL wsdlURL = IsiPartnerService.WSDL_LOCATION;
        IsiPartnerService ss = new IsiPartnerService(wsdlURL, SERVICE_NAME);
        IsiPartnerInterface port = ss.getIsiPartnerPort();

        int counter = 0;
        while (counter < pullMaxRetries) {
            IsiPartnerPullResponse response = port.isiPartnerPull(createPullData(triggerId, config));
            if (response.getMessage() != null && response.getMessage().size() > 0) {
                byte[] byteContent = response.getMessage().get(0).getContent();
                GZIPInputStream inputStream = new GZIPInputStream(new ByteArrayInputStream(byteContent));
                ByteArrayOutputStream output = new ByteArrayOutputStream();
                IOUtils.copy(inputStream, output);
                return Optional.ofNullable(output.toByteArray());
            }

            try {
                Thread.sleep(pullRetryInterval);
            } catch (InterruptedException ignored) {
            }
            counter++;
        }
        return Optional.empty();
    }

    private IsiPartnerPull createPullData(String triggerId, IsiclientConfig config) {
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
