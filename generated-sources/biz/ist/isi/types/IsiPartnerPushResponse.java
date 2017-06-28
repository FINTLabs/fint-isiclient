
package biz.ist.isi.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isiPartnerPushResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isiPartnerPushResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="messageRegistered" type="{http://isi.ist.biz/types}isiMessageRegistered" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="triggerRegistered" type="{http://isi.ist.biz/types}isiTriggerRegistered" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isiPartnerPushResponse", propOrder = {
    "messageRegistered",
    "triggerRegistered"
})
public class IsiPartnerPushResponse {

    protected List<IsiMessageRegistered> messageRegistered;
    protected List<IsiTriggerRegistered> triggerRegistered;

    /**
     * Gets the value of the messageRegistered property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageRegistered property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageRegistered().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IsiMessageRegistered }
     * 
     * 
     */
    public List<IsiMessageRegistered> getMessageRegistered() {
        if (messageRegistered == null) {
            messageRegistered = new ArrayList<IsiMessageRegistered>();
        }
        return this.messageRegistered;
    }

    /**
     * Gets the value of the triggerRegistered property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the triggerRegistered property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTriggerRegistered().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IsiTriggerRegistered }
     * 
     * 
     */
    public List<IsiTriggerRegistered> getTriggerRegistered() {
        if (triggerRegistered == null) {
            triggerRegistered = new ArrayList<IsiTriggerRegistered>();
        }
        return this.triggerRegistered;
    }

}
