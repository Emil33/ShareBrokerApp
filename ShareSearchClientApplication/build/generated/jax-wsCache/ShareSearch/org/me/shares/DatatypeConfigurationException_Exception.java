
package org.me.shares;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "DatatypeConfigurationException", targetNamespace = "http://shares.me.org/")
public class DatatypeConfigurationException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private DatatypeConfigurationException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public DatatypeConfigurationException_Exception(String message, DatatypeConfigurationException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public DatatypeConfigurationException_Exception(String message, DatatypeConfigurationException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.me.shares.DatatypeConfigurationException
     */
    public DatatypeConfigurationException getFaultInfo() {
        return faultInfo;
    }

}
