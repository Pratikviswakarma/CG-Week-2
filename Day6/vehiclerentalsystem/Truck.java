package vehiclerentalsystem;

class Truck extends Vehicle implements Insurable{
    private int totalRent;
    private int insureanceCharge;
    private int insureancePolicyNumber=1011011102;

    public Truck(int vehicleNumber,String type,int rentalRate){
        super(vehicleNumber, type, rentalRate);
    }
    public int getInsureancePolicyNumber() {
        return insureancePolicyNumber;
    }
    public void calcualteRentalCost(int days){
        totalRent=getRentalRate()*days;
        System.out.println("Total Rental cost is "+totalRent);
    }
    public void calculateInsurance(){
        insureanceCharge=totalRent+500;
    }

    public void getInsureanceDeatails(){
        System.out.println("Insureance Charge is "+insureanceCharge);
        System.out.println("Insureance Policy number is "+getInsureancePolicyNumber());
    }

}

