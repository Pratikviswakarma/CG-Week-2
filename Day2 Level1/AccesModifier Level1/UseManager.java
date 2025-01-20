class Employee {
    public String employeeID;
    protected String department;
    private double salary;

    // Constructor
    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Method to get the salary
    public double getSalary() {
        return salary;
    }

    // Method to modify the salary
    public void setSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
            System.out.println("Salary updated to: " + newSalary);
        } else {
            System.out.println("Salary must be positive.");
        }
    }
}

class Manager extends Employee {
    private String team;

    // Constructor
    public Manager(String employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
        System.out.println("Team: " + team);
    }
}
public class UseManager {
    public static void main(String[] args) {
        Manager manager = new Manager("M123", "Sales", 75000.0, "North Region");

        // Display manager details
        manager.displayManagerDetails();
        
        // Modify the salary
        manager.setSalary(80000.0);
        
        // Display updated details
        manager.displayManagerDetails();
    }
}

