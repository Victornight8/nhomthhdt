package tuan6;

class TaiKhoan {
	private String soTaiKhoan;
	private String chuTaiKhoan;
	private double soDu;

	public TaiKhoan(String soTaiKhoan, String chuTaiKhoan, double soDu) {
		this.soTaiKhoan = soTaiKhoan;
		this.chuTaiKhoan = chuTaiKhoan;
		this.soDu = soDu;
	}

	public void guiTien(double soTien) {
		if (soTien > 0) {
			soDu += soTien;
			System.out.println("Gửi thành công: " + soTien);
		} else {
			System.out.println("Số tiền gửi không hợp lệ.");
		}
	}

	public void rutTien(double soTien) {
		if (soTien > 0 && soTien <= soDu) {
			soDu -= soTien;
			System.out.println("Rút thành công: " + soTien);
		} else {
			System.out.println("Số tiền rút không hợp lệ.");
		}
	}

	public void kiemTraSoDu() {
		System.out.println("Số dư hiện tại: " + soDu);
	}

	public static void main(String[] args) {
		TaiKhoan tk = new TaiKhoan("123456789", "Nguyen Van A", 5000);

		tk.kiemTraSoDu();
		tk.guiTien(1000);
		tk.kiemTraSoDu();
		tk.rutTien(2000);
		tk.kiemTraSoDu();
	}
}
