

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Doctor extends Person {
    private String specialty;
    private String phoneNumber;
    private String email;
    private List<String> availability; // Thời gian làm việc
    private String apartment;           // Phòng khám

    public Doctor(String id) {
        super(id);
        this.availability = new ArrayList<>();
    }

    @Override
    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ten bac si: ");
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

        System.out.print("Nhap chuyen khoa: ");
        specialty = sc.nextLine();

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

        System.out.println("Nhap thoi gian lam viec (nhap 'stop' de ket thuc): ");
        while (true) {
            String timeSlot = sc.nextLine();
            if (timeSlot.equalsIgnoreCase("stop")) {
                break;
            }
            availability.add(timeSlot);
        }

        System.out.print("Nhap phong kham: ");
        apartment = sc.nextLine();
    }

    @Override
    public void XuatThongTin() {
        System.out.println("Bac si [ID: " + getId() + ", Ten: " + getName() +
                           ", Tuoi: " + getAge() + ", Gioi tinh: " + getGender() +
                           ", Chuyen khoa: " + specialty + 
                           ", So dien thoai: " + phoneNumber + 
                           ", Email: " + email +
                           ", Thoi gian lam viec: " + String.join(", ", availability) + 
                           ", Phong kham: " + apartment + "]");
    }
}