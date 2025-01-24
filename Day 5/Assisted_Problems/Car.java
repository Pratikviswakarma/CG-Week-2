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
public class Car extends Vehicle{
    private int seatCapacity=5;
    public Car(int maxSpeed,String fuelType){
       super(maxSpeed,fuelType);
    }

    public void dispalyInfo(){
        System.out.println("Car Max speed is "+maxSpeed);
        System.out.println("Car Fuel type is "+fuelType);
        System.out.println("Car seatCapacity is "+seatCapacity);
    }
}
