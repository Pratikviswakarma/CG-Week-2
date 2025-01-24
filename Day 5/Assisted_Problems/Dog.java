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
public class Dog extends Animal {
     public Dog(String name,int age){
        super(name, age);
    }
    public void makeSound(){
        System.out.println("Dog shound is : Bho Bho");
    }
}
