import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DoctorList {
    private List<Doctor> doctors;

    public DoctorList() {
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        if (findDoctor(doctor.getId()) == null) {
            doctors.add(doctor);
        } else {
            System.out.println("Bác sĩ với ID này đã tồn tại!");
        }
    }

    public boolean removeDoctor(String idDoctor) {
        Iterator<Doctor> iterator = doctors.iterator();
        while (iterator.hasNext()) {
            Doctor doctor = iterator.next();
            if (doctor.getId().equalsIgnoreCase(idDoctor)) {
                iterator.remove();
                return true; // Trả về true nếu xóa thành công
            }
        }
        return false; // Trả về false nếu không tìm thấy bác sĩ
    }

    public Doctor findDoctor(String idDoctor) {
        for (Doctor doctor : doctors) {
            if (doctor.getId().equalsIgnoreCase(idDoctor)) {
                return doctor; // Trả về bác sĩ nếu tìm thấy
            }
        }
        return null; // Trả về null nếu không tìm thấy
    }

    public boolean updateDoctor(String idDoctor, Doctor updatedDoctor) {
        for (int i = 0; i < doctors.size(); i++) {
            if (doctors.get(i).getId().equalsIgnoreCase(idDoctor)) {
                doctors.set(i, updatedDoctor);
                return true; // Trả về true nếu cập nhật thành công
            }
        }
        return false; // Trả về false nếu không tìm thấy bác sĩ
    }

    public void displayDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("Danh sach bac si trong.");
            return;
        }
        System.out.println("Danh sach bac si: ");
        for (Doctor doctor : doctors) {
            doctor.XuatThongTin();
            System.out.println("-------------------------");
        }
    }
}