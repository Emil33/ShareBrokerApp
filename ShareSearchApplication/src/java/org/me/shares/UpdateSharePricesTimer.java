/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.shares;

import java.text.ParseException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.xml.datatype.DatatypeConfigurationException;

/**
 *
 * @author EJ
 */
@Stateless
public class UpdateSharePricesTimer {

    @Schedule(dayOfWeek = "Mon-Fri", month = "*", hour = "9-17", dayOfMonth = "*", year = "*", minute = "*", second = "0", persistent = false)
    
    public void myTimer() {
        
        ServiceFunctions servicefunction = new ServiceFunctions();
        
        Timer timer = new Timer();
        
        TimerTask task = new TimerTask()
        {
            public void run()
            {
                try {
                    
                    servicefunction.UpdateSharePrices();
                    
                } catch (ParseException ex) {
                    Logger.getLogger(UpdateSharePricesTimer.class.getName()).log(Level.SEVERE, null, ex);
                } catch (DatatypeConfigurationException ex) {
                    Logger.getLogger(UpdateSharePricesTimer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        
        timer.scheduleAtFixedRate(task, 5000, 5000);
        
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
