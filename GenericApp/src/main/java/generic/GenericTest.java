/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author root
 */
public class GenericTest<T> {
    
    List<T> list = new ArrayList<>();

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
    
    public void add(T t)
    {
        list.add(t);
    }
    
public void remove(T t)
    {
        list.remove(t);
    }
    
    public void printList()
    {
        for(T t: list)
        {
            System.out.println(t);
        }
    }
    
}
