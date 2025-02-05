/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deadlockapp;

/**
 *
 * @author root
 */
public class Deadlock implements Runnable{
A a;
B b;
    
    public Deadlock() {
        
        a = new A();
        b = new B();
        
        Thread.currentThread().setName("MainThread");
        Thread t = new Thread(this,"RacingThread");
        t.start();
        a.taskA(b); // Main Thread calling a.task(b)
        
    }

     @Override
    public void run() {
        
        b.taskB(a); // Racing thread is calling b.task(a)
      }
  
    
    
}
