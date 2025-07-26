/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication104;
import com.company.model.Product;

/**
 *
 * @author anzoh
 */
public class JavaApplication104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("--- Java package example ---");
    
    Product laptop = new Product("Gaming laptop", 799.55);
    laptop.displayMethod();
    
    
    Product mouse = new Product("wireless mouse", 14.44);
    mouse.displayMethod();
    }
    
}
