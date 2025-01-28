/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.steamapp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author root
 */
public class StreamApp {

    public static void main(String[] args) {
       
        new StreamApp().streamOps();
        
        System.out.println("Hello World!");
    }
    
    
    void streamOps()
    {
        List<String> list = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();
        list.add("Suresh");
        list.add("Pratham");
        list.add("Sunil");
        list.add("Sunil");
        list.add("Naresh");
        list.add("Bhumi");
        
        intList.add(5);
        intList.add(8);
        intList.add(14);
        intList.add(3);
        intList.add(41);
        intList.add(19);
        
        
        
        //List<String> li = list.stream().filter(x -> x.startsWith("S")).collect(Collectors.toList());
        // List<String> li = list.stream().distinct().filter(x -> x.startsWith("S")).collect(Collectors.toList());
        
        //List<String> li = list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        List<String> li = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        
        //List<String>  = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        
        IntSummaryStatistics is =  intList.stream().mapToInt(Integer::intValue).summaryStatistics();
        
        System.out.println("Average : "+is.getAverage());
        
        for(String s : li)
        {
            System.out.println(s);
        }
        
    }
    
    
    
}
