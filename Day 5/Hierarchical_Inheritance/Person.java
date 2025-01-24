/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hierarchical_Inheritance;

/**
 *
 * @author HP
 */
public class Person {
  private String name;
  private int age;
  public Person(String name,int age){
    this.name=name;
    this.age=age;
  }
  public void displayRole(){
    System.out.println("This is normal Person ");
  }
}
