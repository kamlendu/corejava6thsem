/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producerconsumerapp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class MyQueue {
    int n=0;
    boolean vset = false;

    public MyQueue() {
    }
    
    
    synchronized public int get()
    {
        if(!vset)
        {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(MyQueue.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       System.out.println(Thread.currentThread().getName()+ " Got : "+ n);
      vset=false;
      notify();
       
       return n;  
    }
    
   synchronized public void put(int n)
    {
        if(vset)
        {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(MyQueue.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        this.n=n;
        System.out.println(Thread.currentThread().getName()+ " Put : "+ n);
    vset=true;
      notify();
    }
    
    
}
