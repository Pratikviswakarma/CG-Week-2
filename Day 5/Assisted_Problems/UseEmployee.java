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
public class UseEmployee {
 public static void main(String[] args) {
    Manager mg=new Manager("Rishav", 135, 55000.00);
    mg.dispalyDeatails();
    Developer dv=new Developer("Neeraj bhai", 103, 50000.00);
    dv.dispalyDeatails();
    Intern in=new Intern("Pratik", 119, 35000.00);
    in.dispalyDeatails();
 }   
}