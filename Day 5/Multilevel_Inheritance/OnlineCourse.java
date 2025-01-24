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
public class OnlineCourse extends Course{
  protected String platform ="Online";
  protected boolean isRecorded=true;
  public OnlineCourse(String courseName,int duration){
    super(courseName, duration);
  }
}
