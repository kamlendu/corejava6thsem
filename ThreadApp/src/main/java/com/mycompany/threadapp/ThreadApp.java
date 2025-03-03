/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.threadapp;

import threads.Bank;
import threads.DepositThread;
import threads.WithdrawThread;


/**
 *
 * @author root
 */
public class ThreadApp {

    public static void main(String[] args) {
        Bank b = new Bank();
        
        WithdrawThread t1 = new WithdrawThread(b, "Alkesh", 20);
        WithdrawThread t2 = new WithdrawThread(b, "Ramesh", 40);
         WithdrawThread t3 = new WithdrawThread(b, "Swati", 80);
         DepositThread t4 = new DepositThread(b, "Paresh", 75);
            WithdrawThread t5 = new WithdrawThread(b, "Suresh", 45);
      
       
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
            
        
//         MyThread t1 = new MyThread("first");
//         MyThread t2 = new MyThread("second");
//         MyThread t3 = new MyThread("third");
//         
//         
//         t1.start();
//         t2.start();
//         t3.start();
    
//Printed p = new Printed();
//Thread mt1 = new Thread(new AnotherThread(p),"One");
//Thread mt2 = new Thread(new AnotherThread(p),"Two");
//Thread mt3 = new Thread(new AnotherThread(p),"Three");
////
//////mt1.setPriority(Thread.MAX_PRIORITY);
//mt1.start();
//mt2.start();
//mt3.start();


        
        System.out.println("Thread Name : "+ Thread.currentThread().getName());
    }
}
