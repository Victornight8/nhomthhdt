package account_bank;

public abstract class Account {
	private long soTaiKhoan;
	private String tenChuTaiKhoan;
	private double soDu;
	private String matKhau;

	public Account(long soTaiKhoan, String tenChuTaiKhoan, double soDu, String matKhau) {
		this.soTaiKhoan = soTaiKhoan;
		this.tenChuTaiKhoan = tenChuTaiKhoan;
		this.soDu = soDu;
		this.matKhau = matKhau;
	}

	public long getSoTaiKhoan() {
		return soTaiKhoan;
	}

	public double getSoDu() {
		return soDu;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public void guiTien(double soTien) {
		soDu += soTien;
	}

	public abstract boolean rutTien(double soTien);
}
