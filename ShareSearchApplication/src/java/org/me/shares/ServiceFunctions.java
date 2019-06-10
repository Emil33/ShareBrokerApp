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
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author EJ
 */
public class ServiceFunctions {
    
    private String filePath = "E:\\Year3UNI\\ServiceCentric\\ShareSearchApplication\\Shares.txt";    
    
    public ShareList ReadShareFile() { 

        ShareList shareList = new ShareList();               

        //Unmarshall the file and return the contents
        try {
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(shareList.getClass().getPackage().getName());
            javax.xml.bind.Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
            shareList = (ShareList) unmarshaller.unmarshal(new java.io.File(filePath)); //NOI18N
        } catch (javax.xml.bind.JAXBException ex) {
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
        }
        
        return shareList;
    }

    public String WriteShareFile(ShareList shareList) {              

        try {
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(shareList.getClass().getPackage().getName());
            javax.xml.bind.Marshaller marshaller = jaxbCtx.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            
            //Writing the whole XML document to file
            File storedShares = new File(filePath);
            marshaller.marshal(shareList, storedShares);
                                    
        } catch (javax.xml.bind.JAXBException ex) {
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
        }
        
        String finishedMessage = "completed";    
            
        return finishedMessage;
    }    
    
    public void UpdateSharePrices() throws ParseException, DatatypeConfigurationException
    {
        ShareList shareList = ReadShareFile();
        
        List<Share> shareObjects = shareList.getShares();
        
        Share nextShare = new Share();
            Iterator itr = shareObjects.iterator();
            while(itr.hasNext()) {
                nextShare = (Share) itr.next();
               
                //Get the new price    
                try {
                    URL url = new URL("https://api.iextrading.com/1.0/stock/" + nextShare.getCompanySymbol() + "/quote");
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    // Check for succeussful response code or throw error
                    if (conn.getResponseCode() != 200) {
                        throw new IOException(conn.getResponseMessage());
                    }
                    BufferedReader ins = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    String inString;
                    inString = ins.readLine();

                    //GSON parsing
                    JsonParser parser = new JsonParser();
                    JsonElement element = parser.parse(inString);
                    JsonObject object = element.getAsJsonObject();

                    nextShare.getSharePrice().setValue(object.get("latestPrice").getAsDouble());

                    //Get the last date the share price was updated
                    long apiDate = object.get("latestUpdate").getAsLong();
                    
                    //Convert the date to gregorian calendar fromat
                    GregorianCalendar gC = new GregorianCalendar();
                    gC.setTimeInMillis(apiDate);
                    XMLGregorianCalendar convertedDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gC);                   

                    //Add the date to the current share
                    nextShare.setPriceUpdated(convertedDate); 

                    ins.close();
                }
                catch (MalformedURLException me) {
                    System.out.println("MalformedURLException: " + me); }
                catch (IOException ioe) {
                    System.out.println("IOException: " + ioe); } 
            }    
        
        WriteShareFile(shareList);        
    }
    
}
