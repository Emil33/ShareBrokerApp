
package org.me.shares;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellShares complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellShares">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shareSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amountOfShares" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellShares", propOrder = {
    "shareSymbol",
    "amountOfShares"
})
public class SellShares {

    protected String shareSymbol;
    protected int amountOfShares;

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

}
