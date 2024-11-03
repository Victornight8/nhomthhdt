package nganhang;

import java.util.Scanner;

public abstract class TaiKhoan {
    private String STK;
    private String chuTK;
    private String MK;
    protected double soDu = 0;
    protected Scanner sc = new Scanner(System.in);

    // Constructor đầy đủ
    public TaiKhoan(String STK, String chuTK, String MK, double soDu) {
        this.STK = STK;
        this.chuTK = chuTK;
        this.MK = MK;
        this.soDu = soDu;
    }

    public TaiKhoan() {}

    public String getSTK() {
        return STK;
    }

    public String getChuTK() {
        return chuTK;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSTK(String STK) {
        this.STK = STK;
    }

    public void setChuTK(String chuTK) {
        this.chuTK = chuTK;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    protected boolean xacThuc() {
        System.out.println("Nhap mat khau: ");
        String mk = sc.nextLine();
        return this.MK.equals(mk);
    }

    public void guiTien() {
        if (!xacThuc()) {
            System.out.println("Mat khau sai. Khong the thuc hien chuc nang nay.");
            return;
        }
        System.out.println("Nhap so tien muon gui: ");
        double tienGui = sc.nextDouble();
        sc.nextLine();  // Consume newline
        if (tienGui < 0) {
            System.out.println("So tien khong hop le");
        } else {
            this.soDu += tienGui;
            System.out.println("Gui tien thanh cong.");
        }
    }

    public abstract void rutTien();

    public void kiemTra() {
        if (!xacThuc()) {
            System.out.println("Mat khau sai. Khong the thuc hien chuc nang nay.");
            return;
        }
        System.out.println("So du hien tai: " + this.soDu);
    }

    public void doiMatKhau() {
        if (!xacThuc()) {
            System.out.println("Mat khau sai. Khong the thuc hien chuc nang nay.");
            return;
        }
        System.out.println("Nhap mat khau moi: ");
        String mkMoi = sc.nextLine();
        this.MK = mkMoi;
        System.out.println("Doi mat khau thanh cong!");
    }
}
