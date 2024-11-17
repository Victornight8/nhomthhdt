package benhvien;

import java.util.Scanner;
import java.time.LocalDateTime;

public class BenhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoctorList doctorList = new DoctorList();
        PatientList patientList = new PatientList();
        AppointmentList appointmentList = new AppointmentList(); 
        int choice;

        do {
            System.out.println("\n================== MENU ==================");
            System.out.println("1. Them bac si");
            System.out.println("2. Xoa bac si");
            System.out.println("3. Tim bac si");
            System.out.println("4. Cap nhat bac si");
            System.out.println("5. Hien thi danh sach bac si");
            System.out.println("6. Them benh nhan");
            System.out.println("7. Xoa benh nhan");
            System.out.println("8. Tim benh nhan");
            System.out.println("9. Cap nhat benh nhan");
            System.out.println("10. Hien thi danh sach benh nhan");
            System.out.println("11. Them lich hen");
            System.out.println("12. Hien thi danh sach lich hen");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            choice = sc.nextInt();
            sc.nextLine(); // Đọc bỏ dòng còn lại

            switch (choice) {
                case 1:
                    // Thêm bác sĩ
                    System.out.print("Nhap ID bac si: ");
                    String doctorId = sc.nextLine();
                    Doctor newDoctor = new Doctor(doctorId);
                    newDoctor.NhapThongTin();
                    doctorList.addDoctor(newDoctor);
                    System.out.println("Them bac si thanh cong.");
                    break;

                case 2:
                    // Xóa bác sĩ
                    System.out.print("Nhap ID bac si can xoa: ");
                    String removeDoctorId = sc.nextLine();
                    boolean removedDoctor = doctorList.removeDoctor(removeDoctorId);
                    if (removedDoctor) {
                        System.out.println("Xoa bac si thanh cong.");
                    } else {
                        System.out.println("Khong tim thay bac si de xoa.");
                    }
                    break;

                case 3:
                    // Tìm kiếm bác sĩ
                    System.out.print("Nhap ID bac si can tim: ");
                    String searchDoctorId = sc.nextLine();
                    Doctor foundDoctor = doctorList.findDoctor(searchDoctorId);
                    if (foundDoctor != null) {
                        System.out.println("Bac si tim thay: ");
                        foundDoctor.XuatThongTin();
                    } else {
                        System.out.println("Khong tim thay bac si.");
                    }
                    break;

                case 4:
                    // Cập nhật thông tin bác sĩ
                    System.out.print("Nhap ID bac si can cap nhat: ");
                    String updateDoctorId = sc.nextLine();
                    Doctor updatedDoctor = new Doctor(updateDoctorId);
                    updatedDoctor.NhapThongTin();
                    boolean updated = doctorList.updateDoctor(updateDoctorId, updatedDoctor);
                    if (updated) {
                        System.out.println("Cap nhat thong tin bac si thanh cong.");
                    } else {
                        System.out.println("Khong tim thay bac si de cap nhat.");
                    }
                    break;

                case 5:
                    // Hiển thị danh sách bác sĩ
                    doctorList.displayDoctors();
                    break;

                case 6:
                    // Thêm bệnh nhân
                    System.out.print("Nhap ID benh nhan: ");
                    String patientId = sc.nextLine();
                    Patient newPatient = new Patient(patientId);
                    newPatient.NhapThongTin();
                    patientList.addPatient(newPatient);
                    System.out.println("Them benh nhan thanh cong.");
                    break;

                case 7:
                    // Xóa bệnh nhân
                    System.out.print("Nhap ID benh nhan can xoa: ");
                    String removePatientId = sc.nextLine();
                    boolean removedPatient = patientList.removePatient(removePatientId);
                    if (removedPatient) {
                        System.out.println("Xoa benh nhan thanh cong.");
                    } else {
                        System.out.println("Khong tim thay benh nhan de xoa.");
                    }
                    break;

                case 8:
                    // Tìm kiếm bệnh nhân
                    System.out.print("Nhap ID benh nhan can tim: ");
                    String searchPatientId = sc.nextLine();
                    Patient foundPatient = patientList.findPatient(searchPatientId);
                    if (foundPatient != null) {
                        System.out.println("Benh nhan tim thay: ");
                        foundPatient.XuatThongTin();
                    } else {
                        System.out.println("Khong tim thay benh nhan.");
                    }
                    break;

                case 9:
                    // Cập nhật thông tin bệnh nhân
                    System.out.print("Nhap ID benh nhan can cap nhat: ");
                    String updatePatientId = sc.nextLine();
                    Patient updatedPatient = new Patient(updatePatientId);
                    updatedPatient.NhapThongTin();
                    boolean updatedPatientInfo = patientList.updatePatient(updatePatientId, updatedPatient);
                    if (updatedPatientInfo) {
                        System.out.println("Cap nhat thong tin benh nhan thanh cong.");
                    } else {
                        System.out.println("Khong tim thay benh nhan de cap nhat.");
                    }
                    break;

                case 10:
                    // Hiển thị danh sách bệnh nhân
                    patientList.displayPatients();
                    break;

                case 11:
                    // Thêm lịch hẹn
                    System.out.print("Nhap ID lich hen: ");
                    String appointmentId = sc.nextLine();
                    System.out.print("Nhap ID bac si: ");
                    String doctorIdForAppointment = sc.nextLine();
                    System.out.print("Nhap ID benh nhan: ");
                    String patientIdForAppointment = sc.nextLine();
                    System.out.print("Nhap ngay gio lich hen (yyyy-mm-ddThh:mm): ");
                    LocalDateTime appointmentDateTime = LocalDateTime.parse(sc.nextLine());

                    Appointment newAppointment = new Appointment(appointmentId, doctorIdForAppointment, patientIdForAppointment, appointmentDateTime);
                    appointmentList.addAppointment(newAppointment);
                    System.out.println("Them lich hen thanh cong.");
                    break;

                case 12:
                    // Hiển thị danh sách lịch hẹn
                    appointmentList.displayAppointments();
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le! Vui long chon lai.");
            }
        } while (choice != 0);

        sc.close();
    }
}