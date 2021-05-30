# FINT ISI client

Client for:  
https://isi.ist.com/isi/ws/ISIPartnerEndpoint?wsdl

## Installation

```groovy
repositories {
    maven {
        url "https://repo.fintlabs.no/releases"
    }
}

compile('no.fint:fint-isiclient:1.0.1')
```

## Usage

```java
IsiclientConfig config = new IsicientConfig();
config.setFilePath("...");
config.setSourceSystemId("...");
config.setSourceSystemName("...");
config.setSourceSystemType("...");
config.setDestSystemId("...");
config.setDestSystemName("...");
config.setDestSystemType("...");
config.setPassword("...");
config.setPassword("...");
config.setParameters(parameters);

FintIsiclient client = new FintIsiclient();
boolean created = client.createFile(config);
```

## Integration tests

To enable integration tests (`FintIsiclientIntegrationSpec`):  
1) Set the system property `integrationTestsEnabled=true`.  
2) Add the file `integrationtest.properties` to src/test/resources and set the system property. The file should contains these properties:  
```properties
password=
sourceSystemId=
sourceSystemName=
sourceSystemType=
destSystemId=
destSystemName=
destSystemType=
```
