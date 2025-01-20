import java.util.Scanner;

class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;
    private static double registrationFee;
    // Constructor
    public Vehicle() {
        ownerName = "Unknown";
        vehicleType = "Unknown";
        registrationFee = 0;
    }


    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    // Instance methods
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
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
        System.out.println("Enter the Registration Fee: ");
        double registrationFee = sc.nextDouble();
        // Create Vehicle object
        Vehicle vehicle = new Vehicle();
        Vehicle vehicle2 = new Vehicle(ownerName, vehicleType);
        // Call instance methods
        vehicle.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        // Call static method
        System.out.println("Updating the registration fee...");
        Vehicle.updateRegistrationFee(registrationFee);
        // Call instance methods
        vehicle.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        // Close Scanner
        sc.close();

    }
}
