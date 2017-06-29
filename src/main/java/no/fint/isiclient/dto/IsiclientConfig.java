package no.fint.isiclient.dto;

import lombok.Data;

@Data
public class IsiclientConfig {
    private String filePath;

    private String serviceClass = "imsService";
    private String messageClass = "IMS2013";

    private String sourceSystemId;
    private String sourceSystemName;
    private String sourceSystemType;

    private String destSystemId;
    private String destSystemName;
    private String destSystemType;

    private String password;

    private String key;
    private String value;
}
