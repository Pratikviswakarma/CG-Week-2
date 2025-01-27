package ridehailingapplication;

public class UseVehicle {
    public static void displayFareDetails(Vehicle vehicle, double distance) {
        System.out.println(vehicle.getVehicleDetails());
        System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));
        if (vehicle instanceof GPS) {
            GPS gps = (GPS) vehicle;
            System.out.println("Current Location: " + gps.getCurrentLocation());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Vehicle car = new Car("C001", "John", 15.0);
        Vehicle bike = new Bike("B001", "Alice", 8.0);
        Vehicle auto = new Auto("A001", "Raj", 10.0);

        // Updating locations using GPS
        ((GPS) car).updateLocation("Downtown");
        ((GPS) bike).updateLocation("City Center");
        ((GPS) auto).updateLocation("Mall Road");

        // Displaying fare details for a ride
        System.out.println("Ride Fare Details:");
        displayFareDetails(car, 10.5);
        displayFareDetails(bike, 8.2);
        displayFareDetails(auto, 12.0);
    }
}