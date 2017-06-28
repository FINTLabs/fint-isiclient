
package biz.ist.isi.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isiPartnerPush complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isiPartnerPush"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="system" type="{http://isi.ist.biz/types}isiSystem" minOccurs="0"/&gt;
 *         &lt;element name="messageProcessed" type="{http://isi.ist.biz/types}isiMessageProcessed" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://isi.ist.biz/types}isiMessage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="triggerProcessed" type="{http://isi.ist.biz/types}isiTriggerProcessed" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="trigger" type="{http://isi.ist.biz/types}isiTrigger" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="logline" type="{http://isi.ist.biz/types}isiLogline" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isiPartnerPush", propOrder = {
    "version",
    "system",
    "messageProcessed",
    "message",
    "triggerProcessed",
    "trigger",
    "logline"
})
public class IsiPartnerPush {

    protected Integer version;
    protected IsiSystem system;
    protected List<IsiMessageProcessed> messageProcessed;
    protected List<IsiMessage> message;
    protected List<IsiTriggerProcessed> triggerProcessed;
    protected List<IsiTrigger> trigger;
    protected List<IsiLogline> logline;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link IsiSystem }
     *     
     */
    public IsiSystem getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsiSystem }
     *     
     */
    public void setSystem(IsiSystem value) {
        this.system = value;
    }

    /**
     * Gets the value of the messageProcessed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageProcessed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageProcessed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IsiMessageProcessed }
     * 
     * 
     */
    public List<IsiMessageProcessed> getMessageProcessed() {
        if (messageProcessed == null) {
            messageProcessed = new ArrayList<IsiMessageProcessed>();
        }
        return this.messageProcessed;
    }

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IsiMessage }
     * 
     * 
     */
    public List<IsiMessage> getMessage() {
        if (message == null) {
            message = new ArrayList<IsiMessage>();
        }
        return this.message;
    }

    /**
     * Gets the value of the triggerProcessed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the triggerProcessed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTriggerProcessed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IsiTriggerProcessed }
     * 
     * 
     */
    public List<IsiTriggerProcessed> getTriggerProcessed() {
        if (triggerProcessed == null) {
            triggerProcessed = new ArrayList<IsiTriggerProcessed>();
        }
        return this.triggerProcessed;
    }

    /**
     * Gets the value of the trigger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trigger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrigger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IsiTrigger }
     * 
     * 
     */
    public List<IsiTrigger> getTrigger() {
        if (trigger == null) {
            trigger = new ArrayList<IsiTrigger>();
        }
        return this.trigger;
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

}
