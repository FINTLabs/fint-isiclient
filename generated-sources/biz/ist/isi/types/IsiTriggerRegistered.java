
package biz.ist.isi.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isiTriggerRegistered complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isiTriggerRegistered"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="source" type="{http://isi.ist.biz/types}isiSystem"/&gt;
 *         &lt;element name="dest" type="{http://isi.ist.biz/types}isiSystem"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="serviceClass" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="messageClass" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="triggerId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isiTriggerRegistered", propOrder = {
    "source",
    "dest"
})
public class IsiTriggerRegistered {

    @XmlElement(required = true)
    protected IsiSystem source;
    @XmlElement(required = true)
    protected IsiSystem dest;
    @XmlAttribute(name = "serviceClass", required = true)
    protected String serviceClass;
    @XmlAttribute(name = "messageClass", required = true)
    protected String messageClass;
    @XmlAttribute(name = "triggerId", required = true)
    protected String triggerId;

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

}
