/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producerconsumerapp;

/**
 *
 * @author root
 */
public class Producer implements Runnable {
    MyQueue q;
    int n;

    public Producer(MyQueue q) {
        this.q = q;
    }
    
     @Override
    public void run() {
        
        n=0;
        while(n<50)
        {
            q.put(n++);
        }
        
    
    
    }
    
    
}
