/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author root
 */
public class Box extends Shape3D {
    
    double length;
    double breadth;
    double height;

    public Box() {
        super("Box");
        
        length=-1;
        breadth=-1;
        height=-1;
    }

    public Box(double length, double breadth, double height) {
        super("Box");
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public Box(double length) {
         super("Box");
        this.length = length;
        this.breadth=length;
        this.height=length;
    }
    
    
    
    

    
    
    
    
    
    
    
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double surafaceArea() {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     if(length > 0 && breadth > 0 && height > 0)
        return 2*length * breadth + breadth * height+ 2 * length*height;
       
            System.out.println(" Values of length, breadth and height are not valid");
            return -1;
 
     
    }
    
    public double surafaceArea(String face) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     if(length > 0 && breadth > 0 && height > 0)
     {
         if(face.equals("top"))
             return 2*length * breadth;
         else if(face.equals("side"))
             return 2* height * breadth;
         else if(face.equals("lateral"))
            return 2* height * length;       
     
     }   
     System.out.println(" Values of length, breadth and height are not valid");
            return -1;
 
    }

    @Override
    public double volume() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if(length > 0 && breadth > 0 && height > 0)
        return length * breadth * height;
        
            System.out.println(" Values of length, breadth and height are not valid");
            return -1;
    }

    @Override
    public void scale(double sx, double sy, double sz) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
        length *= sx;
        breadth *= sy;
        height *= sy;
        
    }
    
    
    
}
