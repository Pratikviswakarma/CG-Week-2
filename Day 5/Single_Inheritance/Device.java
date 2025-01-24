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
class Device{
    protected int deviceId;
    protected String status;

    public Device(int deviceId,String status){
        this.deviceId=deviceId;
        this.status=status;
    }
    public void displayStatus(){
        System.out.println("Device id is "+deviceId);
        System.out.println("Device status is "+status);
    }
}
