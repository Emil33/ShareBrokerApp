
package users;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UserSearch", targetNamespace = "http://users/", wsdlLocation = "http://localhost:8080/UserApplication/UserSearch?wsdl")
public class UserSearch_Service
    extends Service
{

    private final static URL USERSEARCH_WSDL_LOCATION;
    private final static WebServiceException USERSEARCH_EXCEPTION;
    private final static QName USERSEARCH_QNAME = new QName("http://users/", "UserSearch");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/UserApplication/UserSearch?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERSEARCH_WSDL_LOCATION = url;
        USERSEARCH_EXCEPTION = e;
    }

    public UserSearch_Service() {
        super(__getWsdlLocation(), USERSEARCH_QNAME);
    }

    public UserSearch_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERSEARCH_QNAME, features);
    }

    public UserSearch_Service(URL wsdlLocation) {
        super(wsdlLocation, USERSEARCH_QNAME);
    }

    public UserSearch_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERSEARCH_QNAME, features);
    }

    public UserSearch_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserSearch_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UserSearch
     */
    @WebEndpoint(name = "UserSearchPort")
    public UserSearch getUserSearchPort() {
        return super.getPort(new QName("http://users/", "UserSearchPort"), UserSearch.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserSearch
     */
    @WebEndpoint(name = "UserSearchPort")
    public UserSearch getUserSearchPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://users/", "UserSearchPort"), UserSearch.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERSEARCH_EXCEPTION!= null) {
            throw USERSEARCH_EXCEPTION;
        }
        return USERSEARCH_WSDL_LOCATION;
    }

}