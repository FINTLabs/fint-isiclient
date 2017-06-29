# FINT ISI client

[![Build Status](https://travis-ci.org/FINTlibs/fint-isiclient.svg?branch=master)](https://travis-ci.org/FINTlibs/fint-isiclient)

Client for:  
https://isi.ist.com/isi/ws/ISIPartnerEndpoint?wsdl

## Installation

```groovy
repositories {
    maven {
        url  "http://dl.bintray.com/fint/maven" 
    }
}

compile('no.fint:fint-isiclient:0.0.1')
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
config.setKey("...");
config.setValue("...");

FintIsiclient client = new FintIsiclient();
boolean created = client.createFile(config);
```

## Integration tests

To enable integration tests (`FintIsiclientIntegrationSpec`) add the file `integrationtest.properties` to src/test/resources.
The file should contains these properties:  

```properties
password=
sourceSystemId=
sourceSystemName=
sourceSystemType=
destSystemId=
destSystemName=
destSystemType=
key=
value=
```