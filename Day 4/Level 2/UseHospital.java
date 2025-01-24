// Patient class
class Patient {
    private String name;

    // Constructor
    public Patient(String name) {
        this.name = name;
    }

    // Get patient name
    public String getName() {
        return name;
    }
}

// Doctor class
class Doctor {
    private String name;
    private Patient[] patients;
    private int patientCount;

    // Constructor
    public Doctor(String name, int maxPatients) {
        this.name = name;
        this.patients = new Patient[maxPatients]; // Fixed size array for patients
        this.patientCount = 0;
    }

    // Method to consult a patient
    public void consult(Patient patient) {
        if (patientCount < patients.length) {
            patients[patientCount] = patient;
            patientCount++;
            System.out.println("Dr. " + name + " is consulting patient " + patient.getName());
        } else {
            System.out.println("Dr. " + name + " cannot consult more patients.");
        }
    }

    // Display all patients of the doctor
    public void displayPatients() {
        System.out.println("Dr. " + name + "'s Patients:");
        for (int i = 0; i < patientCount; i++) {
            System.out.println("- " + patients[i].getName());
        }
    }

    // Get doctor name
    public String getName() {
        return name;
    }
}

// Hospital class
class Hospital {
    private String hospitalName;
    private Doctor[] doctors;
    private int doctorCount;

    // Constructor
    public Hospital(String hospitalName, int maxDoctors) {
        this.hospitalName = hospitalName;
        this.doctors = new Doctor[maxDoctors]; // Fixed size array for doctors
        this.doctorCount = 0;
    }

    // Add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        if (doctorCount < doctors.length) {
            doctors[doctorCount] = doctor;
            doctorCount++;
        } else {
            System.out.println("Hospital " + hospitalName + " cannot add more doctors.");
        }
    }

    // Display hospital details and its doctors
    public void displayHospitalInfo() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (int i = 0; i < doctorCount; i++) {
            System.out.println("- Dr. " + doctors[i].getName());
        }
    }
}

// Main class to demonstrate association and communication
public class  UseHospital {
   
    public static void main(String[] args) {
        // Create a hospital with a maximum of 3 doctors
        Hospital hospital = new Hospital("City Hospital", 3);

        // Create doctors with a maximum of 3 patients each
        Doctor doctor1 = new Doctor("Alice", 3);
        Doctor doctor2 = new Doctor("Bob", 3);

        // Add doctors to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        // Create patients
        Patient patient1 = new Patient("John");
        Patient patient2 = new Patient("Sarah");
        Patient patient3 = new Patient("Mike");
        Patient patient4 = new Patient("Anna");

        // Consultations
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient3);
        doctor2.consult(patient4);

        System.out.println();

        // Display hospital details
        hospital.displayHospitalInfo();
        System.out.println();

        // Display doctor-patient relationships
        doctor1.displayPatients();
        System.out.println();
        doctor2.displayPatients();
    }
}
