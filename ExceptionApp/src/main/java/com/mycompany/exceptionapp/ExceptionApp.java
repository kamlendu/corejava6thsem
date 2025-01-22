/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exceptionapp;

import company.Employee;
import exception.UnderAgeException;


/**
 *
 * @author root
 */
public class ExceptionApp {

    public static void main(String[] args) throws UnderAgeException {
       // String s =null;
        int x[] = {2,3};
        
        Employee e = new Employee();
        
        e.setId(5);
        e.setName("Prakash");
        
        try{
        e.setAge(15);
        }
        catch(UnderAgeException ue)
        {
            System.out.println(ue.getMessage());
        }
        
        
        
        
        try{
            
            
            
            
          //  System.out.println(s.toUpperCase());
         System.out.println(x[1]);
        int result = 6/2;
       
        
        }
        catch(NullPointerException ne)
        {
           System.out.println("You are trying to do operations on null values"); 
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Illegal Operation :Division By Zero happens here");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
           System.out.println("You are trying to access illegal index in array"); 
        }
        finally {
            
            System.out.println("I will always execute..."); 
        }
        
        System.out.println("Hello World!");
        
       
        
    }
}
