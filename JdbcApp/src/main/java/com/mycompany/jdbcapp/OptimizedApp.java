/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jdbcapp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class OptimizedApp {
    Connection con;
    Statement stmt;
    ResultSet rs;
    

    public OptimizedApp() {
        
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
            OptimizedApp app = new OptimizedApp();
            
            //app.insertData(27, "Prateek", 38000);
            //app.deleteData(26);
            app.deleteBatch();
            app.showData();
            
            System.out.println("The gross sum of salaries is "+ app.getSumOfSalaries());
            System.out.println("The maximum salary is "+ app.getMaxSalary());
            
            
            System.out.println("Hello World!");
        } catch (SQLException ex) {
            Logger.getLogger(JdbcApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void showData() throws SQLException
    {
        //String sql = "select * from employee where ename like ?"
        stmt = con.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_SENSITIVE);
        
     rs =   stmt.executeQuery("select * from employee");
       
     
     ResultSetMetaData rmeta = rs.getMetaData();
     
     int totalcols = rmeta.getColumnCount();
     
     for(int i=1; i<=totalcols; i++)
     {
        // rs.next();
               System.out.print(rmeta.getColumnName(i)+ "\t");
     }
     
     while(rs.next())
     {
         
         System.out.println(rs.getString(1)+"\t"+ rs.getString(2)+"\t"+ rs.getString(3));
     }
     
     
     
     
     
       //showStats(); 
    }
    
    
    void insertData(int empid, String ename, double sal) throws SQLException
    {
        String inquery = "insert into employee values(?,?,?)";
    
        PreparedStatement stmt = con.prepareStatement(inquery);
        stmt.setInt(1, empid);
        stmt.setString(2, ename);
        stmt.setDouble(3, sal);
        
    
            stmt.executeUpdate();
           
          //  con.commit();
    
    }
    
    void deleteData(int empid) throws SQLException
    {
        String delquery = "delete from employee where empno=?";
    
        PreparedStatement stmt = con.prepareStatement(delquery) ;
    stmt.setInt(1, empid);
    
    
    
            stmt.executeUpdate();
           
          //  con.commit();
    
    }
    
    
     void deleteBatch() throws SQLException
    {
        String delquery = "delete from employee where empno=?";
    
        PreparedStatement stmt = con.prepareStatement(delquery) ;
    stmt.setInt(1, 10);
    stmt.addBatch();
     stmt.setInt(1, 12);
    stmt.addBatch(); 
    stmt.setInt(1, 15);
    stmt.addBatch(); 
    stmt.setInt(1, 20);
    stmt.addBatch(); 
    stmt.setInt(1, 25);
    stmt.addBatch();
    
    stmt.executeBatch();
    
    
    
            stmt.executeUpdate();
           
          //  con.commit();
    
    }
     
     
     
     double getSumOfSalaries() throws SQLException
     {
         CallableStatement csmt = con.prepareCall("{call gross_sal(?)}");
         csmt.registerOutParameter(1, java.sql.Types.DOUBLE);
         csmt.executeQuery();
         
         
         
         return csmt.getDouble(1);
     }
     
     double getMaxSalary() throws SQLException
     {
         CallableStatement csmt = con.prepareCall("{?=call maxsal()}");
         csmt.registerOutParameter(1, java.sql.Types.DOUBLE);
         csmt.execute();
         
         
         
         return csmt.getDouble(1);
     }
     
    
    
}
