package bai3;

import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TaiKhoan tk = TaiKhoan.nhapThongTinTaiKhoan(); // Gọi phương thức nhập thông tin

        System.out.println("Chon phuong thuc ban muon thuc hien: ");
        System.out.println("1. Kiem tra so du hien tai.");
        System.out.println("2. Gui tien vao tai khoan");
        System.out.println("3. Rut tien");
        System.out.println("4. Doi mat khau");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                tk.SODU();
                break;
            case 2:
                System.out.printf("Nhap so tai khoan ban muon chuyen tien: ");
                String sotk1= sc.nextLine();
                sc.nextLine();
                System.out.printf("Nhap so tien muon gui: ");
                double soTienGui = sc.nextDouble();
                tk.GUITIEN(soTienGui);
                break;
            case 3:
                System.out.println("Nhap so tien muon rut: ");
                double soTienRut = sc.nextDouble();
                tk.RUTTIEN(soTienRut);
                break;
            case 4:
                System.out.println("Nhap mat khau cu: ");
                String matKhauCu = sc.next();
                System.out.println("Nhap mat khau moi: ");
                String matKhauMoi = sc.next();
                tk.doiMatKhau(matKhauCu, matKhauMoi);
                break;
            default:
                System.out.println("Lua chon cua ban khong hop le!");
        }
    }
}