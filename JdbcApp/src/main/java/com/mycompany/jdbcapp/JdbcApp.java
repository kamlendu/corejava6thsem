/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jdbcapp;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author root
 */
public class JdbcApp {
    
    Connection con;
    Statement stmt;
    ResultSet rs;
    

    public JdbcApp() {
        
        try {
            // Loading the Driver
            Class.forName("com.mysql.jdbc.Driver"); // mysql 5.x
            //Class.forName("com.mysql.cj.jdbc.Driver"); // For mysql 8
            System.out.println("Diver Available...");
            // Connect Driver to database
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "ompandey");
            System.out.println("Connection Successful ...");
        } catch (ClassNotFoundException ex) {
           System.out.println("Driver class not found...");
        }
        catch(SQLException sq)
        {
            System.out.println("Could not connect to the database...");
            sq.printStackTrace();
        }
        
        
    }
    
    
    
    

    public static void main(String[] args) {
        
        try {
            JdbcApp app = new JdbcApp();
            
            app.showData();
            
            System.out.println("Hello World!");
        } catch (SQLException ex) {
            Logger.getLogger(JdbcApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void showData() throws SQLException
    {
        stmt = con.createStatement();
        
     rs =   stmt.executeQuery("select * from employee");
        
     while(rs.next())
     {
         
         System.out.println(rs.getString(1)+"\t"+ rs.getString(2)+"\t"+ rs.getString(3));
     }
     
        
    }
    
    
}
