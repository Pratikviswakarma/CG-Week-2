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
public class Student extends Person {
  private char grade;
  public Student(String name,int age){
    super(name, age);
  }
  public void displayRole(){
    System.out.println("This is Student ");
  }
}
