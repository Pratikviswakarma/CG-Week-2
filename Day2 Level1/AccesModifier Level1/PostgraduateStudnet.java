import java.util.Scanner;

class Student {

    public String rollNumber;
    protected String name;
    private double CGPA;

    public Student(){
        name="Pratik";
        rollNumber="0199CS211119";
        CGPA=7.8;
    }

    public Student(String rollNumber,String name){
        this.rollNumber=rollNumber;
        this.name=name;
    }

    public void setCGPA(double CGPA){
        this.CGPA=CGPA;
    }
    public void dispaly(){
        System.out.println("Roll Number is "+rollNumber);
        System.out.println("Name is "+name);
        System.out.println("CGPA is "+CGPA);
    }
}

public class PostgraduateStudnet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll number of studnet ");
        String rollNumber=sc.next();
        System.out.println("Enter studnet name ");
        String name=sc.next();
        System.out.println("Enter CGPA of student ");
        double CGPA=sc.nextDouble();

        Student st=new Student();
        Student st2=new Student(rollNumber,name);
        st2.setCGPA(CGPA);
        
        System.out.println("This name with protected modifiers "+name);
        st2.dispaly();

    }
}
