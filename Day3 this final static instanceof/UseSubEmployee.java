import java.util.Scanner;

class Employee {
    private static String companyName;
    private String empName;
    private final int id;
    private String designation;
    private static int noOfEmp;
    // Constructor
    public Employee(String companyName,String empName,int id,String designation) {
        this.companyName=companyName;
        this.empName=empName;
        this.id = id;
        this.designation = designation;
        noOfEmp++;
    }

    // Method to modify the salary
    public static int displayTotalEmployees(){
        return noOfEmp;
    }

     // Method to display details
     public void displayManagerDetails() {
        System.out.println("Company Name is "+companyName);
        System.out.println("Employee Name is "+empName);
        System.out.println("Employee ID: " + id);
        System.out.println("Department: " + designation);
        System.out.println("Total Number of Emp "+displayTotalEmployees());
    }
}

class SubEmployee extends Employee {
    // Constructor
    public SubEmployee(String companyName,String empName, int id, String designation) {
        super(companyName,empName, id, designation);
    }
}
public class UseSubEmployee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter company Name that can't change ");
        String companyName=sc.nextLine();
        System.out.println("Enter Employee Name");
        String empName=sc.nextLine();
        System.out.println("Enter Emp id");
        int id=sc.nextInt();
        System.out.println("Enter Designation");
        String designation=sc.next();
        SubEmployee manager = new SubEmployee(companyName,empName,id,designation);

        if(manager instanceof SubEmployee){
            System.out.println("This is instance of SubEmployee ");
        }
        // Display manager details
        manager.displayManagerDetails();
        manager.displayManagerDetails();
    }
}

