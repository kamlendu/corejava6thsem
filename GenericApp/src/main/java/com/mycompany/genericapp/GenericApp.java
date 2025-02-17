/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.genericapp;

import generic.GenericFunc;
import generic.GenericTest;
import static java.lang.System.out;

/**
 *
 * @author root
 */
public class GenericApp {

    public static void main(String[] args) {
        
        GenericTest<String> gt = new GenericTest<>();
        GenericTest<Integer> gt1 = new GenericTest<>();
        
        GenericFunc func = new GenericFunc();
        
        func.print("Hello");
        func.print(46);
        func.print(56.1234);
        
        
        
        gt.add("Prakash");
        gt.add("Rakesh");
        gt.add("Seema");
        gt.add("Ramesh");
        
        func.printList(gt.getList());
        
     //gt.printList();
     
     gt1.add(20);
     gt1.add(40);
     gt1.add(100);
     gt1.add(90);
     
    // gt1.printList();
    func.printList(gt1.getList()); 
    
    double sum = func.doSum(gt1.getList());
    System.out.println("Sum = "+ sum);
        
        System.out.println("Hello World!");
    }
}
