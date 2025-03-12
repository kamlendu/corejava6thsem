/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ioapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class IOApp {

    public static void main(String[] args) {
        
        IOApp app = new IOApp();
        
            //app.ShowFilesAndDirectories();
            app.readAndWriteFromConsole();
       
       
        System.out.println("Hello World!");
    }
    
    void readAndWriteFromConsole()
    {
        // Reading and Writing data from Console
        try{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char c;
//        while((c= (char) reader.read()) !='q')
//        {
//            System.out.println("The char is "+ c);
//        }
//        
        System.out.println("Enter your Name : ");
        String s = reader.readLine();
        System.out.println("Name is  : "+ s);

        }
        catch(IOException ei)
        {
            ei.printStackTrace();
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    void ShowFilesAndDirectories()
    {
        
        File f = new File("/root");
        
        System.out.println(f.getName());
        if(f.isDirectory())
            System.out.println(f.getName()+ "is a  directory");
        else
           System.out.println(f.getName()+ "is a  file"); 
        
         System.out.println(f.getParent());   
         
         File files[] = f.listFiles();
         
         for(File f1 : files)
         {
              listAll(f1);
         }
    



    }
    
    
    void listAll(File f1 )
    {
       if(f1.isDirectory())
       {
           System.out.println(f1.getName());
           for(File f : f1.listFiles())
           {
               listAll(f);
           }
       }
       else
           System.out.println("----" + f1.getName());
           
            
   }
}
