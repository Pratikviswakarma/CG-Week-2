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
public class Animal {
    String name;
    int age;

    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void makeSound(){
        System.out.println("All animal have its own sound");
    }
}
