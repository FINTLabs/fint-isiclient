package no.fint.isiclient

import spock.lang.Specification

class FintIsiclientSpec extends Specification {

    def "IsiPartnerPush isiTrigger"() {
        when:
        def fintIsiclient = new FintIsiclient()
        fintIsiclient.trigger()

        then:
        noExceptionThrown()
    }
}
