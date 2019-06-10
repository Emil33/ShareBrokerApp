/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import UserSchema.SharesOwnedList;
import UserSchema.UserList;
import java.io.File;

/**
 *
 * @author EJ
 */
public class ServiceFunctions {
    
    private String filePathUsers = "E:\\Year3UNI\\ServiceCentric\\UserApplication\\Users.txt";
    private String filePathSharesOwned = "E:\\Year3UNI\\ServiceCentric\\UserApplication\\SharesOwned.txt";   
    
    public UserList ReadUserFile() { 

        UserList userList = new UserList();               

        //Unmarshall the file and return the contents
        try {
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(userList.getClass().getPackage().getName());
            javax.xml.bind.Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
            userList = (UserList) unmarshaller.unmarshal(new java.io.File(filePathUsers)); //NOI18N
        } catch (javax.xml.bind.JAXBException ex) {
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
        }
        
        return userList;
    }

    public String WriteUserFile(UserList userList) {              

        try {
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(userList.getClass().getPackage().getName());
            javax.xml.bind.Marshaller marshaller = jaxbCtx.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            
            //Writing the whole XML document to file
            File storedShares = new File(filePathUsers);
            marshaller.marshal(userList, storedShares);
                                    
        } catch (javax.xml.bind.JAXBException ex) {
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
        }
        
        String finishedMessage = "completed";    
            
        return finishedMessage;
    }        
    
    public SharesOwnedList ReadSharesOwnedFile() { 

        SharesOwnedList sharesOwnedList = new SharesOwnedList();               

        //Unmarshall the file and return the contents
        try {
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(sharesOwnedList.getClass().getPackage().getName());
            javax.xml.bind.Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
            sharesOwnedList = (SharesOwnedList) unmarshaller.unmarshal(new java.io.File(filePathSharesOwned)); //NOI18N
        } catch (javax.xml.bind.JAXBException ex) {
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
        }
        
        return sharesOwnedList;
    }

    public String WriteSharesOwnedFile(SharesOwnedList sharesOwnedList) {              

        try {
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(sharesOwnedList.getClass().getPackage().getName());
            javax.xml.bind.Marshaller marshaller = jaxbCtx.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            
            //Writing the whole XML document to file
            File storedShares = new File(filePathSharesOwned);
            marshaller.marshal(sharesOwnedList, storedShares);
                                    
        } catch (javax.xml.bind.JAXBException ex) {
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
        }
        
        String finishedMessage = "completed";    
            
        return finishedMessage;
    }     
    
    
    
}
