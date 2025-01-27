package hospitalpatientmanagement;
import java.util.List;
import java.util.ArrayList;
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records;

    public OutPatient(String patientId, String name, int age, String diagnosis, String medicalHistory, double consultationFee) {
        super(patientId, name, age, diagnosis, medicalHistory);
        this.consultationFee = consultationFee;
        this.records = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return consultationFee;
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
