package no.fint.isiclient;

import biz.ist.isi.types.IsiTrigger;
import biz.ist.isi.wsdl.IsiPartnerInterface;
import biz.ist.isi.wsdl.IsiPartnerService;

import javax.xml.namespace.QName;
import java.net.URL;

public class FintIsiclient {

    private static final QName SERVICE_NAME = new QName("http://isi.ist.biz/wsdl", "isiPartnerService");

    public void trigger() {
        URL wsdlURL = IsiPartnerService.WSDL_LOCATION;
        IsiPartnerService ss = new IsiPartnerService(wsdlURL, SERVICE_NAME);
        IsiPartnerInterface port = ss.getIsiPartnerPort();

        IsiTrigger trigger = new IsiTrigger();
    }
}
