package tuan6;

import java.util.ArrayList;
import java.util.Scanner;

class SinhVien {
	private String maSinhVien;
	private String ten;
	private String ngaySinh;
	private double diemTrungBinh;

	// Constructor
	public SinhVien(String maSinhVien, String ten, String ngaySinh, double diemTrungBinh) {
		this.maSinhVien = maSinhVien;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.diemTrungBinh = diemTrungBinh;
	}

	// Nhap thong tin sinh vien
	public static SinhVien nhapThongTin(Scanner scanner) {
		System.out.print("Nhập mã sinh viên: ");
		String maSinhVien = scanner.nextLine();

		System.out.print("Nhập tên sinh viên: ");
		String ten = scanner.nextLine();

		System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
		String ngaySinh = scanner.nextLine();

		System.out.print("Nhập điểm trung bình: ");
		double diemTrungBinh = scanner.nextDouble();
		scanner.nextLine();

		return new SinhVien(maSinhVien, ten, ngaySinh, diemTrungBinh);
	}

	// In thong tin sinh vien
	public void inThongTin() {
		System.out.println("Mã sinh viên: " + maSinhVien);
		System.out.println("Tên: " + ten);
		System.out.println("Ngày sinh: " + ngaySinh);
		System.out.println("Điểm trung bình: " + diemTrungBinh);
		System.out.println();
	}

	// Getter diem trung binh
	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public static void sapXepTheoDiemTrungBinhGiamDan(ArrayList<SinhVien> danhSach) {
		int n = danhSach.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (danhSach.get(j).getDiemTrungBinh() < danhSach.get(j + 1).getDiemTrungBinh()) {
					SinhVien temp = danhSach.get(j);
					danhSach.set(j, danhSach.get(j + 1));
					danhSach.set(j + 1, temp);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();

		System.out.print("Nhập số lượng sinh viên: ");
		int soLuong = scanner.nextInt();
		scanner.nextLine(); //

		for (int i = 0; i < soLuong; i++) {
			System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
			SinhVien sv = SinhVien.nhapThongTin(scanner);
			danhSachSinhVien.add(sv);
		}

		// sap xep diem giam dan
		SinhVien.sapXepTheoDiemTrungBinhGiamDan(danhSachSinhVien);

		// in danh sach
		System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm trung bình giảm dần:");
		for (SinhVien sv : danhSachSinhVien) {
			sv.inThongTin();
		}

		scanner.close();
	}
}
