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
public class ElectricVehicle extends Vehicle implements Refuelable{
    public ElectricVehicle(int maxSpeed,String model){
       super(maxSpeed, model);
    }
    public void charge(){
        System.out.println("Electric Vehicle is chared ");
    }
    public void refuel(){
      charge();
    }
}
