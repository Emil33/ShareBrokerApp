
package org.me.shares;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.me.shares package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuyShares_QNAME = new QName("http://shares.me.org/", "BuyShares");
    private final static QName _DisplayShares_QNAME = new QName("http://shares.me.org/", "DisplayShares");
    private final static QName _DatatypeConfigurationException_QNAME = new QName("http://shares.me.org/", "DatatypeConfigurationException");
    private final static QName _DisplaySharesResponse_QNAME = new QName("http://shares.me.org/", "DisplaySharesResponse");
    private final static QName _RemoveShare_QNAME = new QName("http://shares.me.org/", "RemoveShare");
    private final static QName _RemoveShareResponse_QNAME = new QName("http://shares.me.org/", "RemoveShareResponse");
    private final static QName _BuySharesResponse_QNAME = new QName("http://shares.me.org/", "BuySharesResponse");
    private final static QName _AddShareResponse_QNAME = new QName("http://shares.me.org/", "AddShareResponse");
    private final static QName _SellSharesResponse_QNAME = new QName("http://shares.me.org/", "SellSharesResponse");
    private final static QName _SellShares_QNAME = new QName("http://shares.me.org/", "SellShares");
    private final static QName _AddShare_QNAME = new QName("http://shares.me.org/", "AddShare");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.shares
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemoveShare }
     * 
     */
    public RemoveShare createRemoveShare() {
        return new RemoveShare();
    }

    /**
     * Create an instance of {@link DatatypeConfigurationException }
     * 
     */
    public DatatypeConfigurationException createDatatypeConfigurationException() {
        return new DatatypeConfigurationException();
    }

    /**
     * Create an instance of {@link DisplaySharesResponse }
     * 
     */
    public DisplaySharesResponse createDisplaySharesResponse() {
        return new DisplaySharesResponse();
    }

    /**
     * Create an instance of {@link DisplayShares }
     * 
     */
    public DisplayShares createDisplayShares() {
        return new DisplayShares();
    }

    /**
     * Create an instance of {@link BuyShares }
     * 
     */
    public BuyShares createBuyShares() {
        return new BuyShares();
    }

    /**
     * Create an instance of {@link BuySharesResponse }
     * 
     */
    public BuySharesResponse createBuySharesResponse() {
        return new BuySharesResponse();
    }

    /**
     * Create an instance of {@link RemoveShareResponse }
     * 
     */
    public RemoveShareResponse createRemoveShareResponse() {
        return new RemoveShareResponse();
    }

    /**
     * Create an instance of {@link SellSharesResponse }
     * 
     */
    public SellSharesResponse createSellSharesResponse() {
        return new SellSharesResponse();
    }

    /**
     * Create an instance of {@link AddShareResponse }
     * 
     */
    public AddShareResponse createAddShareResponse() {
        return new AddShareResponse();
    }

    /**
     * Create an instance of {@link AddShare }
     * 
     */
    public AddShare createAddShare() {
        return new AddShare();
    }

    /**
     * Create an instance of {@link SellShares }
     * 
     */
    public SellShares createSellShares() {
        return new SellShares();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuyShares }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares.me.org/", name = "BuyShares")
    public JAXBElement<BuyShares> createBuyShares(BuyShares value) {
        return new JAXBElement<BuyShares>(_BuyShares_QNAME, BuyShares.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayShares }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares.me.org/", name = "DisplayShares")
    public JAXBElement<DisplayShares> createDisplayShares(DisplayShares value) {
        return new JAXBElement<DisplayShares>(_DisplayShares_QNAME, DisplayShares.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatatypeConfigurationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares.me.org/", name = "DatatypeConfigurationException")
    public JAXBElement<DatatypeConfigurationException> createDatatypeConfigurationException(DatatypeConfigurationException value) {
        return new JAXBElement<DatatypeConfigurationException>(_DatatypeConfigurationException_QNAME, DatatypeConfigurationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplaySharesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares.me.org/", name = "DisplaySharesResponse")
    public JAXBElement<DisplaySharesResponse> createDisplaySharesResponse(DisplaySharesResponse value) {
        return new JAXBElement<DisplaySharesResponse>(_DisplaySharesResponse_QNAME, DisplaySharesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveShare }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares.me.org/", name = "RemoveShare")
    public JAXBElement<RemoveShare> createRemoveShare(RemoveShare value) {
        return new JAXBElement<RemoveShare>(_RemoveShare_QNAME, RemoveShare.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveShareResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares.me.org/", name = "RemoveShareResponse")
    public JAXBElement<RemoveShareResponse> createRemoveShareResponse(RemoveShareResponse value) {
        return new JAXBElement<RemoveShareResponse>(_RemoveShareResponse_QNAME, RemoveShareResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuySharesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares.me.org/", name = "BuySharesResponse")
    public JAXBElement<BuySharesResponse> createBuySharesResponse(BuySharesResponse value) {
        return new JAXBElement<BuySharesResponse>(_BuySharesResponse_QNAME, BuySharesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddShareResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares.me.org/", name = "AddShareResponse")
    public JAXBElement<AddShareResponse> createAddShareResponse(AddShareResponse value) {
        return new JAXBElement<AddShareResponse>(_AddShareResponse_QNAME, AddShareResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellSharesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares.me.org/", name = "SellSharesResponse")
    public JAXBElement<SellSharesResponse> createSellSharesResponse(SellSharesResponse value) {
        return new JAXBElement<SellSharesResponse>(_SellSharesResponse_QNAME, SellSharesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellShares }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares.me.org/", name = "SellShares")
    public JAXBElement<SellShares> createSellShares(SellShares value) {
        return new JAXBElement<SellShares>(_SellShares_QNAME, SellShares.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddShare }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares.me.org/", name = "AddShare")
    public JAXBElement<AddShare> createAddShare(AddShare value) {
        return new JAXBElement<AddShare>(_AddShare_QNAME, AddShare.class, null, value);
    }

}
