/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.annotationapp;

import java.lang.reflect.Method;

/**
 *
 * @author root
 */
public class AnnotationApp {

    public static void main(String[] args) throws Exception {
        
        Annotate a = new Annotate();
        a.sayHello();
        a.useAnnotation();
        
        //a.getClass().
        Method m = a.getClass().getMethod("useAnnotation");
        
        MyAnnotation a1 = m.getAnnotation(MyAnnotation.class);
        
        System.out.println("The value mentioned in annotation  is : "+a1.value());
        
        
        
        
        System.out.println("Hello World!");
    }
}
