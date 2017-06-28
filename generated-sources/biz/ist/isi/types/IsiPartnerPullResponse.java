
package biz.ist.isi.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isiPartnerPullResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isiPartnerPullResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="loglevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://isi.ist.biz/types}isiMessage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="trigger" type="{http://isi.ist.biz/types}isiTrigger" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="statusMessage" type="{http://isi.ist.biz/types}isiMessage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="statusTrigger" type="{http://isi.ist.biz/types}isiTrigger" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isiPartnerPullResponse", propOrder = {
    "loglevel",
    "message",
    "trigger",
    "statusMessage",
    "statusTrigger"
})
public class IsiPartnerPullResponse {

    protected String loglevel;
    protected List<IsiMessage> message;
    protected List<IsiTrigger> trigger;
    protected List<IsiMessage> statusMessage;
    protected List<IsiTrigger> statusTrigger;

    /**
     * Gets the value of the loglevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoglevel() {
        return loglevel;
    }

    /**
     * Sets the value of the loglevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoglevel(String value) {
        this.loglevel = value;
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
     * Gets the value of the statusMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IsiMessage }
     * 
     * 
     */
    public List<IsiMessage> getStatusMessage() {
        if (statusMessage == null) {
            statusMessage = new ArrayList<IsiMessage>();
        }
        return this.statusMessage;
    }

    /**
     * Gets the value of the statusTrigger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusTrigger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusTrigger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IsiTrigger }
     * 
     * 
     */
    public List<IsiTrigger> getStatusTrigger() {
        if (statusTrigger == null) {
            statusTrigger = new ArrayList<IsiTrigger>();
        }
        return this.statusTrigger;
    }

}
