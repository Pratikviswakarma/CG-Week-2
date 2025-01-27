package employeemanagementsystem;

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId,String name,double baseSalary){
        this.employeeId=employeeId;
        this.name=name;
        this.baseSalary=baseSalary;
    }
    public double getBaseSalary(){
        return  baseSalary;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary=baseSalary;
    }
    abstract public  void calculateSalary(int workinghour,double salaryperhour);

    public  void displayDetails(){
        System.out.println("Employee id is "+employeeId);
        System.out.println("Employee name is "+name);
        System.out.println("Base salary is "+baseSalary);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}