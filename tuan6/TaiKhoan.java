package learn_java;

class TaiKhoan {
	private String soTaiKhoan;
	private String chuTaiKhoan;
	private double soDu;

	// Constructor
	public TaiKhoan(String soTaiKhoan, String chuTaiKhoan, double soDu) {
		this.soTaiKhoan = soTaiKhoan;
		this.chuTaiKhoan = chuTaiKhoan;
		this.soDu = soDu;
	}

	// gui tien
	public void guiTien(double soTien) {
		if (soTien > 0) {
			soDu += soTien;
			System.out.println("Gửi tiền thành công. Số dư hiện tại: " + soDu);
		} else {
			System.out.println("Số tiền gửi không hợp lệ.");
		}
	}

	// rut tien
	public void rutTien(double soTien) {
		if (soTien > 0 && soTien <= soDu) {
			soDu -= soTien;
			System.out.println("Rút tiền thành công. Số dư còn lại: " + soDu);
		} else {
			System.out.println("Số tiền rút không hợp lệ hoặc vượt quá số dư.");
		}
	}

	// kiem tra so du
	public void kiemTraSoDu() {
		System.out.println("Số dư hiện tại: " + soDu);
	}

	public static void main(String[] args) {
		TaiKhoan tk = new TaiKhoan("123456789", "Nguyen Van A", 1000.0);
		tk.kiemTraSoDu();
		tk.guiTien(500);
		tk.rutTien(300);
		tk.kiemTraSoDu();
	}
}
