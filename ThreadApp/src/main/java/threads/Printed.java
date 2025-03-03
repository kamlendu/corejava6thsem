/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class Printed {
    
 synchronized   public void print()
    {
        for(int i= 0; i<6; i++)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(AnotherThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(Thread.currentThread().getName()+ " Value of i = "+ i);
        }
    }
    
}
