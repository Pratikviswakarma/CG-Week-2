/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assisted_Problems;

/**
 *
 * @author HP
 */
public class Motercycle extends Vehicle {
    private int average=65;
    public Motercycle(int maxSpeed,String fuelType){
        super(maxSpeed,fuelType);
     }
     public void dispalyInfo(){
        System.out.println("Motercycle Max speed is "+maxSpeed);
        System.out.println("Motercycle Fuel type is "+fuelType);
        System.out.println("Motercycle average per liter is "+average);
    }
}