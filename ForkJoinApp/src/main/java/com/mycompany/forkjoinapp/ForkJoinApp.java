/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.forkjoinapp;

import java.util.concurrent.ForkJoinPool;

/**
 *
 * @author root
 */
public class ForkJoinApp {

    public static void main(String[] args) {
        
        ForkJoinPool pool = ForkJoinPool.commonPool();
       String ucase= pool.invoke(new CustomRecursiveTask("ssadadsadashdhdhjsgfdhgasydfsahghddsahdadgdewdfewaefawehhaghdhahdadhsahsdsahsgdhsgsgasjd"));
        System.out.println("Result ="+ ucase);
       // System.out.println("Hello World!");
    }
}
