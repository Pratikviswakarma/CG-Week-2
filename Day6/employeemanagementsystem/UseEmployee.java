package employeemanagementsystem;

public class UseEmployee {
    public static void main(String[] args) {
        Employee ft=new FullTimeEmployee(101,"Rishav",45000.00);
        Department dft=new FullTimeEmployee(101,"Rishav",45000.00);
        dft.assignDepartment("IT");
        dft.getDepartmentDetails();
        ft.displayDetails();
        ft.calculateSalary(8,1000);
        System.out.println("After updated ");
        System.out.println(ft.getBaseSalary());



        System.out.println();
        Employee pt=new PartTimeEmployee(102,"Anuj",50000.00);
        Department dpt=new PartTimeEmployee(102,"Anuj",50000.00);
        dpt.assignDepartment("HR");
        dpt.getDepartmentDetails();
        pt.displayDetails();
        pt.calculateSalary(12,800);
        System.out.println("After updated ");
        System.out.println(pt.getBaseSalary());
    }
}
