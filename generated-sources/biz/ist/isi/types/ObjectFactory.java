
package biz.ist.isi.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the biz.ist.isi.types package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IsiPartnerPull_QNAME = new QName("http://isi.ist.biz/types", "isiPartnerPull");
    private final static QName _IsiPartnerPullResponse_QNAME = new QName("http://isi.ist.biz/types", "isiPartnerPullResponse");
    private final static QName _IsiPartnerPush_QNAME = new QName("http://isi.ist.biz/types", "isiPartnerPush");
    private final static QName _IsiPartnerPushResponse_QNAME = new QName("http://isi.ist.biz/types", "isiPartnerPushResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: biz.ist.isi.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IsiPartnerPull }
     * 
     */
    public IsiPartnerPull createIsiPartnerPull() {
        return new IsiPartnerPull();
    }

    /**
     * Create an instance of {@link IsiPartnerPullResponse }
     * 
     */
    public IsiPartnerPullResponse createIsiPartnerPullResponse() {
        return new IsiPartnerPullResponse();
    }

    /**
     * Create an instance of {@link IsiPartnerPush }
     * 
     */
    public IsiPartnerPush createIsiPartnerPush() {
        return new IsiPartnerPush();
    }

    /**
     * Create an instance of {@link IsiPartnerPushResponse }
     * 
     */
    public IsiPartnerPushResponse createIsiPartnerPushResponse() {
        return new IsiPartnerPushResponse();
    }

    /**
     * Create an instance of {@link IsiSystem }
     * 
     */
    public IsiSystem createIsiSystem() {
        return new IsiSystem();
    }

    /**
     * Create an instance of {@link IsiMessageRegistered }
     * 
     */
    public IsiMessageRegistered createIsiMessageRegistered() {
        return new IsiMessageRegistered();
    }

    /**
     * Create an instance of {@link IsiTriggerRegistered }
     * 
     */
    public IsiTriggerRegistered createIsiTriggerRegistered() {
        return new IsiTriggerRegistered();
    }

    /**
     * Create an instance of {@link IsiMessage }
     * 
     */
    public IsiMessage createIsiMessage() {
        return new IsiMessage();
    }

    /**
     * Create an instance of {@link IsiLogline }
     * 
     */
    public IsiLogline createIsiLogline() {
        return new IsiLogline();
    }

    /**
     * Create an instance of {@link IsiTrigger }
     * 
     */
    public IsiTrigger createIsiTrigger() {
        return new IsiTrigger();
    }

    /**
     * Create an instance of {@link IsiParam }
     * 
     */
    public IsiParam createIsiParam() {
        return new IsiParam();
    }

    /**
     * Create an instance of {@link IsiMessageProcessed }
     * 
     */
    public IsiMessageProcessed createIsiMessageProcessed() {
        return new IsiMessageProcessed();
    }

    /**
     * Create an instance of {@link IsiTriggerProcessed }
     * 
     */
    public IsiTriggerProcessed createIsiTriggerProcessed() {
        return new IsiTriggerProcessed();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsiPartnerPull }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isi.ist.biz/types", name = "isiPartnerPull")
    public JAXBElement<IsiPartnerPull> createIsiPartnerPull(IsiPartnerPull value) {
        return new JAXBElement<IsiPartnerPull>(_IsiPartnerPull_QNAME, IsiPartnerPull.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsiPartnerPullResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isi.ist.biz/types", name = "isiPartnerPullResponse")
    public JAXBElement<IsiPartnerPullResponse> createIsiPartnerPullResponse(IsiPartnerPullResponse value) {
        return new JAXBElement<IsiPartnerPullResponse>(_IsiPartnerPullResponse_QNAME, IsiPartnerPullResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsiPartnerPush }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isi.ist.biz/types", name = "isiPartnerPush")
    public JAXBElement<IsiPartnerPush> createIsiPartnerPush(IsiPartnerPush value) {
        return new JAXBElement<IsiPartnerPush>(_IsiPartnerPush_QNAME, IsiPartnerPush.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsiPartnerPushResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isi.ist.biz/types", name = "isiPartnerPushResponse")
    public JAXBElement<IsiPartnerPushResponse> createIsiPartnerPushResponse(IsiPartnerPushResponse value) {
        return new JAXBElement<IsiPartnerPushResponse>(_IsiPartnerPushResponse_QNAME, IsiPartnerPushResponse.class, null, value);
    }

}
