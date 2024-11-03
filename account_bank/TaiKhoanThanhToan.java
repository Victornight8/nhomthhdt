package account_bank;

public class TaiKhoanThanhToan extends Account {
	private double gioiHanRut;

	public TaiKhoanThanhToan(long soTaiKhoan, String tenChuTaiKhoan, double soDu, String matKhau, double gioiHanRut) {
		super(soTaiKhoan, tenChuTaiKhoan, soDu, matKhau);
		this.gioiHanRut = gioiHanRut;
	}

	@Override
	public boolean rutTien(double soTien) {
		if (soTien > 0 && soTien <= getSoDu() + gioiHanRut) {
			guiTien(-soTien);
			return true;
		}
		System.out.println("Số tiền rút vượt quá hạn mức thấu chi hoặc không hợp lệ.");
		return false;
	}
}
