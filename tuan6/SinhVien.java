package tuan6;

import java.util.ArrayList;
import java.util.Scanner;

class SinhVien {
	private String maSinhVien;
	private String ten;
	private String ngaySinh;
	private double diemTrungBinh;

	public SinhVien(String maSinhVien, String ten, String ngaySinh, double diemTrungBinh) {
		this.maSinhVien = maSinhVien;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.diemTrungBinh = diemTrungBinh;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void inThongTin() {
		System.out.println("Mã sinh viên: " + maSinhVien);
		System.out.println("Tên: " + ten);
		System.out.println("Ngày sinh: " + ngaySinh);
		System.out.println("Điểm trung bình: " + diemTrungBinh);
		System.out.println("-----------------------------------");
	}

	public static void main(String[] args) {
		ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int luaChon;

		do {
			System.out.println("Menu:");
			System.out.println("1. Thêm sinh viên");
			System.out.println("2. Hiện danh sách sinh viên");
			System.out.println("3. Sắp xếp sinh viên theo điểm giảm dần");
			System.out.println("0. Thoát");
			System.out.print("Chọn chức năng: ");
			luaChon = scanner.nextInt();
			scanner.nextLine(); // Xử lý dòng mới

			switch (luaChon) {
			case 1:
				System.out.print("Nhập mã sinh viên: ");
				String maSinhVien = scanner.nextLine();
				System.out.print("Nhập tên: ");
				String ten = scanner.nextLine();
				System.out.print("Nhập ngày sinh: ");
				String ngaySinh = scanner.nextLine();
				System.out.print("Nhập điểm trung bình: ");
				double diemTrungBinh = scanner.nextDouble();
				danhSachSinhVien.add(new SinhVien(maSinhVien, ten, ngaySinh, diemTrungBinh));
				break;

			case 2:
				for (SinhVien sv : danhSachSinhVien) {
					sv.inThongTin();
				}
				break;

			case 3:
				// Sắp xếp theo điểm giảm dần
				for (int i = 0; i < danhSachSinhVien.size() - 1; i++) {
					for (int j = i + 1; j < danhSachSinhVien.size(); j++) {
						if (danhSachSinhVien.get(i).getDiemTrungBinh() < danhSachSinhVien.get(j).getDiemTrungBinh()) {
							SinhVien temp = danhSachSinhVien.get(i);
							danhSachSinhVien.set(i, danhSachSinhVien.get(j));
							danhSachSinhVien.set(j, temp);
						}
					}
				}
				System.out.println("Đã sắp xếp sinh viên theo điểm giảm dần.");
				break;

			case 0:
				System.out.println("Thoát chương trình.");
				break;

			default:
				System.out.println("Chức năng không hợp lệ.");
				break;
			}
		} while (luaChon != 0);

		scanner.close();
	}
}
