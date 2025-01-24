/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hybrid_Inheritance;

/**
 *
 * @author HP
 */
public class  PetrolVehicle extends Vehicle implements Refuelable{
    public PetrolVehicle(int maxSpeed,String model){
        super(maxSpeed, model);
    }
    public void refuel(){
        System.out.println("Petrol vehicle is refuel ");
    }
}

