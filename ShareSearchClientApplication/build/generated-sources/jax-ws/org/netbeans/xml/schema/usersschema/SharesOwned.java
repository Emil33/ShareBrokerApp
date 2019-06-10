
package org.netbeans.xml.schema.usersschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SharesOwned complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SharesOwned">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserNameOwned" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shareSymbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="boughtFor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharesOwned", propOrder = {
    "userNameOwned",
    "shareSymbol",
    "amount",
    "boughtFor"
})
public class SharesOwned {

    @XmlElement(name = "UserNameOwned", required = true)
    protected String userNameOwned;
    @XmlElement(required = true)
    protected String shareSymbol;
    protected int amount;
    protected double boughtFor;

    /**
     * Gets the value of the userNameOwned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserNameOwned() {
        return userNameOwned;
    }

    /**
     * Sets the value of the userNameOwned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserNameOwned(String value) {
        this.userNameOwned = value;
    }

    /**
     * Gets the value of the shareSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSymbol() {
        return shareSymbol;
    }

    /**
     * Sets the value of the shareSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSymbol(String value) {
        this.shareSymbol = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(int value) {
        this.amount = value;
    }

    /**
     * Gets the value of the boughtFor property.
     * 
     */
    public double getBoughtFor() {
        return boughtFor;
    }

    /**
     * Sets the value of the boughtFor property.
     * 
     */
    public void setBoughtFor(double value) {
        this.boughtFor = value;
    }

}
