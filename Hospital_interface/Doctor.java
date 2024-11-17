package benhvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Doctor implements Person {
    private String idDoctor; // ID bác sĩ
    private String name;
    private int age;
    private String gender;
    private String specialization;
    private String phone;
    private String email;
    private List<String> availability; // Sử dụng List để lưu nhiều ngày rảnh
    private String apartment;

    public Doctor(String idDoctor) {
        this.idDoctor = idDoctor;
        this.availability = new ArrayList<>(); // Khởi tạo danh sách
    }

    public Doctor(String idDoctor, String name, int age, String gender, String specialization, String phone, String email, List<String> availability, String apartment) {
        this.idDoctor = idDoctor;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.specialization = specialization;
        this.phone = phone;
        this.email = email;
        this.availability = availability;
        this.apartment = apartment;
    }

    public String getIdDoctor() {
        return idDoctor;
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

    public String getSpecialization() {
        return specialization;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getAvailability() {
        return availability;
    }

    public String getApartment() {
        return apartment;
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

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAvailability(List<String> availability) {
        this.availability = availability;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    @Override
    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap ten bac si: ");
        this.name = sc.nextLine();
        
        // Nhập tuổi với kiểm tra tính hợp lệ
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
        
        // Nhập giới tính với kiểm tra
        while (true) {
            System.out.println("Nhap gioi tinh (Nam/Nu): ");
            this.gender = sc.nextLine();
            if (this.gender.equalsIgnoreCase("Nam") || this.gender.equalsIgnoreCase("Nu")) {
                break; // Thoát vòng lặp nếu giới tính hợp lệ
            } else {
                System.out.println("Gioi tinh khong hop le! Vui long nhap lai.");
            }
        }

        System.out.println("Nhap chuyen khoa cua bac si: ");
        this.specialization = sc.nextLine();
        
        System.out.println("Nhap so dien thoai bac si: ");
        this.phone = sc.nextLine();
        
        System.out.println("Nhap email bac si: ");
        this.email = sc.nextLine();
        
        // Nhập danh sách các ngày rảnh
        this.availability = new ArrayList<>();
        System.out.println("Nhap cac ngay ranh (nhap 'x' de ket thuc): ");
        while (true) {
            String day = sc.nextLine();
            if (day.equalsIgnoreCase("x")) {
                break; // Thoát vòng lặp khi người dùng nhập 'x'
            }
            this.availability.add(day); // Thêm ngày vào danh sách
        }
        
        System.out.println("Nhap ten phong kham: ");
        this.apartment = sc.nextLine();
    }

    @Override
    public void XuatThongTin() {
        System.out.println("Thong tin bac si " + this.name);
        System.out.println("Tuoi: " + this.age);
        System.out.println("Gioi tinh: " + this.gender);
        System.out.println("Chuyen khoa: " + this.specialization);
        System.out.println("Dien thoai: " + this.phone);
        System.out.println("Email: " + this.email);
        System.out.println("Phong kham: " + this.apartment);
        System.out.print("Thoi gian ranh: ");
        for (String day : availability) {
            System.out.print(day + " ");
        }
        System.out.println();
    }
}