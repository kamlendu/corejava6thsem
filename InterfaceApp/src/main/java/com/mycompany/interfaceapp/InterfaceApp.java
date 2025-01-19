/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaceapp;

import test.MyMath;

/**
 *
 * @author root
 */
public class InterfaceApp {

    public static void main(String[] args) {
        
        double x=40;
        double y = 50;
        MyMath math = new MyMath();
        System.out.println("NAme of class is "+ math.convertToString());
        System.out.println("Addition of " + x +"and  "+ y+ " is "+ math.add(x,y));
        System.out.println("Substraction of" + x +" and  "+ y+ " is "+ math.subtract(x, y));
        System.out.println("Product of" + x +" and  "+ y+ " is "+ math.multiply(x,y));
        System.out.println("division of" + x +" and  "+ y+ " is "+ math.divide(x, y));
    
         System.out.println("Value of PI is  "+ math.getPi());
         
         
         
        System.out.println("Hello World!");
    }
}
