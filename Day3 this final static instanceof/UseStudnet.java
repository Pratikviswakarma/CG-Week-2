import java.util.Scanner;

class Student {
    private static String universityName;
    private final String rollNumber;
    private String name;
    private char grade;
    private static int noOfStudent;

    public Student(){
        name="Pratik";
        rollNumber="0199CS211119";
        noOfStudent++;
    }

    public Student(String universityName,String rollNumber,String name){
        this.universityName=universityName;
        this.rollNumber=rollNumber;
        this.name=name;
        noOfStudent++;
    }

    public void dispaly(){
        System.out.println("University Name is "+universityName);
        System.out.println("Roll Number is "+rollNumber);
        System.out.println("Name is "+name);
        System.out.println("Grade of this student "+grade);
    }

    public void calculateMarks(int math,int chem,int phy){
        int temp=(math+chem+phy/3)*100;
        if(temp>70){
            grade='A';
        }else if(temp >60){
            grade='B';
        }else if(temp>50){
            grade='C';
        }else {
            grade='F';
        }
    }
    public void displayTotalStudents(){
        System.out.println("Total students are "+noOfStudent);
    }
}

public class UseStudnet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter university name ");
        String universityName=sc.next();
        System.out.println("Enter roll number of studnet ");
        String rollNumber=sc.next();
        System.out.println("Enter studnet name ");
        String name=sc.next();
      
        System.out.println("Enter your maths,chemestry and physics marks");
        System.out.println("Enter Math number");
        int math=sc.nextInt();
        System.out.println("Enter chemstry number ");
        int chem=sc.nextInt();
        System.out.println("Enter Physics number ");
        int physics=sc.nextInt();
        Student st=new Student(universityName,rollNumber,name);
        if(st instanceof Student){
            System.out.println("This is instance of Studnet");
        }
        st.calculateMarks(math, chem, physics);
        st.dispaly();

    }
}
