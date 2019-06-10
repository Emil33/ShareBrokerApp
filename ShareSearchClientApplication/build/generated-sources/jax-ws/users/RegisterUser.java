
package users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisterUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="moneyValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="moneyCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterUser", propOrder = {
    "moneyValue",
    "moneyCurrency",
    "userName",
    "userPassword"
})
public class RegisterUser {

    protected double moneyValue;
    protected String moneyCurrency;
    protected String userName;
    protected String userPassword;

    /**
     * Gets the value of the moneyValue property.
     * 
     */
    public double getMoneyValue() {
        return moneyValue;
    }

    /**
     * Sets the value of the moneyValue property.
     * 
     */
    public void setMoneyValue(double value) {
        this.moneyValue = value;
    }

    /**
     * Gets the value of the moneyCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneyCurrency() {
        return moneyCurrency;
    }

    /**
     * Sets the value of the moneyCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneyCurrency(String value) {
        this.moneyCurrency = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the userPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * Sets the value of the userPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPassword(String value) {
        this.userPassword = value;
    }

}
