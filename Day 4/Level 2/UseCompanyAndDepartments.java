// Employee class
class Employee {
    private String name;
    private String position;

    // Constructor
    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // Display employee details
    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name + ", Position: " + position);
    }
}

// Department class
class Department {
    private String departmentName;
    private Employee[] employees;
    private int employeeCount;

    // Constructor
    public Department(String departmentName, int maxEmployees) {
        this.departmentName = departmentName;
        this.employees = new Employee[maxEmployees]; // Fixed size
        this.employeeCount = 0;
    }

    // Add an employee to the department
    public void addEmployee(String name, String position) {
        if (employeeCount < employees.length) {
            employees[employeeCount] = new Employee(name, position);
            employeeCount++;
        } else {
            System.out.println("Department " + departmentName + " is full. Cannot add more employees.");
        }
    }

    // Display department details and employees
    public void displayDepartmentInfo() {
        System.out.println("Department: " + departmentName);
        System.out.println("Employees:");
        for (int i = 0; i < employeeCount; i++) {
            employees[i].displayEmployeeInfo();
        }
    }
}

// Company class
class Company {
    private String companyName;
    private Department[] departments;
    private int departmentCount;

    // Constructor
    public Company(String companyName, int maxDepartments) {
        this.companyName = companyName;
        this.departments = new Department[maxDepartments]; // Fixed size
        this.departmentCount = 0;
    }

    // Add a department to the company
    public void addDepartment(String departmentName, int maxEmployees) {
        if (departmentCount < departments.length) {
            departments[departmentCount] = new Department(departmentName, maxEmployees);
            departmentCount++;
        } else {
            System.out.println("Company " + companyName + " is full. Cannot add more departments.");
        }
    }

    // Add an employee to a specific department
    public void addEmployeeToDepartment(String departmentName, String employeeName, String position) {
        for (int i = 0; i < departmentCount; i++) {
            if (departments[i].departmentName.equals(departmentName)) {
                departments[i].addEmployee(employeeName, position);
                return;
            }
        }
        System.out.println("Department " + departmentName + " not found in " + companyName);
    }

    // Display company details and its departments
    public void displayCompanyInfo() {
        System.out.println("Company: " + companyName);
        System.out.println("Departments:");
        for (int i = 0; i < departmentCount; i++) {
            departments[i].displayDepartmentInfo();
            System.out.println();
        }
    }
}

// Main class to demonstrate composition
public class UseCompanyAndDepartments {
    public static void main(String[] args) {
        // Create a company with a maximum of 3 departments
        Company company = new Company("TechCorp", 3);

        // Add departments to the company
        company.addDepartment("IT", 2);       // IT department can have 2 employees
        company.addDepartment("HR", 1);      // HR department can have 1 employee
        company.addDepartment("Finance", 2); // Finance department can have 2 employees

        // Add employees to departments
        company.addEmployeeToDepartment("IT", "Alice", "Software Engineer");
        company.addEmployeeToDepartment("IT", "Bob", "Network Administrator");
        company.addEmployeeToDepartment("IT", "Charlie", "System Analyst"); // IT department is full

        company.addEmployeeToDepartment("HR", "Charlie", "HR Manager");
        company.addEmployeeToDepartment("HR", "Diana", "Recruiter"); // HR department is full

        company.addEmployeeToDepartment("Finance", "Eve", "Accountant");
        company.addEmployeeToDepartment("Finance", "Frank", "Financial Analyst");

        // Display company details
        company.displayCompanyInfo();

        // Remove the company (implicitly by setting it to null and forcing garbage collection)
        company = null;
        System.gc(); // Request garbage collection (not guaranteed to run immediately)
    }
}
