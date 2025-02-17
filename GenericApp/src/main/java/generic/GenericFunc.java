/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

import java.util.List;

/**
 *
 * @author root
 */
public class GenericFunc {
    
    public <E> void print(E e)
    {
        System.out.println(e);
    }
    
    public void printList(List<?> list)
    {
        for(Object t: list)
        {
            System.out.println(t);
        }
    }
    
    public double doSum(List<? extends Number> li)
    {
        double sum = 0.0;
        for(Number d : li)
        {
            sum += d.doubleValue();
        }
        
        return sum;
    }
    
    public double doSum1(List<? super Integer> li)
    {
        
        return 0.0;
    }
}
