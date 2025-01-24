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
public class Vehicle{
    protected int maxSpeed;
    protected String fuelType;
    
    public Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
    public void dispalyInfo(){
        System.out.println("Max speed is "+maxSpeed);
        System.out.println("Fuel type is "+fuelType);
    }
}
