package VoHoangDinh_baitapcanhan;

public class TaiKhoanThanhToan extends TaiKhoan {
    private double phiDichVu;

    public TaiKhoanThanhToan(double soDu, double phiDichVu, String matKhau) {
        super("TKTT" + System.currentTimeMillis(), "Chủ TK", soDu, matKhau);
        this.phiDichVu = phiDichVu;
    }

    @Override
    public void RutTien(double soTienRut, String matKhauNhap) {
        if (soTienRut < 0) {
            System.out.println("Số tiền rút không hợp lệ");
        } else {
            double tongRut = soTienRut + phiDichVu;
            if (tongRut > getSodu()) {
                System.out.println("Số dư không đủ để thực hiện rút tiền.");
            } else {
                setSodu(getSodu() - tongRut);
                System.out.println("Đã rút thành công: " + soTienRut + ", Phí dịch vụ: " + phiDichVu);
                System.out.println("Số dư hiện tại là: " + getSodu());
            }
        }
    }

    public void thanhToan(double soTien) {
        if (soTien + phiDichVu <= getSodu()) {
            setSodu(getSodu() - (soTien + phiDichVu));
            System.out.println("Thanh toán thành công! Số tiền đã thanh toán: " + soTien +
                               ", Phí dịch vụ: " + phiDichVu);
        } else {
            System.out.println("Số dư không đủ để thực hiện thanh toán.");
        }
    }

    public void tinhPhiDichVu() {
        System.out.println("Phí dịch vụ hiện tại: " + phiDichVu);
    }
}