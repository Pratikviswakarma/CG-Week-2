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
public class UseVehicle {
    public static void main(String[] args) {
        Refuelable ev=new ElectricVehicle(200, "Tata Ev");
        ev.refuel();
        Refuelable pv=new PetrolVehicle(150, "Mahendra");
        pv.refuel();
    }
}
