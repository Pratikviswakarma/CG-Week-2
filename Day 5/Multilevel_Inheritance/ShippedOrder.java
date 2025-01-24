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
public class ShippedOrder extends Order {
    protected int trackingNumber=4520;
    public ShippedOrder(int orderId,String orderDate){
      super(orderId, orderDate);
    }

}