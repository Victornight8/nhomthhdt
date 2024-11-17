
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Patient extends Person {
    private String address;
    private String phoneNumber;
    private String email;
    private String medicalHistory; // Lịch sử y tế
    private List<Appointment> appointments; // Danh sách lịch hẹn

    public Patient(String id) {
        super(id);
        this.appointments = new ArrayList<>();
    }

    @Override
    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ten benh nhan: ");
        setName(sc.nextLine());

        int age;
        while (true) {
            System.out.print("Nhap tuoi: ");
            age = sc.nextInt();
            if (age > 0 && age < 120) {
                setAge(age);
                break;
            } else {
                System.out.println("Tuoi khong hop le! Vui long nhap lai.");
            }
        }
        sc.nextLine(); // Đọc bỏ dòng còn lại

        System.out.print("Nhap gioi tinh: ");
        setGender(sc.nextLine());

        System.out.print("Nhap dia chi: ");
        address = sc.nextLine();

        while (true) {
            System.out.print("Nhap so dien thoai: ");
            phoneNumber = sc.nextLine();
            if (phoneNumber.matches("\\d{10}")) { // Kiểm tra định dạng số điện thoại
                break;
            } else {
                System.out.println("So dien thoai khong hop le! Vui long nhap lai.");
            }
        }

        System.out.print("Nhap email: ");
        email = sc.nextLine();

        System.out.print("Nhap lich su y te: ");
        medicalHistory = sc.nextLine();
    }

    @Override
    public void XuatThongTin() {
        System.out.println("Benh nhan [ID: " + getId() + ", Ten: " + getName() +
                           ", Tuoi: " + getAge() + ", Gioi tinh: " + getGender() +
                           ", Dia chi: " + address + 
                           ", So dien thoai: " + phoneNumber + 
                           ", Email: " + email + 
                           ", Lich su y te: " + medicalHistory + "]");
        
        if (!appointments.isEmpty()) {
            System.out.println("Danh sach lich hen: ");
            for (Appointment appointment : appointments) {
                System.out.println(appointment);
            }
        } else {
            System.out.println("Khong co lich hen nao.");
        }
    }

    // Phương thức thêm lịch hẹn
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }
}