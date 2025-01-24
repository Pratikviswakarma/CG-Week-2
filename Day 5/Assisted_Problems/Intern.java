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
public class Intern extends Employee{
    public Intern(String name,int id,double salary){
       super(name, id, salary);
    }
    public void dispalyDeatails(){
        System.out.println("Intern Name is "+name);
        System.out.println("Intern Id is "+id);
        System.out.println("Intern Salary is "+salary);
        System.out.println(" Intern here ");
    }
}
