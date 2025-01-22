/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author root
 */
public class UnderAgeException extends Exception {
    
    

    public UnderAgeException() {
    }

    public UnderAgeException(String message) {
        super(message);
    }
    
    

    @Override
    public String toString() {
        return "UnderAgeException : The person is under 18 years of age";
    }
    
    
    
}
