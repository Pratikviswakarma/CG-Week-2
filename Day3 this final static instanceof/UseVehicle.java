import java.util.Scanner;

class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;
    private final int registrationNumber;
    private static double registrationFee;
    // Constructor
    public Vehicle(String ownerName, String vehicleType,int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber=registrationNumber;
    }
    // Instance methods
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration number "+registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }
    // Static method
    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}

public class UseVehicle {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Owner name: ");
        String ownerName = sc.next();
        System.out.println("Enter the Vehicle Type: ");
        String vehicleType = sc.next();
        System.out.println("Enter registration Number ");
        int registrationNumber=sc.nextInt();
        System.out.println("Enter the Registration Fee: ");
        double registrationFee = sc.nextDouble();
        // Create Vehicle object
        Vehicle vehicle = new Vehicle(ownerName, vehicleType,registrationNumber);
        // Call instance methods
        if(vehicle instanceof Vehicle){
            System.out.println("This is instanc of Vehicle class ");
        }
        vehicle.displayVehicleDetails();
        vehicle.displayVehicleDetails();
        // Call static method
        System.out.println("Updating the registration fee...");
        Vehicle.updateRegistrationFee(registrationFee);
        // Call instance methods
        vehicle.displayVehicleDetails();
        // Close Scanner
        sc.close();

    }
}
