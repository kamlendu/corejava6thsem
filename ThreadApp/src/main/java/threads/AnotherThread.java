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
public class AnotherThread implements Runnable {
Printed p;
   

    public AnotherThread(Printed p) {
      
        this.p=p;
    }
    
    @Override
    public void run() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       
       p.print();
    }
    
//    private void print()
//    {
//        for(int i= 0; i<6; i++)
//        {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(AnotherThread.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            System.out.println(Thread.currentThread().getName()+ " Value of i = "+ i);
//        }
//    }
    
}
