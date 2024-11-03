package nganhang;

import java.util.Scanner;

public class NganHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TaiKhoan taiKhoan = null;

        System.out.println("Chon loai tai khoan:");
        System.out.println("1. Tai khoan tiet kiem");
        System.out.println("2. Tai khoan thanh toan");
        System.out.print("Lua chon cua ban: ");
        int loaiTaiKhoan = sc.nextInt();
        sc.nextLine();  

        if (loaiTaiKhoan == 1) {
            System.out.println("Nhap so tai khoan: ");
            String STK = sc.nextLine();
            System.out.println("Nhap ten chu tai khoan: ");
            String chuTK = sc.nextLine();
            System.out.println("Nhap mat khau: ");
            String MK = sc.nextLine();
            System.out.println("Nhap so du ban dau: ");
            double soDu = sc.nextDouble();
            System.out.println("Nhap lai suat (%): ");
            double laiSuat = sc.nextDouble();
            System.out.println("Nhap thoi han tiet kiem (thang): ");
            int thoiHan = sc.nextInt();
            sc.nextLine(); 

            taiKhoan = new TaiKhoanTietKiem(STK, chuTK, MK, soDu, laiSuat, thoiHan);

        } else if (loaiTaiKhoan == 2) {
            System.out.println("Nhap so tai khoan: ");
            String STK = sc.nextLine();
            System.out.println("Nhap ten chu tai khoan: ");
            String chuTK = sc.nextLine();
            System.out.println("Nhap mat khau: ");
            String MK = sc.nextLine();
            System.out.println("Nhap so du ban dau: ");
            double soDu = sc.nextDouble();
            System.out.println("Nhap phi dich vu hang thang: ");
            double phiDichVu = sc.nextDouble();
            System.out.println("Nhap han muc thau chi: ");
            double hanMucThauChi = sc.nextDouble();
            sc.nextLine();  
            taiKhoan = new TaiKhoanThanhToan(STK, chuTK, MK, soDu, phiDichVu, hanMucThauChi);

        } else {
            System.out.println("Lua chon khong hop le!");
            sc.close();
            return;
        }

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Gui tien");
            System.out.println("2. Rut tien");
            System.out.println("3. Kiem tra so du");
            System.out.println("4. Doi mat khau");

            if (taiKhoan instanceof TaiKhoanTietKiem) {
                System.out.println("5. Tinh lai suat");
            } else if (taiKhoan instanceof TaiKhoanThanhToan) {
                System.out.println("5. Tru phi dich vu");
            }

            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    taiKhoan.guiTien();
                    break;
                case 2:
                    taiKhoan.rutTien();
                    break;
                case 3:
                    taiKhoan.kiemTra();
                    break;
                case 4:
                    taiKhoan.doiMatKhau();
                    break;
                case 5:
                    if (taiKhoan instanceof TaiKhoanTietKiem) {
                        ((TaiKhoanTietKiem) taiKhoan).tinhLaiSuat();
                    } else if (taiKhoan instanceof TaiKhoanThanhToan) {
                        ((TaiKhoanThanhToan) taiKhoan).truPhiDichVu();
                    }
                    break;
                case 0:
                    System.out.println("Tam biet!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
