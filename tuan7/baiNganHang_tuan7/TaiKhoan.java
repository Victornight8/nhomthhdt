package bai3;

import java.util.Scanner;

public class TaiKhoan {
    private String sotk;
    private String chutk;
    private double sodu;
    private String matKhau;

    public TaiKhoan(String sotk, String chutk, double sodu, String matKhau) {
        this.sotk = sotk;
        this.chutk = chutk;
        this.sodu = sodu;
        this.matKhau = matKhau;
    }

    public String getSotk() {
        return sotk;
    }

    public String getChutk() {
        return chutk;
    }

    public double getSodu() {
        return sodu;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setSotk(String sotk) {
        this.sotk = sotk;
    }

    public void setChutk(String chutk) {
        this.chutk = chutk;
    }

    public void setSodu(double sodu) {
        this.sodu = sodu;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    // Phương thức gửi tiền
    public void GUITIEN(double soTienGui){
        if (soTienGui < 0) {
            System.out.println("So tien gui khong dung");
            System.out.println("Chuyen that bai!");
        } else {
            this.sodu += soTienGui;
            System.out.println("Da chuyen " + soTienGui + " vao tai khoan");
            System.out.println("So du hien tai la: " + sodu);
            System.out.println("Da chuyen thanh cong!");
        }
    }

    // Phương thức rút tiền
    public void RUTTIEN(double soTienRut){
        if(soTienRut < 0 || soTienRut > this.sodu) {
            System.out.println("So tien rut khong hop le");
        } else {
            this.sodu -= soTienRut;
            System.out.println("Da rut thanh cong: " + soTienRut );
            System.out.println("so du hien tai la:"+ sodu);
        }
    }

    // Phương thức kiểm tra số dư
    public void SODU(){
        System.out.println("So du tai khoan la: " + this.sodu);
    }

    // Phương thức kiểm tra mật khẩu
    public void MATKHAU(){
        System.out.println("Mat khau cua ban la: " + this.matKhau);
    }

    // Phương thức đổi mật khẩu
    public void doiMatKhau(String matKhauCu, String matKhauMoi) {
        if (this.matKhau.equals(matKhauCu)) {
            this.matKhau = matKhauMoi;
            System.out.println("Da doi mat khau thanh cong.");
        } else {
            System.out.println("Sai mat khau cu.");
        }
    }

    // Hàm nhập thông tin tài khoản
    public static TaiKhoan nhapThongTinTaiKhoan() {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Nhap so tai khoan: ");
        String sotk = sc.next();

        System.out.printf("Nhap ten chu tai khoan: ");
        sc.nextLine();  // Tiêu thụ dòng còn lại sau khi nhập số tài khoản
        String chutk = sc.nextLine();

        System.out.printf("Nhap so du ban dau: ");
        double sodu = sc.nextDouble();

        System.out.printf("Nhap mat khau: ");
        String matKhau = sc.next();

        return new TaiKhoan(sotk, chutk, sodu, matKhau);  // Trả về đối tượng TaiKhoan mới
    }
}
