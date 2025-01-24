/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multilevel_Inheritance;

/**
 *
 * @author HP
 */
public class UseOrder {
    public static void main(String[] args) {
      DeliveredOrder deo=new DeliveredOrder(101, "22-01-2023");
      deo.getOrderStatus();
    }
}