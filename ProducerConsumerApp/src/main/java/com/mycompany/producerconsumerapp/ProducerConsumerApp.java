/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.producerconsumerapp;

/**
 *
 * @author root
 */
public class ProducerConsumerApp {

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        
        Thread t1 = new Thread(p,"Producer");
        Thread t2 = new Thread(c,"Consumer");
        
        t1.start();
        t2.start();
        
        
        System.out.println("Hello World!");
    }
}
