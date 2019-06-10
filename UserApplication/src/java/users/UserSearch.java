/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import UserSchema.SharesOwned;
import UserSchema.SharesOwnedList;
import UserSchema.User;
import UserSchema.User.UserMoney;
import UserSchema.UserList;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import static jdk.nashorn.internal.objects.NativeMath.round;

/**
 *
 * @author EJ
 */
@WebService(serviceName = "UserSearch")
public class UserSearch {
        
    private ServiceFunctions servicefunction = new ServiceFunctions();
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "GetUsers")
    public List<User> GetUsers() {

        UserList userList = servicefunction.ReadUserFile();
        
        List<User> userObjects = userList.getUsers();
                       
        return userObjects;
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "GetOwnedShares")
    public List<SharesOwned> GetOwnedShares() {
        
        SharesOwnedList sharesOwnedList = servicefunction.ReadSharesOwnedFile();
        
        List<SharesOwned> sharesOwnedObjects = sharesOwnedList.getAllSharesOwned();
               
        return sharesOwnedObjects;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "RegisterUser")
    public String RegisterUser(@WebParam(name = "moneyValue") double moneyValue, @WebParam(name = "moneyCurrency") String moneyCurrency, @WebParam(name = "userName") String userName, @WebParam(name = "userPassword") String userPassword) {

        UserList userList = servicefunction.ReadUserFile();
        
        List<User> userObjects = userList.getUsers();
        
                // Create User instanse and add them to the 'userObjects' collection
                User user = new User();
                
                UserMoney money = new UserMoney();
                money.setValue(moneyValue);
                money.setCurrency(moneyCurrency);
                user.setUserMoney(money);
                user.setUserName(userName);
                user.setUserPassword(userPassword);
                userObjects.add(user);        
                
        servicefunction.WriteUserFile(userList);        
        
        String finishedMessage = "completed";
         
        return finishedMessage;    
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "RemoveUser")
    public String RemoveUser(@WebParam(name = "userName") String userName) {

        UserList userList = servicefunction.ReadUserFile();        
        List<User> userObjects = userList.getUsers();
        
        SharesOwnedList sharesOwnedList = servicefunction.ReadSharesOwnedFile();        
        List<SharesOwned> sharesOwnedObjects = sharesOwnedList.getAllSharesOwned();      
        
        //Removing user from the file
        User nextUser = new User();
            Iterator itrUser = userObjects.iterator();
            while(itrUser.hasNext()) {
                nextUser = (User) itrUser.next();
                if(nextUser.getUserName().equals(userName)) {
                    userObjects.remove(nextUser);
                    break;
                }
            }      
            
        boolean ownedShares = true;
            
        //Removing user owned share records
        while(ownedShares == true)
        {
            SharesOwned nextOwnedShare = new SharesOwned();
            Iterator itrShare = sharesOwnedObjects.iterator();
                while(itrShare.hasNext()) {
                    nextOwnedShare = (SharesOwned) itrShare.next();
                    if(nextOwnedShare.getUserNameOwned().equals(userName)) {                  

                       ownedShares = true;
                       break;
                    }
                    else
                    {
                        ownedShares = false;
                    }
                } 
                if(ownedShares == true)
                {                    
                    sharesOwnedObjects.remove(nextOwnedShare);
                }
        }

        servicefunction.WriteUserFile(userList);       
        servicefunction.WriteSharesOwnedFile(sharesOwnedList);
        
        String finishedMessage = "completed";
        
        return finishedMessage; 
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "UpdateOwnedSharesBuy")
    public String UpdateOwnedSharesBuy(@WebParam(name = "userName") String userName, @WebParam(name = "shareSymbol") String shareSymbol, @WebParam(name = "amountOfShares") int amountOfShares, @WebParam(name = "sharePrice") double sharePrice) {

        SharesOwnedList sharesOwnedList = servicefunction.ReadSharesOwnedFile();        
        List<SharesOwned> sharesOwnedObjects = sharesOwnedList.getAllSharesOwned();  
        
        UserList userList = servicefunction.ReadUserFile();        
        List<User> userObjects = userList.getUsers();
        
        boolean sharePresent = false;
        
        SharesOwned nextOwnedShare = new SharesOwned();
        Iterator itrShare = sharesOwnedObjects.iterator();
            while(itrShare.hasNext()) {
                nextOwnedShare = (SharesOwned) itrShare.next();
                if(nextOwnedShare.getShareSymbol().equals(shareSymbol) && nextOwnedShare.getUserNameOwned().equals(userName)) {                  
                    sharePresent = true;
                    break;
                }
            } 
            
        User nextUser = new User();
        Iterator itrUser = userObjects.iterator();
            while(itrUser.hasNext()) {
                nextUser = (User) itrUser.next();
                if(nextUser.getUserName().equals(userName)) {
                    break;
                }
            }  

            if(sharePresent)
            {
                //Setting the maximum number of decimal places
                NumberFormat format = NumberFormat.getInstance();
                format.setMaximumFractionDigits(2);
                
                //Calculate the average price paid for the shares
                double amountSpent = (nextOwnedShare.getAmount() * nextOwnedShare.getBoughtFor());
                double newAmountSpent = (amountOfShares * sharePrice);
                double totalSpent = amountSpent + newAmountSpent;
                
                double averagePrice = (totalSpent/(nextOwnedShare.getAmount() + amountOfShares));
                
                nextOwnedShare.setBoughtFor(Double.valueOf(format.format(averagePrice)));
                nextOwnedShare.setAmount((nextOwnedShare.getAmount() + amountOfShares));
                
            }
            else
            {
                    SharesOwned sharesOwned = new SharesOwned();

                    sharesOwned.setUserNameOwned(userName);
                    sharesOwned.setShareSymbol(shareSymbol);
                    sharesOwned.setAmount(amountOfShares);
                    sharesOwned.setBoughtFor(sharePrice);
                    sharesOwnedObjects.add(sharesOwned); 
            }   
            
            nextUser.getUserMoney().setValue((nextUser.getUserMoney().getValue() - (sharePrice * amountOfShares)));
            
        servicefunction.WriteSharesOwnedFile(sharesOwnedList);    
        servicefunction.WriteUserFile(userList);       
        
        String finishedMessage = "completed";
         
        return finishedMessage;        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "UpdateOwnedSharesSell")
    public String UpdateOwnedSharesSell(@WebParam(name = "userName") String userName, @WebParam(name = "shareSymbol") String shareSymbol, @WebParam(name = "amountOfShares") int amountOfShares, @WebParam(name = "sharePrice") double sharePrice) {

        SharesOwnedList sharesOwnedList = servicefunction.ReadSharesOwnedFile();        
        List<SharesOwned> sharesOwnedObjects = sharesOwnedList.getAllSharesOwned();  
        
        UserList userList = servicefunction.ReadUserFile();        
        List<User> userObjects = userList.getUsers();
        
        SharesOwned nextOwnedShare = new SharesOwned();
        Iterator itrShare = sharesOwnedObjects.iterator();
            while(itrShare.hasNext()) {
                nextOwnedShare = (SharesOwned) itrShare.next();
                if(nextOwnedShare.getShareSymbol().equals(shareSymbol) && nextOwnedShare.getUserNameOwned().equals(userName)) {                  
                    break;
                }
            } 
            
        User nextUser = new User();
        Iterator itrUser = userObjects.iterator();
            while(itrUser.hasNext()) {
                nextUser = (User) itrUser.next();
                if(nextUser.getUserName().equals(userName)) {
                    break;
                }
            }  

        nextOwnedShare.setAmount((nextOwnedShare.getAmount() - amountOfShares));

        //Detele the share record if the amount owned is 0
        if(nextOwnedShare.getAmount() == 0)
        {
            sharesOwnedObjects.remove(nextOwnedShare);
        }


        nextUser.getUserMoney().setValue(round(nextUser.getUserMoney().getValue() + (sharePrice * amountOfShares),2));
               
        servicefunction.WriteSharesOwnedFile(sharesOwnedList);    
        servicefunction.WriteUserFile(userList); 
         
        String finishedMessage = "completed";
         
        return finishedMessage;       
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "GiveAdminPermission")
    public String GiveAdminPermission(@WebParam(name = "userName") String userName, @WebParam(name = "adminPermission") boolean adminPermission) {

        UserList userList = servicefunction.ReadUserFile();        
        List<User> userObjects = userList.getUsers();
        
        User nextUser = new User();
        Iterator itrUser = userObjects.iterator();
            while(itrUser.hasNext()) {
                nextUser = (User) itrUser.next();
                if(nextUser.getUserName().equals(userName)) {
                    break;
                }
            }        
        
        if(adminPermission == true)
        {
            nextUser.setIsAdmin(true);
        }
        else
        {
            nextUser.setIsAdmin(false);
        }
        
        servicefunction.WriteUserFile(userList); 
         
        String finishedMessage = "completed";
         
        return finishedMessage; 
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ShareDeletedReturnMoney")
    public String ShareDeletedReturnMoney(@WebParam(name = "shareSymbol") String shareSymbol) {

        SharesOwnedList sharesOwnedList = servicefunction.ReadSharesOwnedFile();        
        List<SharesOwned> sharesOwnedObjects = sharesOwnedList.getAllSharesOwned();  
        
        UserList userList = servicefunction.ReadUserFile();        
        List<User> userObjects = userList.getUsers();
        
        boolean sharePresent = true;
 
        SharesOwned nextOwnedShare = new SharesOwned();
        Iterator itrShare = sharesOwnedObjects.iterator();
        
        User nextUser = new User();
        Iterator itrUser = userObjects.iterator();
        
        String finishedMessage = "completed";
        
        while(sharePresent == true)
        {
                while(itrShare.hasNext()) {
                    nextOwnedShare = (SharesOwned) itrShare.next();
                    if(nextOwnedShare.getShareSymbol().equals(shareSymbol)) {
                        sharePresent = true;
                        break;
                    }
                } 


                while(itrUser.hasNext()) {
                    nextUser = (User) itrUser.next();
                    if(nextUser.getUserName().equals(nextOwnedShare.getUserNameOwned())) {
                        break;
                    }
                }    

            double valueReturned = (nextOwnedShare.getAmount() * nextOwnedShare.getBoughtFor());
            nextUser.getUserMoney().setValue(round(nextUser.getUserMoney().getValue() + valueReturned,2));

            //finishedMessage = Double.toString(valueReturned);
            finishedMessage = "HERE";
            
            
            sharesOwnedObjects.remove(nextOwnedShare);

            sharePresent = false;
        }
        servicefunction.WriteSharesOwnedFile(sharesOwnedList);    
        servicefunction.WriteUserFile(userList); 
        
        
        
        return finishedMessage;
    }

}
