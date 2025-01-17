/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author root
 */
public abstract class Shape3D extends Shape {

    String typeOfShape;
    
    public Shape3D() {
        super("3D");
        this.typeOfShape="3D";
        //super.setShapeName("undefined");;
        shapeName="undefined";
    }

    public Shape3D(String shapeName) {
        super(shapeName);
        typeOfShape="3D";
    }
    
    public Shape3D(String shapeName, String typeOfShape) {
        super(shapeName);
       this.typeOfShape=typeOfShape;
    }
    
    

     @Override
     public abstract double area();
     @Override
    public abstract double surafaceArea();
     @Override
    public abstract double volume();
     @Override
    public abstract void scale(double sx, double sy, double sz);
    
    
}
