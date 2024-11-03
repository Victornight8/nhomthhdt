package nganhang;

public class TaiKhoanThanhToan extends TaiKhoan {
    private double phiDichVu;
    private double hanMucThauChi;

    public TaiKhoanThanhToan(String STK, String chuTK, String MK, double soDu, double phiDichVu, double hanMucThauChi) {
        super(STK, chuTK, MK, soDu);
        this.phiDichVu = phiDichVu;
        this.hanMucThauChi = hanMucThauChi;
    }

    public double getPhiDichVu() {
        return phiDichVu;
    }

    public void setPhiDichVu(double phiDichVu) {
        this.phiDichVu = phiDichVu;
    }

    public double getHanMucThauChi() {
        return hanMucThauChi;
    }

    public void setHanMucThauChi(double hanMucThauChi) {
        this.hanMucThauChi = hanMucThauChi;
    }

    @Override
    public void rutTien() {
        if (!xacThuc()) {
            System.out.println("Mat khau sai. Khong the thuc hien chuc nang nay.");
            return;
        }
        System.out.println("Nhap so tien muon rut: ");
        double tienRut = sc.nextDouble();
        sc.nextLine();  // Consume newline
        if (tienRut > soDu + hanMucThauChi) {
            System.out.println("So tien rut vuot qua han muc thau chi.");
        } else {
            soDu -= tienRut;
            System.out.println("Rut tien thanh cong. So du moi la: " + soDu);
        }
    }

    public void truPhiDichVu() {
        if (!xacThuc()) {
            System.out.println("Mat khau sai. Khong the thuc hien chuc nang nay.");
            return;
        }
        if (soDu >= phiDichVu) {
            soDu -= phiDichVu;
            System.out.println("Phi dich vu da duoc tru. So du moi la: " + soDu);
        } else {
            System.out.println("So du khong du de tru phi dich vu.");
        }
    }
}
