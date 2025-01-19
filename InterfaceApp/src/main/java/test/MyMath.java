/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author root
 */
public class MyMath implements Calculable, Stringable{
    
    double sum;
    double product;
    double result;
    double pi;

    public double getPi() {
        return Calculable.PI;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    @Override
    public String convertToString() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   
    return "Class : MyMath";
    
    }

    @Override
    public double divide(double x, double y) {
        //return Calculable.super.divide(x, y); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    
        System.out.println("Class version of divide");
        if(y>0)
        return x/y;
    
        return 0;
    }
    

    @Override
    public double add(double x, double y) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return x+y;
    }

    @Override
    public double subtract(double x, double y) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return x-y;
    }

    @Override
    public double multiply(double x, double y) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return x*y;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getProduct() {
        return product;
    }

    public void setProduct(double product) {
        this.product = product;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
    
    
}
