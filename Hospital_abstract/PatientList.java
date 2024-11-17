import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PatientList {
    private List<Patient> patients;

    public PatientList() {
        this.patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        if (findPatient(patient.getId()) == null) {
            patients.add(patient);
        } else {
            System.out.println("Bệnh nhân với ID này đã tồn tại!");
        }
    }

    public boolean removePatient(String idPatient) {
        Iterator<Patient> iterator = patients.iterator();
        while (iterator.hasNext()) {
            Patient patient = iterator.next();
            if (patient.getId().equalsIgnoreCase(idPatient)) {
                iterator.remove();
                return true; // Trả về true nếu xóa thành công
            }
        }
        return false; // Trả về false nếu không tìm thấy bệnh nhân
    }

    public Patient findPatient(String idPatient) {
        for (Patient patient : patients) {
            if (patient.getId().equalsIgnoreCase(idPatient)) {
                return patient; // Trả về bệnh nhân nếu tìm thấy
            }
        }
        return null; // Trả về null nếu không tìm thấy
    }

    public boolean updatePatient(String idPatient, Patient updatedPatient) {
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).getId().equalsIgnoreCase(idPatient)) {
                patients.set(i, updatedPatient);
                return true; // Trả về true nếu cập nhật thành công
            }
        }
        return false; // Trả về false nếu không tìm thấy bệnh nhân
    }

    public void displayPatients() {
        if (patients.isEmpty()) {
            System.out.println("Danh sách bệnh nhân trống.");
            return;
        }
        System.out.println("Danh sach benh nhan: ");
        for (Patient patient : patients) {
            patient.XuatThongTin();
            System.out.println("-------------------------");
        }
    }
}