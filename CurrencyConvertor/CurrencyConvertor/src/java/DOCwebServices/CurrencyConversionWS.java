/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DOCwebServices;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author taha-m
 */
@WebService()
public class CurrencyConversionWS {

    public enum ExRate {
        AUD ("Australian Dollar"),
        BGN ("Bulgarian Lev"),
        BRL ("Brazilian Real"),
        CAD ("Canadian Dollar"),
        CHF ("Swiss Franc"),
        CNY ("Chinese Yuan"),
        DKK ("Danish Krone"),
        EUR ("Euro"),
        GBP ("British pound"),
        HKD ("Hong Kong Dollar"),
        HRK ("Croatian Kuna"),
        HUF ("Hungarian Forint"),
        ILS ("Israeli New Shekel"),
        INR ("Indian Rupee"),
        ISK ("Iceland Krona"),
        JPY ("Japanese Yen"),
        KRW ("South Korean Won"),
        MXN ("Mexican Peso"),
        MYR ("Malaysian Ringgit"),
        NOK ("Norwegian Kroner"),
        NZD ("New Zealand Dollar"),
        RON ("Romanian Leu"),
        RUB ("Russian Ruble"),
        SEK ("Swedish Krona"),
        SGD ("Singapore Dollar"),
        THB ("Thai Baht"),
        TRY ("Turkish Lira"),
        USD ("United States Dollar"),
        ZAR ("South African Rand");

        private final String curName;
        ExRate(String curName) {
            this.curName = curName;
        }
        String curName()   { return curName; }
    }

    public double GetConversionRate(String baseCur, String neededCur) {
                              
        Double rateNeeded = null;
        
        try {
            URL url = new URL("https://api.exchangeratesapi.io/latest?base=" + baseCur );
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
            
            JsonObject allRates = object.get("rates").getAsJsonObject();
            rateNeeded = allRates.get(neededCur).getAsDouble();
            
            
        }
        catch (MalformedURLException me) {
            System.out.println("MalformedURLException: " + me); }
        catch (IOException ioe) {
            System.out.println("IOException: " + ioe); }       
        
        return rateNeeded;        
    }

    public List<String> GetCurrencyCodes() {
        List<String> codes = new ArrayList();
        for (ExRate exr : ExRate.values()) {
            codes.add(exr.name() + " - " + exr.curName);
        }
        return codes;
    }
     
        
}
