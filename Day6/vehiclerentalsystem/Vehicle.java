package vehiclerentalsystem;

abstract public class Vehicle {
    private int vehicleNumber;
    private String type;
    private int rentalRate;

    public Vehicle(int vehicleNumber,String type,int rentalRate){
        this.vehicleNumber=vehicleNumber;
        this.type=type;
        this.rentalRate=rentalRate;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }
    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getRentalRate() {
        return rentalRate;
    }
    public void setRentalRate(int rentalRate) {
        this.rentalRate = rentalRate;
    }

    public void dispaly(){
        System.out.println("Vehicle number "+vehicleNumber);
        System.out.println("Vehicle type is "+type);
        System.out.println("Rental Rate "+rentalRate);
    }
    abstract public void calcualteRentalCost(int days);

}
