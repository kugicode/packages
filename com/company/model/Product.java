/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.model;

/**
 *
 * @author anzoh
 */
public class Product {
    private String name;
    private double price;
    
    //para constructor
    public Product(String name, double price){
    this.name = name;
    this.price = price;
    }
    
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void displayMethod(){
    System.out.println("The name of the product is " + name + " And the price is " + price);
    }
}
