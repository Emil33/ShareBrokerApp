
package users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateOwnedSharesSell complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateOwnedSharesSell">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shareSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amountOfShares" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sharePrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateOwnedSharesSell", propOrder = {
    "userName",
    "shareSymbol",
    "amountOfShares",
    "sharePrice"
})
public class UpdateOwnedSharesSell {

    protected String userName;
    protected String shareSymbol;
    protected int amountOfShares;
    protected double sharePrice;

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
     * Gets the value of the amountOfShares property.
     * 
     */
    public int getAmountOfShares() {
        return amountOfShares;
    }

    /**
     * Sets the value of the amountOfShares property.
     * 
     */
    public void setAmountOfShares(int value) {
        this.amountOfShares = value;
    }

    /**
     * Gets the value of the sharePrice property.
     * 
     */
    public double getSharePrice() {
        return sharePrice;
    }

    /**
     * Sets the value of the sharePrice property.
     * 
     */
    public void setSharePrice(double value) {
        this.sharePrice = value;
    }

}
