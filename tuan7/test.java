package tuan7;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TaiKhoan[] danhSachTaiKhoan = null;
		int luaChon, soLuongTaiKhoan = 0;
		long soTaiKhoan;

		boolean tiepTuc = true;
		do {
			System.out.println("Chọn chức năng: ");
			System.out.println("1. Nhập thông tin khách hàng");
			System.out.println("2. Xem danh sách tài khoản");
			System.out.println("3. Nạp tiền");
			System.out.println("4. Rút tiền");
			System.out.println("5. Kiểm tra số dư");
			System.out.println("6. Đổi mật khẩu");
			System.out.println("Nhập số khác để thoát");

			luaChon = sc.nextInt();
			switch (luaChon) {
			case 1:
				System.out.println("Nhập số lượng khách hàng: ");
				soLuongTaiKhoan = sc.nextInt();
				danhSachTaiKhoan = new TaiKhoan[soLuongTaiKhoan];
				for (int i = 0; i < soLuongTaiKhoan; i++) {
					System.out.println("Khách hàng số " + (i + 1) + ": ");
					danhSachTaiKhoan[i] = new TaiKhoan(0, "", 0, "");
					danhSachTaiKhoan[i].nhapThongTin();
				}
				break;

			case 2:
				System.out.println("Danh sách tài khoản:");
				for (int i = 0; i < soLuongTaiKhoan; i++) {
					System.out.println("Số tài khoản: " + danhSachTaiKhoan[i].getSoTaiKhoan() + ", Chủ tài khoản: "
							+ danhSachTaiKhoan[i].getChuTaiKhoan() + ", Số dư: " + danhSachTaiKhoan[i].kiemTraSoDu());
				}
				break;

			case 3:
				System.out.println("Nhập số tài khoản cần nạp tiền: ");
				soTaiKhoan = sc.nextLong();
				for (TaiKhoan tk : danhSachTaiKhoan) {
					if (tk.getSoTaiKhoan() == soTaiKhoan) {
						System.out.println("Nhập số tiền cần nạp: ");
						double soTienNap = sc.nextDouble();
						tk.napTien(soTienNap);
						break;
					}
				}
				break;

			case 4:
				System.out.println("Nhập số tài khoản cần rút tiền: ");
				soTaiKhoan = sc.nextLong();
				for (TaiKhoan tk : danhSachTaiKhoan) {
					if (tk.getSoTaiKhoan() == soTaiKhoan) {
						System.out.println("Nhập số tiền cần rút: ");
						double soTienRut = sc.nextDouble();
						tk.rutTien(soTienRut);
						break;
					}
				}
				break;

			case 5:
				System.out.println("Nhập số tài khoản cần kiểm tra số dư: ");
				soTaiKhoan = sc.nextLong();
				for (TaiKhoan tk : danhSachTaiKhoan) {
					if (tk.getSoTaiKhoan() == soTaiKhoan) {
						System.out.println("Số dư hiện tại: " + tk.kiemTraSoDu());
						break;
					}
				}
				break;

			case 6:
				System.out.println("Nhập số tài khoản cần đổi mật khẩu: ");
				soTaiKhoan = sc.nextLong();
				sc.nextLine(); // Bỏ qua dòng thừa
				for (TaiKhoan tk : danhSachTaiKhoan) {
					if (tk.getSoTaiKhoan() == soTaiKhoan) {
						System.out.println("Nhập mật khẩu cũ: ");
						String matKhauCu = sc.nextLine();
						System.out.println("Nhập mật khẩu mới: ");
						String matKhauMoi = sc.nextLine();
						tk.doiMatKhau(matKhauCu, matKhauMoi);
						break;
					}
				}
				break;

			default:
				System.out.println("Thoát chương trình.");
				tiepTuc = false;
				break;
			}
		} while (tiepTuc);
	}
}
