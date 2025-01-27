package hospitalpatientmanagement;

public class UsePatient {
    public static void displayBillingDetails(Patient patient) {
        System.out.println(patient.getPatientDetails());
        System.out.println("Diagnosis: " + patient.getDiagnosis());
        System.out.println("Bill Amount: " + patient.calculateBill());
    }

    public static void main(String[] args) {
        // InPatient Example
        InPatient inPatient = new InPatient("P001", "John Doe", 45, "Pneumonia", "Diabetic", 1500.0, 5);
        inPatient.addRecord("Admitted on 2025-01-10");
        inPatient.addRecord("Discharged on 2025-01-15");

        // OutPatient Example
        OutPatient outPatient = new OutPatient("P002", "Jane Smith", 30, "Fever", "No major history", 500.0);
        outPatient.addRecord("Visited on 2025-01-18");

        // Display Billing Details
        System.out.println("InPatient Billing Details:");
        displayBillingDetails(inPatient);
        System.out.println("Medical Records: " + inPatient.viewRecords());

        System.out.println("\nOutPatient Billing Details:");
        displayBillingDetails(outPatient);
        System.out.println("Medical Records: " + outPatient.viewRecords());
    }
}

