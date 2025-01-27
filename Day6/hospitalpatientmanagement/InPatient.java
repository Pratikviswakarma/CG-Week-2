package hospitalpatientmanagement;
import java.util.List;
import java.util.ArrayList;
class InPatient extends Patient implements MedicalRecord {
    private double roomCharge;
    private int daysAdmitted;
    private List<String> records;

    public InPatient(String patientId, String name, int age, String diagnosis, String medicalHistory, double roomCharge, int daysAdmitted) {
        super(patientId, name, age, diagnosis, medicalHistory);
        this.roomCharge = roomCharge;
        this.daysAdmitted = daysAdmitted;
        this.records = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return roomCharge * daysAdmitted;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return records;
    }
}