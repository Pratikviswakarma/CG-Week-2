import java.util.Scanner;

class HotelBookingSystem{
    // Instance variables
    private String guestName;
    private String roomType;
    private String nights;
    // Constructors
    public HotelBookingSystem(){
        guestName="Guest";
        roomType="Normal";
        nights="1";
    }
    // Parameterized constructor
    public HotelBookingSystem(String guestName,String roomType,String nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }
    // Copy constructor
    public HotelBookingSystem(HotelBookingSystem hbs){
        this.guestName=hbs.guestName;
        this.roomType=hbs.roomType;
        this.nights=hbs.nights;
    }
    // Display method
    public void display(){
        System.out.println("Guest Name: "+guestName);
        System.out.println("Room Type: "+roomType);
        System.out.println("Number of Nights: "+nights);
    }

}

public class UseHotelBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the guest name: ");
        String guestName = sc.nextLine();
        System.out.println("Enter the room type: ");
        String roomType = sc.nextLine();
        System.out.println("Enter the number of nights: ");
        String nights = sc.nextLine();
        // Creating objects
        HotelBookingSystem hbs1 = new HotelBookingSystem();
        HotelBookingSystem hbs2 = new HotelBookingSystem(guestName, roomType, nights);
        HotelBookingSystem hbs3=new HotelBookingSystem(hbs2);
        // Displaying the details
        hbs1.display();
        hbs2.display();
        hbs3.display();
        // Closing the scanner
        sc.close();
    }
}
