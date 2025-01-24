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
public class PaidOnlineCourse extends OnlineCourse{
    private double fee=450000.00;
    private double discount=5.75;
    public PaidOnlineCourse(String courseName,int duration){
        super(courseName, duration);
    }
    public void dispalyDeatails(){
        System.out.println("Course Name is "+courseName);
        System.out.println("Time duration of course "+duration);
        System.out.println("Platform is "+platform);
        System.out.println("Recording is present "+isRecorded);
        System.out.println("Fee is "+fee);
        System.out.println("Discount on our fees "+discount);
    }
}
