/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company;

import exception.UnderAgeException;

/**
 *
 * @author root
 */
public class Employee {
    
    int id;
    String name;
    int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws UnderAgeException {
        
        if(age < 18)
            throw new UnderAgeException("The person is under age");
        this.age = age;
    }
    
    
    
}
