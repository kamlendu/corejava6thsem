/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.collectionapp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author root
 */
public class CollectionApp {

    public static void main(String[] args) {
        
        CollectionApp app = new CollectionApp();
        app.arrayListOps();
        
        System.out.println("Hello World!");
    }


void arrayListOps()
{
    Comparator c =null;
    ArrayList<String> list = new ArrayList<>();
    
    list.add(0,"Pratham");
    list.add(1,"Rakesh");
    list.add(2,"Alka");
    list.add( 3,"Swayam");
    list.add( 4,"Prakash");
    
    for(int i =0; i< list.size();i++)
        System.out.println(list.get(i));
    
    
    list.sort(c);
    
    for(String s : list)
    {
        System.out.println("-- "+ s);
    }
    
    Iterator it = list.iterator();
    
    while(it.hasNext())
    {
        System.out.println(it.next());
    }
    
    
}





}
