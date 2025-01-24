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
public class UseAnimal {
       public static void main(String[] args) {
        Animal dog=new Dog("Dog", 24);
        dog.makeSound();
        
        Animal cat=new Cat("Cat", 16);
        cat.makeSound();
       
        Animal bird=new Bird("Bird", 8);
        bird.makeSound();
    }
}
