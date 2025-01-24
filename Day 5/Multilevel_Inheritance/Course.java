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
public class Course {
  protected String courseName;
  protected int duration;
  public Course(String courseName,int duration){
    this.courseName=courseName;
    this.duration=duration;
  }
}
