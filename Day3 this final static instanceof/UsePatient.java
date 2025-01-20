import java.util.Scanner;

import javafx.scene.transform.Scale;

class Patient {
    private static String hospitalName;
    private String name;
    private int age;
    private String ailment;
    private final int patientId;
    private static int noOfPatients;
    
    public Patient(String hospitalName,String name,int age,String ailment,int patientId){
        this.hospitalName=hospitalName;
        this.name=name;
        this.age=age;
        this.ailment=ailment;
        this.patientId=patientId;
        noOfPatients++;
    }
    public void dispaly(){
        System.out.println("Hospital name "+hospitalName);
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("Ailment is "+ailment);
        System.out.println("Patient id is "+patientId);
    }

    public static void getTotalPatients(){
        System.out.println("Total number of Patients are "+noOfPatients);
    }
}

public class UsePatient {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Hospital name , name , age , ailment and patient id ");
        System.out.println("Enter hospital Name ");
        String hospitalName=sc.next();
        System.out.println("Enter Name ");
        String name=sc.next();
        System.out.println("Enter age ");
        int age=sc.nextInt();
        System.out.println("Enter ailment");
        String ailment=sc.next();
        System.out.println("Enter patient id");
        int patientId=sc.nextInt();

        Patient p=new Patient(hospitalName, name, age, ailment, patientId);
        if(p instanceof Patient){
            System.out.println("This is instance of Patient ");
        }
        p.getTotalPatients();
        p.dispaly();

    }
}
