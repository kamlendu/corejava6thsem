/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.internalsolution;

import java.util.HashMap;

/**
 *
 * @author root
 */
public class InternalSolution {
    
    HashMap<Integer,Category> categories;
    HashMap<Integer,Product> products;

    public InternalSolution() {
        categories = new HashMap<>();
        products= new HashMap<>();
                
    }
    
    

    public static void main(String[] args) {
       
        InternalSolution is = new InternalSolution();
        
        is.insertCategory(1, "normal");
        is.insertCategory(2, "good");
        is.insertCategory(3, "excellent");
        is.insertCategory(4, "super");
        
        is.insertPoducts(1, "ABC", 1);
        is.insertPoducts(2, "DEF", 3);
        is.insertPoducts(3, "IJK", 3);
        is.insertPoducts(4, "XYZ", 2);
        is.insertPoducts(5, "MNP", 2);
        is.insertPoducts(6, "LLM", 1);
        is.insertPoducts(7, "IML", 1);
        is.insertPoducts(8, "RTI", 2);
        is.insertPoducts(9, "SLC", 3);
        is.insertPoducts(10, "SDB", 4);
        
        is.displayProducts("excellent");
        
        is.deleteCategory(4);
        
        System.out.println("Hello World!");
    }
    
    void insertCategory(int id, String cname)
    {
        categories.put(id, new Category(id, cname));
    }
    
    void insertPoducts(int id, String pname, int catid)
    {
        if(categories.containsKey(catid))
        products.put(id, new Product(id, pname, catid));
    }
    
   void displayCategories()
    {
        for(Category c : categories.values())
        {
           System.out.println(c.getCategoryId()+ "  "+ c.getCategoryName()); 
        }
    }
    
    void displayProducts(String catname)
    {
        for(Product p : products.values())
        if(p.getCategorId()== getIdFromCatName(catname) ) 
            System.out.println(p.getProductid()+ "  "+ p.getProductName()+ " "+ p.getCategorId());
    }
    
    int getIdFromCatName(String cname)
    {
        for(Category c : categories.values())
        {
            if(c.getCategoryName().equals(cname))
                return c.getCategoryId();
        }
    return 0;
    }
    
    
    void deleteCategory(int cid)
    {
        displayCategories();
        boolean present = false;
        for(Product p : products.values())
        {
            if(p.getCategorId()== cid)
            {
                present = true;
            }
            
        }
        try{
        if(present)
        {
            throw new CategoryPresentException("Category present in product");
        }
        else
        {
            
        
        
            categories.remove(cid);
        }
        }
        catch(CategoryPresentException ex)
        {
            System.out.println(ex.toString());
        }
        
        displayCategories();
    }
}
