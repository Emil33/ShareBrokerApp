
package org.me.shares;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.netbeans.xml.schema.sharesschema.Share;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ShareSearch", targetNamespace = "http://shares.me.org/")
@XmlSeeAlso({
    org.netbeans.xml.schema.sharesschema.ObjectFactory.class,
    org.me.shares.ObjectFactory.class
})
public interface ShareSearch {


    /**
     * 
     * @param amountOfShares
     * @param shareSymbol
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "BuyShares")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "BuyShares", targetNamespace = "http://shares.me.org/", className = "org.me.shares.BuyShares")
    @ResponseWrapper(localName = "BuySharesResponse", targetNamespace = "http://shares.me.org/", className = "org.me.shares.BuySharesResponse")
    @Action(input = "http://shares.me.org/ShareSearch/BuySharesRequest", output = "http://shares.me.org/ShareSearch/BuySharesResponse")
    public String buyShares(
        @WebParam(name = "shareSymbol", targetNamespace = "")
        String shareSymbol,
        @WebParam(name = "amountOfShares", targetNamespace = "")
        int amountOfShares);

    /**
     * 
     * @param amountOfShares
     * @param shareSymbol
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "SellShares")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SellShares", targetNamespace = "http://shares.me.org/", className = "org.me.shares.SellShares")
    @ResponseWrapper(localName = "SellSharesResponse", targetNamespace = "http://shares.me.org/", className = "org.me.shares.SellSharesResponse")
    @Action(input = "http://shares.me.org/ShareSearch/SellSharesRequest", output = "http://shares.me.org/ShareSearch/SellSharesResponse")
    public String sellShares(
        @WebParam(name = "shareSymbol", targetNamespace = "")
        String shareSymbol,
        @WebParam(name = "amountOfShares", targetNamespace = "")
        int amountOfShares);

    /**
     * 
     * @return
     *     returns java.util.List<org.netbeans.xml.schema.sharesschema.Share>
     */
    @WebMethod(operationName = "DisplayShares")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DisplayShares", targetNamespace = "http://shares.me.org/", className = "org.me.shares.DisplayShares")
    @ResponseWrapper(localName = "DisplaySharesResponse", targetNamespace = "http://shares.me.org/", className = "org.me.shares.DisplaySharesResponse")
    @Action(input = "http://shares.me.org/ShareSearch/DisplaySharesRequest", output = "http://shares.me.org/ShareSearch/DisplaySharesResponse")
    public List<Share> displayShares();

    /**
     * 
     * @param shareSymbol
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "RemoveShare")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "RemoveShare", targetNamespace = "http://shares.me.org/", className = "org.me.shares.RemoveShare")
    @ResponseWrapper(localName = "RemoveShareResponse", targetNamespace = "http://shares.me.org/", className = "org.me.shares.RemoveShareResponse")
    @Action(input = "http://shares.me.org/ShareSearch/RemoveShareRequest", output = "http://shares.me.org/ShareSearch/RemoveShareResponse")
    public String removeShare(
        @WebParam(name = "shareSymbol", targetNamespace = "")
        String shareSymbol);

    /**
     * 
     * @param companySymbol
     * @return
     *     returns java.lang.String
     * @throws DatatypeConfigurationException_Exception
     */
    @WebMethod(operationName = "AddShare")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "AddShare", targetNamespace = "http://shares.me.org/", className = "org.me.shares.AddShare")
    @ResponseWrapper(localName = "AddShareResponse", targetNamespace = "http://shares.me.org/", className = "org.me.shares.AddShareResponse")
    @Action(input = "http://shares.me.org/ShareSearch/AddShareRequest", output = "http://shares.me.org/ShareSearch/AddShareResponse", fault = {
        @FaultAction(className = DatatypeConfigurationException_Exception.class, value = "http://shares.me.org/ShareSearch/AddShare/Fault/DatatypeConfigurationException")
    })
    public String addShare(
        @WebParam(name = "companySymbol", targetNamespace = "")
        String companySymbol)
        throws DatatypeConfigurationException_Exception
    ;

}