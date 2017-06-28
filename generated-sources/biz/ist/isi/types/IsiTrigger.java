
package biz.ist.isi.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for isiTrigger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isiTrigger"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="source" type="{http://isi.ist.biz/types}isiSystem"/&gt;
 *         &lt;element name="dest" type="{http://isi.ist.biz/types}isiSystem"/&gt;
 *         &lt;element name="param" type="{http://isi.ist.biz/types}isiParam" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="logline" type="{http://isi.ist.biz/types}isiLogline" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="responseToMessage" type="{http://isi.ist.biz/types}isiMessageRegistered" minOccurs="0"/&gt;
 *         &lt;element name="responseToTrigger" type="{http://isi.ist.biz/types}isiTriggerRegistered" minOccurs="0"/&gt;
 *         &lt;element name="tsCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="tsExpires" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="serviceClass" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="messageClass" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="triggerId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isiTrigger", propOrder = {
    "source",
    "dest",
    "param",
    "logline",
    "responseToMessage",
    "responseToTrigger",
    "tsCreated",
    "tsExpires"
})
public class IsiTrigger {

    @XmlElement(required = true)
    protected IsiSystem source;
    @XmlElement(required = true)
    protected IsiSystem dest;
    @XmlElement(nillable = true)
    protected List<IsiParam> param;
    @XmlElement(nillable = true)
    protected List<IsiLogline> logline;
    protected IsiMessageRegistered responseToMessage;
    protected IsiTriggerRegistered responseToTrigger;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tsCreated;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tsExpires;
    @XmlAttribute(name = "serviceClass", required = true)
    protected String serviceClass;
    @XmlAttribute(name = "messageClass", required = true)
    protected String messageClass;
    @XmlAttribute(name = "triggerId")
    protected String triggerId;
    @XmlAttribute(name = "status")
    protected String status;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link IsiSystem }
     *     
     */
    public IsiSystem getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsiSystem }
     *     
     */
    public void setSource(IsiSystem value) {
        this.source = value;
    }

    /**
     * Gets the value of the dest property.
     * 
     * @return
     *     possible object is
     *     {@link IsiSystem }
     *     
     */
    public IsiSystem getDest() {
        return dest;
    }

    /**
     * Sets the value of the dest property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsiSystem }
     *     
     */
    public void setDest(IsiSystem value) {
        this.dest = value;
    }

    /**
     * Gets the value of the param property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the param property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IsiParam }
     * 
     * 
     */
    public List<IsiParam> getParam() {
        if (param == null) {
            param = new ArrayList<IsiParam>();
        }
        return this.param;
    }

    /**
     * Gets the value of the logline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IsiLogline }
     * 
     * 
     */
    public List<IsiLogline> getLogline() {
        if (logline == null) {
            logline = new ArrayList<IsiLogline>();
        }
        return this.logline;
    }

    /**
     * Gets the value of the responseToMessage property.
     * 
     * @return
     *     possible object is
     *     {@link IsiMessageRegistered }
     *     
     */
    public IsiMessageRegistered getResponseToMessage() {
        return responseToMessage;
    }

    /**
     * Sets the value of the responseToMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsiMessageRegistered }
     *     
     */
    public void setResponseToMessage(IsiMessageRegistered value) {
        this.responseToMessage = value;
    }

    /**
     * Gets the value of the responseToTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link IsiTriggerRegistered }
     *     
     */
    public IsiTriggerRegistered getResponseToTrigger() {
        return responseToTrigger;
    }

    /**
     * Sets the value of the responseToTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsiTriggerRegistered }
     *     
     */
    public void setResponseToTrigger(IsiTriggerRegistered value) {
        this.responseToTrigger = value;
    }

    /**
     * Gets the value of the tsCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTsCreated() {
        return tsCreated;
    }

    /**
     * Sets the value of the tsCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTsCreated(XMLGregorianCalendar value) {
        this.tsCreated = value;
    }

    /**
     * Gets the value of the tsExpires property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTsExpires() {
        return tsExpires;
    }

    /**
     * Sets the value of the tsExpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTsExpires(XMLGregorianCalendar value) {
        this.tsExpires = value;
    }

    /**
     * Gets the value of the serviceClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceClass() {
        return serviceClass;
    }

    /**
     * Sets the value of the serviceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceClass(String value) {
        this.serviceClass = value;
    }

    /**
     * Gets the value of the messageClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageClass() {
        return messageClass;
    }

    /**
     * Sets the value of the messageClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageClass(String value) {
        this.messageClass = value;
    }

    /**
     * Gets the value of the triggerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggerId() {
        return triggerId;
    }

    /**
     * Sets the value of the triggerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggerId(String value) {
        this.triggerId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
