package tuan7;

import java.util.Scanner;

public class TaiKhoan {
	private long soTaiKhoan;
	private String chuTaiKhoan;
	private double soDu;
	private String matKhau;

	// Constructor
	public TaiKhoan() {

	}

	public TaiKhoan(long soTaiKhoan, String chuTaiKhoan, double soDu, String matKhau) {
		this.soTaiKhoan = soTaiKhoan;
		this.chuTaiKhoan = chuTaiKhoan;
		this.soDu = soDu;
		this.matKhau = matKhau;
	}

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập số tài khoản: ");
		this.soTaiKhoan = sc.nextLong();
		sc.nextLine();

		System.out.println("Nhập tên chủ tài khoản: ");
		this.chuTaiKhoan = sc.nextLine();

		System.out.println("Nhập mật khẩu tài khoản: ");
		this.matKhau = sc.nextLine();

		// Số dư được thiết lập mặc định là 50
		this.soDu = 50;
		System.out.println("Số dư mặc định: " + this.soDu);
	}

	// Getters Setters
	public long getSoTaiKhoan() {
		return soTaiKhoan;
	}

	public void setSoTaiKhoan(long soTaiKhoan) {
		this.soTaiKhoan = soTaiKhoan;
	}

	public String getChuTaiKhoan() {
		return chuTaiKhoan;
	}

	public void setChuTaiKhoan(String chuTaiKhoan) {
		this.chuTaiKhoan = chuTaiKhoan;
	}

	public double getSoDu() {
		return soDu;
	}

	public void setSoDu(double soDu) {
		this.soDu = soDu;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	// Phương thức nạp tiền
	public void napTien(double soTien) {
		if (soTien > 0) {
			this.soDu += soTien;
			System.out.println("Nạp tiền thành công! Số dư mới: " + this.soDu);
		} else {
			System.out.println("Số tiền nạp không hợp lệ!");
		}
	}

	// Phương thức rút tiền
	public void rutTien(double soTien) {
		if (soTien > 0 && soTien <= this.soDu) {
			this.soDu -= soTien;
			System.out.println("Rút tiền thành công! Số dư mới: " + this.soDu);
		} else {
			System.out.println("Số tiền rút không hợp lệ!");
		}
	}

	// Phương thức kiểm tra số dư
	public double kiemTraSoDu() {
		return this.soDu;
	}

	// Phương thức đổi mật khẩu
	public void doiMatKhau(String matKhauCu, String matKhauMoi) {
		if (this.matKhau.equals(matKhauCu)) {
			this.matKhau = matKhauMoi;
			System.out.println("Đổi mật khẩu thành công!");
		} else {
			System.out.println("Mật khẩu cũ không đúng!");
		}
	}
}
