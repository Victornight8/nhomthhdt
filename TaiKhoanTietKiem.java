package taiKhoanNganHang01;

public class TaiKhoanTietKiem extends TaiKhoan {
	private double laiSuat;

	public TaiKhoanTietKiem(long soTaiKhoan, String tenChuTaiKhoan, double soDu, String matKhau, double laiSuat) {
		super(soTaiKhoan, tenChuTaiKhoan, soDu, matKhau);
		this.laiSuat = laiSuat;
	}

	public boolean rutTien(double soTien) {
		if (soTien > 0 && getSoDu() >= soTien) {
			guiTien(-soTien);
			return true;
		}
		System.out.println("Số dư không đủ.");
		return false;
	}

	public void tinhLai() {
		double tienLai = getSoDu() * laiSuat;
		guiTien(tienLai);
		System.out.println("Lãi suất đã được cộng vào tài khoản. Số dư hiện tại: " + getSoDu());
	}
}
