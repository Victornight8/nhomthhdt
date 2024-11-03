package VoHoangDinh_baitapcanhan;

public class TaiKhoanTietKiem extends TaiKhoan {
    private double laiSuat;

    public TaiKhoanTietKiem(double soDu, double laiSuat, String matKhau) {
        super("TKTK" + System.currentTimeMillis(), "Chủ TK", soDu, matKhau);
        this.laiSuat = laiSuat;
    }

    public double tinhLai() {
        return getSodu() * laiSuat / 100;
    }

    public void apDungLai() {
        double lai = tinhLai();
        setSodu(getSodu() + lai);
        System.out.println("Lãi suất đã được áp dụng! Số dư hiện tại: " + getSodu() + " VND");
    }

    @Override
    public void RutTien(double soTienRut, String matKhauNhap) {
        if (soTienRut < 0 || soTienRut > getSodu()) {
            System.out.println("Số tiền rút không hợp lệ");
        } else {
            setSodu(getSodu() - soTienRut);
            System.out.println("Đã rút thành công: " + soTienRut);
            System.out.println("Số dư hiện tại là: " + getSodu());
        }
    }
}