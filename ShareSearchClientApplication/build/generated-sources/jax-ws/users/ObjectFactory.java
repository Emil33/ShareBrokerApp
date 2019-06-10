
package users;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the users package. 
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

    private final static QName _GetOwnedSharesResponse_QNAME = new QName("http://users/", "GetOwnedSharesResponse");
    private final static QName _RegisterUserResponse_QNAME = new QName("http://users/", "RegisterUserResponse");
    private final static QName _ShareDeletedReturnMoney_QNAME = new QName("http://users/", "ShareDeletedReturnMoney");
    private final static QName _UpdateOwnedSharesSellResponse_QNAME = new QName("http://users/", "UpdateOwnedSharesSellResponse");
    private final static QName _UpdateOwnedSharesBuyResponse_QNAME = new QName("http://users/", "UpdateOwnedSharesBuyResponse");
    private final static QName _RemoveUserResponse_QNAME = new QName("http://users/", "RemoveUserResponse");
    private final static QName _GetUsers_QNAME = new QName("http://users/", "GetUsers");
    private final static QName _RegisterUser_QNAME = new QName("http://users/", "RegisterUser");
    private final static QName _GiveAdminPermissionResponse_QNAME = new QName("http://users/", "GiveAdminPermissionResponse");
    private final static QName _ShareDeletedReturnMoneyResponse_QNAME = new QName("http://users/", "ShareDeletedReturnMoneyResponse");
    private final static QName _GiveAdminPermission_QNAME = new QName("http://users/", "GiveAdminPermission");
    private final static QName _UpdateOwnedSharesSell_QNAME = new QName("http://users/", "UpdateOwnedSharesSell");
    private final static QName _UpdateOwnedSharesBuy_QNAME = new QName("http://users/", "UpdateOwnedSharesBuy");
    private final static QName _GetOwnedShares_QNAME = new QName("http://users/", "GetOwnedShares");
    private final static QName _GetUsersResponse_QNAME = new QName("http://users/", "GetUsersResponse");
    private final static QName _RemoveUser_QNAME = new QName("http://users/", "RemoveUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: users
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateOwnedSharesBuy }
     * 
     */
    public UpdateOwnedSharesBuy createUpdateOwnedSharesBuy() {
        return new UpdateOwnedSharesBuy();
    }

    /**
     * Create an instance of {@link UpdateOwnedSharesSell }
     * 
     */
    public UpdateOwnedSharesSell createUpdateOwnedSharesSell() {
        return new UpdateOwnedSharesSell();
    }

    /**
     * Create an instance of {@link GetOwnedShares }
     * 
     */
    public GetOwnedShares createGetOwnedShares() {
        return new GetOwnedShares();
    }

    /**
     * Create an instance of {@link GetUsersResponse }
     * 
     */
    public GetUsersResponse createGetUsersResponse() {
        return new GetUsersResponse();
    }

    /**
     * Create an instance of {@link RemoveUser }
     * 
     */
    public RemoveUser createRemoveUser() {
        return new RemoveUser();
    }

    /**
     * Create an instance of {@link GiveAdminPermission }
     * 
     */
    public GiveAdminPermission createGiveAdminPermission() {
        return new GiveAdminPermission();
    }

    /**
     * Create an instance of {@link GiveAdminPermissionResponse }
     * 
     */
    public GiveAdminPermissionResponse createGiveAdminPermissionResponse() {
        return new GiveAdminPermissionResponse();
    }

    /**
     * Create an instance of {@link ShareDeletedReturnMoneyResponse }
     * 
     */
    public ShareDeletedReturnMoneyResponse createShareDeletedReturnMoneyResponse() {
        return new ShareDeletedReturnMoneyResponse();
    }

    /**
     * Create an instance of {@link GetUsers }
     * 
     */
    public GetUsers createGetUsers() {
        return new GetUsers();
    }

    /**
     * Create an instance of {@link RegisterUser }
     * 
     */
    public RegisterUser createRegisterUser() {
        return new RegisterUser();
    }

    /**
     * Create an instance of {@link RemoveUserResponse }
     * 
     */
    public RemoveUserResponse createRemoveUserResponse() {
        return new RemoveUserResponse();
    }

    /**
     * Create an instance of {@link UpdateOwnedSharesBuyResponse }
     * 
     */
    public UpdateOwnedSharesBuyResponse createUpdateOwnedSharesBuyResponse() {
        return new UpdateOwnedSharesBuyResponse();
    }

    /**
     * Create an instance of {@link UpdateOwnedSharesSellResponse }
     * 
     */
    public UpdateOwnedSharesSellResponse createUpdateOwnedSharesSellResponse() {
        return new UpdateOwnedSharesSellResponse();
    }

    /**
     * Create an instance of {@link RegisterUserResponse }
     * 
     */
    public RegisterUserResponse createRegisterUserResponse() {
        return new RegisterUserResponse();
    }

    /**
     * Create an instance of {@link ShareDeletedReturnMoney }
     * 
     */
    public ShareDeletedReturnMoney createShareDeletedReturnMoney() {
        return new ShareDeletedReturnMoney();
    }

    /**
     * Create an instance of {@link GetOwnedSharesResponse }
     * 
     */
    public GetOwnedSharesResponse createGetOwnedSharesResponse() {
        return new GetOwnedSharesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOwnedSharesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://users/", name = "GetOwnedSharesResponse")
    public JAXBElement<GetOwnedSharesResponse> createGetOwnedSharesResponse(GetOwnedSharesResponse value) {
        return new JAXBElement<GetOwnedSharesResponse>(_GetOwnedSharesResponse_QNAME, GetOwnedSharesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://users/", name = "RegisterUserResponse")
    public JAXBElement<RegisterUserResponse> createRegisterUserResponse(RegisterUserResponse value) {
        return new JAXBElement<RegisterUserResponse>(_RegisterUserResponse_QNAME, RegisterUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShareDeletedReturnMoney }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://users/", name = "ShareDeletedReturnMoney")
    public JAXBElement<ShareDeletedReturnMoney> createShareDeletedReturnMoney(ShareDeletedReturnMoney value) {
        return new JAXBElement<ShareDeletedReturnMoney>(_ShareDeletedReturnMoney_QNAME, ShareDeletedReturnMoney.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOwnedSharesSellResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://users/", name = "UpdateOwnedSharesSellResponse")
    public JAXBElement<UpdateOwnedSharesSellResponse> createUpdateOwnedSharesSellResponse(UpdateOwnedSharesSellResponse value) {
        return new JAXBElement<UpdateOwnedSharesSellResponse>(_UpdateOwnedSharesSellResponse_QNAME, UpdateOwnedSharesSellResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOwnedSharesBuyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://users/", name = "UpdateOwnedSharesBuyResponse")
    public JAXBElement<UpdateOwnedSharesBuyResponse> createUpdateOwnedSharesBuyResponse(UpdateOwnedSharesBuyResponse value) {
        return new JAXBElement<UpdateOwnedSharesBuyResponse>(_UpdateOwnedSharesBuyResponse_QNAME, UpdateOwnedSharesBuyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://users/", name = "RemoveUserResponse")
    public JAXBElement<RemoveUserResponse> createRemoveUserResponse(RemoveUserResponse value) {
        return new JAXBElement<RemoveUserResponse>(_RemoveUserResponse_QNAME, RemoveUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://users/", name = "GetUsers")
    public JAXBElement<GetUsers> createGetUsers(GetUsers value) {
        return new JAXBElement<GetUsers>(_GetUsers_QNAME, GetUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://users/", name = "RegisterUser")
    public JAXBElement<RegisterUser> createRegisterUser(RegisterUser value) {
        return new JAXBElement<RegisterUser>(_RegisterUser_QNAME, RegisterUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiveAdminPermissionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://users/", name = "GiveAdminPermissionResponse")
    public JAXBElement<GiveAdminPermissionResponse> createGiveAdminPermissionResponse(GiveAdminPermissionResponse value) {
        return new JAXBElement<GiveAdminPermissionResponse>(_GiveAdminPermissionResponse_QNAME, GiveAdminPermissionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShareDeletedReturnMoneyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://users/", name = "ShareDeletedReturnMoneyResponse")
    public JAXBElement<ShareDeletedReturnMoneyResponse> createShareDeletedReturnMoneyResponse(ShareDeletedReturnMoneyResponse value) {
        return new JAXBElement<ShareDeletedReturnMoneyResponse>(_ShareDeletedReturnMoneyResponse_QNAME, ShareDeletedReturnMoneyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiveAdminPermission }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://users/", name = "GiveAdminPermission")
    public JAXBElement<GiveAdminPermission> createGiveAdminPermission(GiveAdminPermission value) {
        return new JAXBElement<GiveAdminPermission>(_GiveAdminPermission_QNAME, GiveAdminPermission.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOwnedSharesSell }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://users/", name = "UpdateOwnedSharesSell")
    public JAXBElement<UpdateOwnedSharesSell> createUpdateOwnedSharesSell(UpdateOwnedSharesSell value) {
        return new JAXBElement<UpdateOwnedSharesSell>(_UpdateOwnedSharesSell_QNAME, UpdateOwnedSharesSell.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOwnedSharesBuy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://users/", name = "UpdateOwnedSharesBuy")
    public JAXBElement<UpdateOwnedSharesBuy> createUpdateOwnedSharesBuy(UpdateOwnedSharesBuy value) {
        return new JAXBElement<UpdateOwnedSharesBuy>(_UpdateOwnedSharesBuy_QNAME, UpdateOwnedSharesBuy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOwnedShares }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://users/", name = "GetOwnedShares")
    public JAXBElement<GetOwnedShares> createGetOwnedShares(GetOwnedShares value) {
        return new JAXBElement<GetOwnedShares>(_GetOwnedShares_QNAME, GetOwnedShares.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://users/", name = "GetUsersResponse")
    public JAXBElement<GetUsersResponse> createGetUsersResponse(GetUsersResponse value) {
        return new JAXBElement<GetUsersResponse>(_GetUsersResponse_QNAME, GetUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://users/", name = "RemoveUser")
    public JAXBElement<RemoveUser> createRemoveUser(RemoveUser value) {
        return new JAXBElement<RemoveUser>(_RemoveUser_QNAME, RemoveUser.class, null, value);
    }

}
