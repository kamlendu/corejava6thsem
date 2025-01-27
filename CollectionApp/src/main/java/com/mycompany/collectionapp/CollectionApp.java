/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.collectionapp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

/**
 *
 * @author root
 */
public class CollectionApp {

    public static void main(String[] args) {
        
        CollectionApp app = new CollectionApp();
        app.treeMapOps();
        
        System.out.println("Hello World!");
    }
     
     void treeMapOps()
    {
        TreeMap<Object,Object> list = new TreeMap<>();
        
        list.put(1,"Pratham");
        list.put(2,"Rakesh");
        list.put(3,"Alka");
      list.put( 7,"Swati");
        list.put( 4,556.09);
        list.put( 5,"Prakash");
        
       // list.remove(4);
        for(Map.Entry e : list.entrySet())
        {
            System.out.println("Key "+ e.getKey() + " Value "+ e.getValue());
        }
        
        
    }
    
    void hashMapOps()
    {
        HashMap<Object,Object> list = new HashMap<>();
        
        list.put(1,"Pratham");
        list.put("2","Rakesh");
        list.put(3,"Alka");
      
        list.put( 3,556.09);
        list.put( 5,"Prakash");
        
       // list.remove(4);
        for(Map.Entry e : list.entrySet())
        {
            System.out.println("Key "+ e.getKey() + " Value "+ e.getValue());
        }
        
        
    }
    
    
    void treeSetOps()
    {
        TreeSet<String> list = new TreeSet<>();
     
        list.add("Pratham");
        list.add("Rakesh");
        list.add("Alka");
         list.add("Alka");
        list.add( "Swayam");
        list.add( "Prakash");
        
        for(String s : list)
        {
            System.out.println(s);
        }
        
    }
    
    void hashSetOps()
    {
        HashSet<String> list = new HashSet<>();
     
        list.add("Pratham");
        list.add("Rakesh");
        list.add("Alka");
         list.add("Alka");
        list.add( "Swayam");
        list.add( null);
        
        for(String s : list)
        {
            System.out.println(s);
        }
        
    }
    
   
    
       void vectorOps()
{
    Comparator c =null;
    Vector list = new Vector();
    
    list.add("Pratham");
    list.add("Rakesh");
    list.add("Alka");
    list.add( "Swayam");
    list.add( "Prakash");
    
    for(int i =0; i< list.size();i++)
        System.out.println(list.get(i));
    
    
    list.sort(c);
    
    for(Object s : list)
    {
        System.out.println("-- "+ s.toString());
    }
    
    Iterator it = list.iterator();
    
    while(it.hasNext())
    {
        System.out.println(it.next());
    }
    
    
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


void linkedListOps()
{
    Comparator c =null;
    LinkedList<String> list = new LinkedList<>();
    
    list.add(0,"Pratham");
    list.add(1,"Rakesh");
    list.add(2,"Alka");
    list.add( 3,"Swayam");
    list.add( 4,"Prakash");
    
    list.offerFirst("Jayesh");
    list.offerLast("Suresh");
    
    System.out.println(list.peek());
    
    System.out.println(list.peekLast());
    
  // Iterator it1 = list.descendingIterator();
    Iterator it = list.iterator();
   while(it.hasNext())
    {
        System.out.println(it.next());
    }
    
//    for(int i =0; i< list.size();i++)
//        System.out.println(list.get(i));
//    
//    
//    list.sort(c);
//    
//    for(String s : list)
//    {
//        System.out.println("-- "+ s);
//    }
    
//    Iterator it = list.iterator();
//    
//    while(it.hasNext())
//    {
//        System.out.println(it.next());
//    }
    
    
}





}
