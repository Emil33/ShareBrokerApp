/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.shares;

import ShareSchema.Share;
import ShareSchema.ShareList;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author EJ
 */
@WebService(serviceName = "ShareSearch")
@Stateless()
public class ShareSearch {

    private ServiceFunctions servicefunction = new ServiceFunctions();
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "DisplayShares")
    public List<Share> DisplayShares() {
                
        ShareList shareList = servicefunction.ReadShareFile();
        
        List<Share> shareObjects = shareList.getShares();
                        
        return shareObjects;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "BuyShares")
    public String BuyShares(@WebParam(name = "shareSymbol") String shareSymbol, @WebParam(name = "amountOfShares") int amountOfShares) {
        
        ShareList shareList = servicefunction.ReadShareFile();
        
        List<Share> shareObjects = shareList.getShares();
                        
        Share nextShare = new Share();
            Iterator itr = shareObjects.iterator();
            while(itr.hasNext()) {
                nextShare = (Share) itr.next();
                if(nextShare.getCompanySymbol().equals(shareSymbol)) {
                    nextShare.setAvailableShares((nextShare.getAvailableShares() - amountOfShares));
                }
            }             
        
        servicefunction.WriteShareFile(shareList);   
                          
        String finishedMessage = "completed";
        
        return finishedMessage;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "SellShares")
    public String SellShares(@WebParam(name = "shareSymbol") String shareSymbol, @WebParam(name = "amountOfShares") int amountOfShares) {
        
        ShareList shareList = servicefunction.ReadShareFile();
        
        List<Share> shareObjects = shareList.getShares();
        
        
        Share nextShare = new Share();
            Iterator itr = shareObjects.iterator();
            while(itr.hasNext()) {
                nextShare = (Share) itr.next();
                if(nextShare.getCompanySymbol().equals(shareSymbol)) {
                    nextShare.setAvailableShares((nextShare.getAvailableShares() + amountOfShares));
                }
            }             
            
            
        servicefunction.WriteShareFile(shareList);               
         
        String finishedMessage = "completed";       
                       
        
        return finishedMessage;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AddShare")
    public String AddShare(@WebParam(name = "companySymbol") String companySymbol) throws DatatypeConfigurationException {
        
        String finishedMessage = "completed";
                
        JsonObject object = new JsonObject();
        
        //Check if the share being added exists in iextrading api
        try {
            URL url = new URL("https://api.iextrading.com/1.0/stock/" + companySymbol + "/quote");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            
            BufferedReader ins = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inString;
            inString = ins.readLine();

            //GSON parsing
            JsonParser parser = new JsonParser();
            JsonElement element = parser.parse(inString);
            object = element.getAsJsonObject();
            
            // Check for succeussful response code or throw error
            if (conn.getResponseCode() != 200) {
                throw new IOException(conn.getResponseMessage());
            }
        }
        catch (IOException ioe) {
            finishedMessage = "Not found";
            System.out.println("IOException: " + ioe); } 
        
        if(finishedMessage.equals("completed"))
        {
            ShareList shareList = servicefunction.ReadShareFile();

            List<Share> shareObjects = shareList.getShares();

            //Loop through existing shares to check if the new share being added already exists.
            Share nextShare = new Share();
            Iterator itr = shareObjects.iterator();
            while(itr.hasNext()) {
                nextShare = (Share) itr.next();
                if(nextShare.getCompanySymbol().equals(companySymbol)) {
                    finishedMessage = "already exists";
                }
            }  
            
            if(finishedMessage.equals("completed"))
            {
                GregorianCalendar dateStyle = new GregorianCalendar();

                dateStyle.set(2019, 01, 9);
                XMLGregorianCalendar convertedDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(dateStyle);

                // Create Share instanses and add them to the 'shareObjects' collection
                Share share = new Share();

                Share.SharePrice price = new Share.SharePrice();
                price.setValue(object.get("latestPrice").getAsDouble());
                price.setCurrency("USD");        
                share.setSharePrice(price);
                share.setCompanyName(object.get("companyName").getAsString());
                share.setCompanySymbol(companySymbol);
                share.setAvailableShares(10000);
                share.setPriceUpdated(convertedDate);
                share.setSector(object.get("sector").getAsString());
                shareObjects.add(share);        

                servicefunction.WriteShareFile(shareList);
            }
        }
        
        return finishedMessage;       
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "RemoveShare")
    public String RemoveShare(@WebParam(name = "shareSymbol") String shareSymbol) {

        ShareList shareList = servicefunction.ReadShareFile();
        
        List<Share> shareObjects = shareList.getShares();
        
        Share nextShare = new Share();
            Iterator itr = shareObjects.iterator();
            while(itr.hasNext()) {
                nextShare = (Share) itr.next();
                if(nextShare.getCompanySymbol().equals(shareSymbol)) {
                    
                    shareObjects.remove(nextShare);
                    break;
                }
            }     
                           
        servicefunction.WriteShareFile(shareList);              
         
        String finishedMessage = "completed";       
                       
        return finishedMessage;
    }


}
