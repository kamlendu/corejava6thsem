/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.annotationapp;

/**
 *
 * @author root
 */
public class Annotate {
    @Deprecated
    void sayHello()
    {
        System.out.println("Hello ....");
    }
    
    @MyAnnotation(value = 5)
    public void useAnnotation()
    {
        System.out.println("I am using empty annotation");
    }
    
}
