/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deadlockapp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class B {

    public B() {
    }
    
    synchronized public void taskB(A a)
    {
        System.out.println(Thread.currentThread().getName()+" is in Task B");
    
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
       System.out.println(Thread.currentThread().getName()+ " is about to call  a.last");
   
        a.last();
        
        System.out.println(Thread.currentThread().getName()+ " called a.last");
    }
    
   synchronized public void last()
{
System.out.println(Thread.currentThread().getName()+" is in B.last()");

}
    
}
