/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package com.mycompany.internalsolution;

/**
 *
 * @author root
 */
public class CategoryPresentException extends Exception {

    /**
     * Creates a new instance of <code>CategoryPresentException</code> without
     * detail message.
     */
    public CategoryPresentException() {
    }

    /**
     * Constructs an instance of <code>CategoryPresentException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public CategoryPresentException(String msg) {
        super(msg);
    }

    @Override
    public String toString() {
        return "Category id is already present in product";
    }
    
}
