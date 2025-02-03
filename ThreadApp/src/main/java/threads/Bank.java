/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class Bank {
    
    double balance = 100;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
   synchronized public void withdraw(String username, double withdrawl)
    {
        if(balance >= withdrawl)
        {
            System.out.println(username + " is trying to withdraw "+ withdrawl);
            balance = balance-withdrawl;
             System.out.println(username + ":  Balance after withdrawl =  "+ balance);
             
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else
        {
            System.out.println(username + "can not withdrwas as balance is less than the withdrawl : "+ withdrawl);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
   synchronized public void deposit(String username, double deposit)
    {
         System.out.println(username + " is trying to deposit "+ deposit);
            balance = balance+ deposit;
        System.out.println(username + ":  Balance after withdrawl =  "+ balance);
        try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    
}
