/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads;

/**
 *
 * @author root
 */
public class AnotherThread implements Runnable {

    
    
    @Override
    public void run() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    print();
    }
    
    private void print()
    {
        for(int i= 0; i<6; i++)
        {
            System.out.println(Thread.currentThread().getName()+ " Value of i = "+ i);
        }
    }
    
}
