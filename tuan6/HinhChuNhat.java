package learn_java;

class HinhChuNhat {
	private double chieuDai;
	private double chieuRong;

	// Constructor
	public HinhChuNhat(double chieuDai, double chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	//
	public double tinhDienTich() {
		return chieuDai * chieuRong;
	}

	// Phương thức tính chu vi
	public double tinhChuVi() {
		return 2 * (chieuDai + chieuRong);
	}

	// In kết quả
	public void inKetQua() {
		System.out.println("Diện tích: " + tinhDienTich());
		System.out.println("Chu vi: " + tinhChuVi());
	}

	public static void main(String[] args) {
		HinhChuNhat hcn = new HinhChuNhat(5.0, 3.0);
		hcn.inKetQua();
	}

}
