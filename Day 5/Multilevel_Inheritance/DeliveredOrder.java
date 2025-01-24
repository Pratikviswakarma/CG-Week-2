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
public class DeliveredOrder extends ShippedOrder{
    private String deleveryDate="22-01-2025";
    public DeliveredOrder(int orderId,String orderDate){
      super(orderId, orderDate);
    }
    public void getOrderStatus(){
      System.out.println("Order Id is "+orderId);
      System.out.println("Order Date is "+orderDate);
      System.out.println("Tracking Number is "+trackingNumber);
      System.out.println("Delevery Date is "+deleveryDate);
    }
}
