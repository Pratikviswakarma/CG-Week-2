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
public class UseVehicle {
    public static void main(String[] args) {
        Vehicle[] vehicles=new Vehicle[3];
        vehicles[0]=new Car(80,"Disel");
        vehicles[0].dispalyInfo();
        vehicles[1]=new Truck(30,"Disel");
        vehicles[1].dispalyInfo();
        vehicles[2]=new Motercycle(120,"petrol");
        vehicles[2].dispalyInfo();

    }
}