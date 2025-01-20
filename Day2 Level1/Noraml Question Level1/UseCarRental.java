import java.util.Scanner;

class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private int costPerDay;
    private int totalCost;

    public CarRental() {
        customerName = "Not set";
        carModel = "Not set";
        rentalDays = 0;
    }

    public CarRental(String customerName, String carModel, int rentalDays,int costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay=costPerDay;
        totalCost=rentalDays*costPerDay;
    }

    public void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Cost per day: " + costPerDay);
    }
}

public class UseCarRental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the customer name: ");
        String customerName = sc.nextLine();
        System.out.println("Enter the car model: ");
        String carModel = sc.nextLine();
        System.out.println("Enter the number of rental days: ");
        int rentalDays = sc.nextInt();
        System.out.println("Enter cost per day: ");
        int costPerDay = sc.nextInt();
        // Creating objects
        CarRental cr1 = new CarRental();
        CarRental cr2 = new CarRental(customerName, carModel, rentalDays,costPerDay);
        // Displaying the details
        cr1.display();
        cr2.display();
        // Closing the scanner
        sc.close();
    }
    
}