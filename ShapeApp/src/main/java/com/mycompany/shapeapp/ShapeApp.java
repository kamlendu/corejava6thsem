/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shapeapp;

import shapes.Box;
import shapes.Shape3D;

/**
 *
 * @author root
 */
public class ShapeApp {

    public static void main(String[] args) {
        
       Box b = new Box(5,6,7);
         System.out.println("Name = "+ b.getShapeName());
        System.out.println("Volume = "+ b.volume());
        System.out.println("Surface Area = "+ b.surafaceArea());
        System.out.println("Surface Area = "+ b.surafaceArea("top"));
        
        
        
        System.out.println("Hello World!");
    }
}
