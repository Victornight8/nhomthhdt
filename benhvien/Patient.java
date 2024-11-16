package benhvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Patient implements Person {
    private String idPatient; // ID bệnh nhân
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;
    private String medicalHistory;
    private List<String> appointments; // Sử dụng List để lưu nhiều lịch hẹn khám

    public Patient(String idPatient) {
        this.idPatient = idPatient;
        this.appointments = new ArrayList<>(); // Khởi tạo danh sách
    }

    public Patient(String idPatient, String name, int age, String gender, String address, String phone, String medicalHistory, List<String> appointments) {
        this.idPatient = idPatient;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.medicalHistory = medicalHistory;
        this.appointments = appointments;
    }

    public String getIdPatient() {
        return idPatient;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public List<String> getAppointments() {
        return appointments;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public void setAppointments(List<String> appointments) {
        this.appointments = appointments;
    }

    @Override
    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ten benh nhan: ");
        this.name = sc.nextLine();

        while (true) {
            System.out.println("Nhap tuoi: ");
            this.age = sc.nextInt();
            if (this.age >= 0) {
                break; // Thoát vòng lặp nếu tuổi hợp lệ
            } else {
                System.out.println("Tuoi khong hop le! Vui long nhap lai.");
            }
        }
        sc.nextLine(); // Đọc bỏ dòng còn lại

        while (true) {
            System.out.println("Nhap gioi tinh (Nam/Nu): ");
            this.gender = sc.nextLine();
            if (this.gender.equalsIgnoreCase("Nam") || this.gender.equalsIgnoreCase("Nu")) {
                break; 
            } else {
                System.out.println("Gioi tinh khong hop le! Vui long nhap lai.");
            }
        }

        System.out.println("Nhap dia chi benh nhan: ");
        this.address = sc.nextLine();

        System.out.println("Nhap so dien thoai: ");
        this.phone = sc.nextLine();

        System.out.println("Nhap lich su benh li: ");
        this.medicalHistory = sc.nextLine();

        // Nhập danh sách các lịch hẹn khám
        this.appointments = new ArrayList<>();
        System.out.println("Nhap cac lich hen (nhap 'x' de ket thuc): ");
        while (true) {
            String appointment = sc.nextLine();
            if (appointment.equalsIgnoreCase("x")) {
                break; // Thoát vòng lặp khi người dùng nhập 'x'
            }
            this.appointments.add(appointment); // Thêm lịch hẹn vào danh sách
        }
    }

    @Override
    public void XuatThongTin() {
        System.out.println("Thong tin benh nhan " + this.name);
        System.out.println("Tuoi: " + this.age);
        System.out.println("Gioi tinh: " + this.gender);
        System.out.println("Dia chi: " + this.address);
        System.out.println("So dien thoai: " + this.phone);
        System.out.println("Tien su benh li: " + this.medicalHistory);
        System.out.print("Lich hen: ");
        for (String appointment : appointments) {
            System.out.print(appointment + " ");
        }
        System.out.println();
    }
}