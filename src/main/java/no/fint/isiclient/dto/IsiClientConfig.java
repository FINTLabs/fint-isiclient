package no.fint.isiclient.dto;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class IsiClientConfig {
    private String filePath;

    private String serviceClass = "imsService";
    private String messageClass = "IMS2013";

    private String sourceSystemId;
    private String sourceSystemName;
    private String sourceSystemType = "INTEGRATION_PARTNER";

    private String destSystemId;
    private String destSystemName = "FINTLABS";
    private String destSystemType = "INTEGRATION_PARTNER";

    private String password;

    private Map<String, String> parameters = new HashMap<>();


}
