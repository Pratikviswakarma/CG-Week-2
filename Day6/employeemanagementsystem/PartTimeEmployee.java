package employeemanagementsystem;

class PartTimeEmployee extends Employee  implements Department  {
    private  int workingHours;
    private double salaryperhour;
    private  double updateSalary;
    private  String departmentName;
    public PartTimeEmployee(int employeeId,String name,double baseSalary){
        super(employeeId, name, baseSalary);
    }


    @Override
    public void calculateSalary(int workinghour,double salaryperHour) {
        this.workingHours=workinghour;
        this.salaryperhour=salaryperHour;
        updateSalary=(workingHours*salaryperhour)+getBaseSalary();
        System.out.println("Final Salary is "+updateSalary);
    }
    public double getBaseSalary(){
        return updateSalary;
    }
    public void assignDepartment(String departmentName){
        this.departmentName=departmentName;
    }
    public String getDepartmentDetails(){
        return departmentName;
    }
    public  void displayDetails(){
        System.out.println("Part Time Employee id is "+getEmployeeId());
        System.out.println("Part Time Employee name is "+getName());
        System.out.println("Part Time Base salary is "+getBaseSalary());
    }
}
