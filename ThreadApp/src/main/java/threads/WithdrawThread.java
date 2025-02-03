/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads;

/**
 *
 * @author root
 */
public class WithdrawThread extends Thread{
    Bank b;
    String username;
    double amount;

    public WithdrawThread(Bank b, String username, double amount) {
        this.b = b;
        this.username = username;
        this.amount = amount;
    }

    @Override
    public void run() {
        b.withdraw(username, amount);
    
    }
    
    
    
}
