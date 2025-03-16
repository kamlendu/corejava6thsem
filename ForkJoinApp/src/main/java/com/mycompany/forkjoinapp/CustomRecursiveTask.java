/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forkjoinapp;

import java.util.concurrent.RecursiveTask;

/**
 *
 * @author root
 */
public class CustomRecursiveTask extends RecursiveTask<String> {

   public String mystr="";
    final static int THRESHOLD = 4;

    public CustomRecursiveTask(String mystr) {
        
        this.mystr= mystr;
    }
    
    
    
    @Override
    protected String compute() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    if(mystr.length()> THRESHOLD)
    {
        String p1 = mystr.substring(0, mystr.length()/2);
        String p2 = mystr.substring(mystr.length()/2, mystr.length());
        
        CustomRecursiveTask task1 = new CustomRecursiveTask(p1);
        CustomRecursiveTask task2 = new CustomRecursiveTask(p2);
        
        task1.fork();
        String right = task2.compute();
        String left = task1.join();
        
        
       return left + right;
      }
    else
    {
        return mystr.toUpperCase();
    }
    
    
    
    //return null;
    }
 
    
    
}
