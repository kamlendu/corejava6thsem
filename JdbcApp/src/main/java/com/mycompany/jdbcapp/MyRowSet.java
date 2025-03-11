/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jdbcapp;

import java.io.FileOutputStream;
import java.sql.ResultSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;

/**
 *
 * @author root
 */
public class MyRowSet {
       public MyRowSet() {
    }

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
        String username = "root";
        String password = "ompandey";
         String sql = "SELECT * FROM employee";

        JdbcRowSet jdbcRS = RowSetProvider.newFactory().createJdbcRowSet();
        jdbcRS.setUrl(url);
        jdbcRS.setUsername(username);
        jdbcRS.setPassword(password);
        jdbcRS.setType(ResultSet.TYPE_SCROLL_INSENSITIVE);       
        jdbcRS.setCommand(sql);
        jdbcRS.execute();

        while (jdbcRS.next()) {
            // each call to next, generates a cursorMoved event
            System.out.println("id = " + jdbcRS.getInt(1));
            System.out.println("name = " + jdbcRS.getString(2));
        }

// CachedRowSet Example
       
        CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
        crs.setUsername(username);
        crs.setPassword(password);
        crs.setUrl(url);
        crs.setCommand(sql);
        crs.execute();
        while (crs.next()) {
            // each call to next, generates a cursorMoved event
            System.out.println("id = " + crs.getInt(1));
            System.out.println("name = " + crs.getString(2));
        }
//            while (crs.next()) {
//                if (crs.getInt("id") == 1) {
//                    System.out.println("CRS found customer1 and will remove the record.");
//                    crs.deleteRow();
//                    break;
//                }
//            }

        // WebRowSet example
        WebRowSet wrs = RowSetProvider.newFactory().createWebRowSet();
        wrs.setUsername(username);
        wrs.setPassword(password);
        wrs.setUrl(url);
        wrs.setCommand(sql);
        wrs.execute();
        FileOutputStream ostream = new FileOutputStream("customers.xml");
        wrs.writeXml(ostream);
    }
}
