/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package test;

/**
 *
 * @author root
 */
public interface Calculable {
    
    double PI = 3.14;
    
    double add(double x, double y);
    double subtract(double x, double y);
    double multiply(double x, double y);
    
    default double divide(double x, double y)
    {
        return x/y;
    }
   
    default double triple(double x)
    {
        return 3*x;
    }
    
     static double squareRoot(double x)
    {
        return Math.sqrt(x);
    }
    
}
