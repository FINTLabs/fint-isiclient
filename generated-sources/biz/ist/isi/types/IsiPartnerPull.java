
package biz.ist.isi.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isiPartnerPull complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isiPartnerPull"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="system" type="{http://isi.ist.biz/types}isiSystem"/&gt;
 *         &lt;element name="fetchSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="serverResendTimeout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ignoreMessage" type="{http://isi.ist.biz/types}isiMessageRegistered" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ignoreTrigger" type="{http://isi.ist.biz/types}isiTriggerRegistered" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="responseToMessage" type="{http://isi.ist.biz/types}isiMessageRegistered" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="responseToTrigger" type="{http://isi.ist.biz/types}isiTriggerRegistered" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="statusMessage" type="{http://isi.ist.biz/types}isiMessageRegistered" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="statusTrigger" type="{http://isi.ist.biz/types}isiTriggerRegistered" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isiPartnerPull", propOrder = {
    "version",
    "system",
    "fetchSize",
    "timeout",
    "serverResendTimeout",
    "ignoreMessage",
    "ignoreTrigger",
    "responseToMessage",
    "responseToTrigger",
    "statusMessage",
    "statusTrigger"
})
public class IsiPartnerPull {

    protected Integer version;
    @XmlElement(required = true)
    protected IsiSystem system;
    protected int fetchSize;
    protected Integer timeout;
    protected Integer serverResendTimeout;
    protected List<IsiMessageRegistered> ignoreMessage;
    protected List<IsiTriggerRegistered> ignoreTrigger;
    protected List<IsiMessageRegistered> responseToMessage;
    protected List<IsiTriggerRegistered> responseToTrigger;
    protected List<IsiMessageRegistered> statusMessage;
    protected List<IsiTriggerRegistered> statusTrigger;

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
     * Gets the value of the fetchSize property.
     * 
     */
    public int getFetchSize() {
        return fetchSize;
    }

    /**
     * Sets the value of the fetchSize property.
     * 
     */
    public void setFetchSize(int value) {
        this.fetchSize = value;
    }

    /**
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeout(Integer value) {
        this.timeout = value;
    }

    /**
     * Gets the value of the serverResendTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServerResendTimeout() {
        return serverResendTimeout;
    }

    /**
     * Sets the value of the serverResendTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServerResendTimeout(Integer value) {
        this.serverResendTimeout = value;
    }

    /**
     * Gets the value of the ignoreMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ignoreMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIgnoreMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IsiMessageRegistered }
     * 
     * 
     */
    public List<IsiMessageRegistered> getIgnoreMessage() {
        if (ignoreMessage == null) {
            ignoreMessage = new ArrayList<IsiMessageRegistered>();
        }
        return this.ignoreMessage;
    }

    /**
     * Gets the value of the ignoreTrigger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ignoreTrigger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIgnoreTrigger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IsiTriggerRegistered }
     * 
     * 
     */
    public List<IsiTriggerRegistered> getIgnoreTrigger() {
        if (ignoreTrigger == null) {
            ignoreTrigger = new ArrayList<IsiTriggerRegistered>();
        }
        return this.ignoreTrigger;
    }

    /**
     * Gets the value of the responseToMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseToMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseToMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IsiMessageRegistered }
     * 
     * 
     */
    public List<IsiMessageRegistered> getResponseToMessage() {
        if (responseToMessage == null) {
            responseToMessage = new ArrayList<IsiMessageRegistered>();
        }
        return this.responseToMessage;
    }

    /**
     * Gets the value of the responseToTrigger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseToTrigger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseToTrigger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IsiTriggerRegistered }
     * 
     * 
     */
    public List<IsiTriggerRegistered> getResponseToTrigger() {
        if (responseToTrigger == null) {
            responseToTrigger = new ArrayList<IsiTriggerRegistered>();
        }
        return this.responseToTrigger;
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
     * {@link IsiMessageRegistered }
     * 
     * 
     */
    public List<IsiMessageRegistered> getStatusMessage() {
        if (statusMessage == null) {
            statusMessage = new ArrayList<IsiMessageRegistered>();
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
     * {@link IsiTriggerRegistered }
     * 
     * 
     */
    public List<IsiTriggerRegistered> getStatusTrigger() {
        if (statusTrigger == null) {
            statusTrigger = new ArrayList<IsiTriggerRegistered>();
        }
        return this.statusTrigger;
    }

}
