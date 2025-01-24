/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Single_Inheritance;

/**
 *
 * @author HP
 */
class Thermostat extends Device{
    private int temperatureSetting=40;
    public Thermostat(int deviceId,String status){
        super(deviceId, status);
    }
    public void displayStatus(){
        System.out.println("Device id is "+deviceId);
        System.out.println("Device status is "+status);
        System.out.println("Temperature Setting is "+temperatureSetting);
    }
}
