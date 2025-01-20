/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaceapp;

import test.Functional;
import test.MathFunctions;
import test.MyMath;


/**
 *
 * @author root
 */
public class InterfaceApp {

    public static void main(String[] args) {
        
       
        
              
        double x=40;
        double y = 50;
        
       
             Functional f = (n, mynum)-> n * Math.random() * mynum;   
             
             MathFunctions mf = (num)-> 
             {
                 int result =1;
                 
                 for(int i=1; i<=num; i++)
                 {
                     result = i*result;
                 }
             
                 return result;
             };
        
        MyMath math = new MyMath();
       
        System.out.println("The factorial of 5 is "+ mf.getFactorial(5));
        System.out.println("The number returned is "+ f.getNum(200, 5));
        
        System.out.println("NAme of class is "+ math.convertToString());
        System.out.println("Addition of " + x +"and  "+ y+ " is "+ math.add(x,y));
        System.out.println("Substraction of" + x +" and  "+ y+ " is "+ math.subtract(x, y));
        System.out.println("Product of" + x +" and  "+ y+ " is "+ math.multiply(x,y));
        System.out.println("division of" + x +" and  "+ y+ " is "+ math.divide(x, y));
    
         System.out.println("Value of PI is  "+ math.getPi());
          
         
         
        System.out.println("Hello World!");
    }
}
