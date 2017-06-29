package no.fint.isiclient.testutils

class IntegrationProperties {
    public static final boolean FILE_DOES_NOT_EXIST = fileDoesNotExist()

    static boolean fileDoesNotExist() {
        def resource = Thread.currentThread().getContextClassLoader().getResource('integrationtest.properties')
        return (resource == null)
    }

}
