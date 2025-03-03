/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.internalsolution;

/**
 *
 * @author root
 */
public class Product {
    
    int productid;
    String productName;
    int categorId;

    public Product(int productid, String productName, int categorId) {
        this.productid = productid;
        this.productName = productName;
        this.categorId = categorId;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCategorId() {
        return categorId;
    }

    public void setCategorId(int categorId) {
        this.categorId = categorId;
    }
    
    
}
