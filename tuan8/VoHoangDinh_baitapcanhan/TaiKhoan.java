package VoHoangDinh_baitapcanhan;

import java.util.Scanner;

public abstract class TaiKhoan {

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
    public void GUITIEN(double soTienGui, String matKhauNhap) {
        if (!this.matKhau.equals(matKhauNhap)) {
            System.out.println("Mật khẩu không đúng. Không thể thực hiện.");
            return;
        }
        if (soTienGui < 0) {
            System.out.println("Số tiền gửi không hợp lệ");
        } else {
            this.sodu += soTienGui;
            System.out.println("Đã chuyển " + soTienGui + " vào tài khoản");
            System.out.println("Số dư hiện tại là: " + sodu);
            System.out.println("Đã chuyển thành công!");
        }
    }

    // Phương thức rút tiền (được cài đặt trong lớp con)
    public abstract void RutTien(double soTienRut, String matKhauNhap);

    // Phương thức kiểm tra số dư
    public void SODU() {
        System.out.println("Số dư tài khoản là: " + this.sodu);
    }

    // Phương thức đổi mật khẩu
    public void doiMatKhau(String matKhauCu, String matKhauMoi) {
        if (this.matKhau.equals(matKhauCu)) {
            this.matKhau = matKhauMoi;
            System.out.println("Đã đổi mật khẩu thành công.");
        } else {
            System.out.println("Sai mật khẩu cũ.");
        }
    }

    // Hàm nhập thông tin tài khoản
    public static TaiKhoan nhapThongTinTaiKhoan(int loaiTaiKhoan) {
        Scanner sc = new Scanner(System.in);
        String sotk = "TK" + System.currentTimeMillis();

        System.out.printf("Nhập tên chủ tài khoản: ");
        String chutk = sc.nextLine();

        System.out.printf("Nhập mật khẩu: ");
        String matKhau = sc.nextLine();

        double sodu = 0; // Số dư khởi tạo
        
        // Tạo tài khoản dựa trên loại tài khoản
        if (loaiTaiKhoan == 1) {
            System.out.printf("Nhập lãi suất: ");
            double laiSuat = sc.nextDouble();
            return new TaiKhoanTietKiem(sodu, laiSuat, matKhau);
        } else {
            System.out.printf("Nhập phí dịch vụ: ");
            double phiDichVu = sc.nextDouble();
            return new TaiKhoanThanhToan(sodu, phiDichVu, matKhau);
        }
    }
}