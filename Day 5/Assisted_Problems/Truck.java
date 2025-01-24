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
public class Truck extends Vehicle {
    private int loadCapacity=30;
    public Truck(int maxSpeed,String fuelType){
        super(maxSpeed,fuelType);
     }
     public void dispalyInfo(){
        System.out.println(" Truck Max speed is "+maxSpeed);
        System.out.println("Truck Fuel type is "+fuelType);
        System.out.println("Truck loadcapacity is "+loadCapacity);
    }
}
