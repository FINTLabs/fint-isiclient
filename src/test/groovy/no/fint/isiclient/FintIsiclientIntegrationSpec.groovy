package no.fint.isiclient

import no.fint.isiclient.dto.IsiClientConfig
import no.fint.isiclient.testutils.IntegrationProperties
import spock.lang.IgnoreIf
import spock.lang.Requires
import spock.lang.Specification

@Requires({ Boolean.valueOf(properties['integrationTestsEnabled']) })
@IgnoreIf({ IntegrationProperties.FILE_DOES_NOT_EXIST })
class FintIsiclientIntegrationSpec extends Specification {
    private IsiClientConfig config

    void setup() {
        def stream = Thread.currentThread().getContextClassLoader().getResourceAsStream('integrationtest.properties')
        def properties = new Properties()
        properties.load(stream)

        config = new IsiClientConfig()
        config.setPassword(properties.getProperty('password'))
        config.setSourceSystemId(properties.getProperty('sourceSystemId'))
        config.setSourceSystemName(properties.getProperty('sourceSystemName'))
        config.setSourceSystemType(properties.getProperty('sourceSystemType'))
        config.setDestSystemId(properties.getProperty('destSystemId'))
        config.setDestSystemName(properties.getProperty('destSystemName'))
        config.setDestSystemType(properties.getProperty('destSystemType'))
        config.setKey(properties.getProperty('key'))
        config.setValue(properties.getProperty('value'))
        config.setFilePath('build/tmp/test.xml')
    }

    def "Create file"() {
        when:
        def client = new FintIsiclient()
        def created = client.createFile(config)

        then:
        created
    }

    def "Get file content"() {
        when:
        def client = new FintIsiclient()
        def content = client.getFileContent(config)

        then:
        content != null
    }
}
