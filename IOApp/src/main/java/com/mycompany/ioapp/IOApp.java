/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ioapp;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author root
 */
public class IOApp {

    public static void main(String[] args) throws IOException , ClassNotFoundException {
        
        IOApp app = new IOApp();
        
            //app.ShowFilesAndDirectories();
            //app.readAndWriteFromConsole();
           // app.readAndWriteBytes();
      // app.readAndWriteFromFiles();
      
      //app.readAndWriteData();
      app.readAndWriteObjects();
       
        System.out.println("Hello World!");
    }
    
    
   public void readAndWriteObjects() throws IOException, ClassNotFoundException
   {
        Employee  e1= new Employee(1,"prakash",30000);
        Employee  e2= new Employee(2,"suresh",40000);
        Employee  e3= new Employee(3,"mukesh",10000);
        Employee  e4= new Employee(4,"lokesh",50000);
        Employee  e5= new Employee(5,"arvind",60000);
        
        FileOutputStream fo = new FileOutputStream("/root/corejava/employeeout.txt");
        FileInputStream fi = new FileInputStream("/root/corejava/employeeout.txt");
        
        ObjectOutputStream os = new ObjectOutputStream(fo);
        
        os.writeObject(e1);os.writeObject(e2);os.writeObject(e3);os.writeObject(e4);os.writeObject(e5);
      
        ObjectInputStream oi = new ObjectInputStream(fi);
     
        Employee e=null;
     
      
      while(true)
      {
          try{
         // e = (Employee)oi.readObject();
         e = (Employee)oi.readObject() ;
         System.out.println(e.toString());
         }
     catch(EOFException ex )
     {
         break;
     }
      }
       
     
   }
    
    
    public void readAndWriteData() throws IOException
    {
         FileInputStream fi = new FileInputStream("/root/corejava/emp.dat");
        FileOutputStream fo = new FileOutputStream("/root/corejava/emp.dat");
        
        DataInputStream din = new DataInputStream(fi);
        DataOutputStream dout = new DataOutputStream(fo);
        
        dout.writeInt(1);
        dout.writeUTF("Prakash");
        dout.writeDouble(6000);
        dout.writeInt(2);
        dout.writeUTF("Smit");
        dout.writeDouble(7000);
        dout.writeInt(3);
        dout.writeUTF("Pooja");
        dout.writeDouble(8000);
        
        while(true)
        {
            try{
            System.out.println("Empno : "+ din.readInt());
           System.out.println("Ename : "+ din.readUTF());
           System.out.println("Salary : "+ din.readDouble());
            }
            catch(EOFException e)
            {
                break;
            }
        }
        
        
        
        
    }
    
    
    
    public void readAndWriteFromFiles() throws IOException
    {
       
        FileInputStream fi = new FileInputStream("/root/corejava/uni.txt");
        FileOutputStream fo = new FileOutputStream("/root/corejava/uniout.txt");
        int i;
         while((i= fi.read())!=-1)
         {
        
             fo.write(i);
        
         }
    }
    
    
    public void readAndWriteBytes() throws IOException
    {
        String s = "abcdefghijklmnopqrstuvwxyz";
        byte[] b = s.getBytes();
        
        ByteArrayInputStream bi = new ByteArrayInputStream(b);
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        
        int i;
        while((i= bi.read())!=-1)
        {
            System.out.println((char)i);
            
            bo.write(i);
        }
        
        System.out.println(bo.toString());
        
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
    
        PrintWriter p = new PrintWriter(System.out,true);
        
        
        p.write("Name is  : "+ s);

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
