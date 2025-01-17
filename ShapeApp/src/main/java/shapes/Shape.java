/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author root
 */
public abstract class Shape {
    
     String shapeName;

    public Shape() {
        this.shapeName="undefined";
    }

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }
    
    public abstract double area();
    public abstract double surafaceArea();
    public abstract double volume();
    public abstract void scale(double sx, double sy, double sz);
    
    
    

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
    
    
    
}
