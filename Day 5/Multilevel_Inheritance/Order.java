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
public class Order{
  protected int orderId;
  protected String orderDate;
  public Order(int orderId,String orderDate){
    this.orderId=orderId;
    this.orderDate=orderDate;
  }
}
