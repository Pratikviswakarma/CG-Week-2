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
public class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void dispalyDeatails(){
        System.out.println("Name is "+name);
        System.out.println("Id is "+id);
        System.out.println("Salary is "+salary);
    }
}
