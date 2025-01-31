/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.threadapp;

import threads.AnotherThread;

/**
 *
 * @author root
 */
public class ThreadApp {

    public static void main(String[] args) {
        
//         MyThread t1 = new MyThread("first");
//         MyThread t2 = new MyThread("second");
//         MyThread t3 = new MyThread("third");
//         
//         
//         t1.start();
//         t2.start();
//         t3.start();
        
Thread mt1 = new Thread(new AnotherThread(),"One");
Thread mt2 = new Thread(new AnotherThread(),"Two");
Thread mt3 = new Thread(new AnotherThread(),"Three");

mt1.setPriority(Thread.MAX_PRIORITY);
mt1.start();
mt2.start();
mt3.start();
        
        System.out.println("Thread Name : "+ Thread.currentThread().getName());
    }
}
