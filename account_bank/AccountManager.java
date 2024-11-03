package account_bank;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
	private ArrayList<Account> danhSachTaiKhoan = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);

	// Đăng ký tài khoản tiết kiệm
	public void dangKyTaiKhoanTietKiem() {
		System.out.print("Nhập số tài khoản: ");
		long soTaiKhoan = scanner.nextLong();
		scanner.nextLine(); // Bỏ qua dòng newline
		System.out.print("Nhập tên chủ tài khoản: ");
		String tenChuTaiKhoan = scanner.nextLine();
		System.out.print("Nhập số dư ban đầu: ");
		double soDu = scanner.nextDouble();
		System.out.print("Nhập mật khẩu: ");
		String matKhau = scanner.next();
		System.out.print("Nhập lãi suất: ");
		double laiSuat = scanner.nextDouble();

		Account taiKhoanTietKiem = new TaiKhoanTietKiem(soTaiKhoan, tenChuTaiKhoan, soDu, matKhau, laiSuat);
		danhSachTaiKhoan.add(taiKhoanTietKiem);
		System.out.println("Đăng ký tài khoản tiết kiệm thành công!");
	}

	// Đăng ký tài khoản thanh toán
	public void dangKyTaiKhoanThanhToan() {
		System.out.print("Nhập số tài khoản: ");
		long soTaiKhoan = scanner.nextLong();
		scanner.nextLine(); // Bỏ qua dòng newline
		System.out.print("Nhập tên chủ tài khoản: ");
		String tenChuTaiKhoan = scanner.nextLine();
		System.out.print("Nhập số dư ban đầu: ");
		double soDu = scanner.nextDouble();
		System.out.print("Nhập mật khẩu: ");
		String matKhau = scanner.next();
		System.out.print("Nhập hạn mức rút: ");
		double gioiHanRut = scanner.nextDouble();

		Account taiKhoanThanhToan = new TaiKhoanThanhToan(soTaiKhoan, tenChuTaiKhoan, soDu, matKhau, gioiHanRut);
		danhSachTaiKhoan.add(taiKhoanThanhToan);
		System.out.println("Đăng ký tài khoản thanh toán thành công!");
	}

	// Đăng nhập
	public Account dangNhap() {
		System.out.print("Nhập số tài khoản: ");
		long soTaiKhoan = scanner.nextLong();
		System.out.print("Nhập mật khẩu: ");
		String matKhau = scanner.next();

		for (Account taiKhoan : danhSachTaiKhoan) {
			if (taiKhoan.getSoTaiKhoan() == soTaiKhoan && taiKhoan.getMatKhau().equals(matKhau)) {
				return taiKhoan;
			}
		}
		return null;
	}

	// Gửi tiền
	public void guiTien(Account taiKhoan) {
		System.out.print("Nhập số tiền gửi: ");
		double soTien = scanner.nextDouble();
		taiKhoan.guiTien(soTien);
		System.out.println("Gửi tiền thành công! Số dư hiện tại: " + taiKhoan.getSoDu());
	}

	// Rút tiền
	public void rutTien(Account taiKhoan) {
		System.out.print("Nhập số tiền rút: ");
		double soTien = scanner.nextDouble();
		if (taiKhoan.rutTien(soTien)) {
			System.out.println("Rút tiền thành công! Số dư hiện tại: " + taiKhoan.getSoDu());
		} else {
			System.out.println("Rút tiền thất bại!");
		}
	}

	// Kiểm tra số dư
	public void kiemTraSoDu(Account taiKhoan) {
		System.out.println("Số dư hiện tại: " + taiKhoan.getSoDu());
	}

	// Chuyển khoản
	public void chuyenKhoan(Account taiKhoanNguon) {
		System.out.print("Nhập số tài khoản nhận: ");
		long soTaiKhoanNhan = scanner.nextLong();
		Account taiKhoanDich = timTaiKhoanTheoSo(soTaiKhoanNhan);

		if (taiKhoanDich != null) {
			System.out.print("Nhập số tiền chuyển: ");
			double soTien = scanner.nextDouble();
			if (taiKhoanNguon.rutTien(soTien)) {
				taiKhoanDich.guiTien(soTien);
				System.out.println(
						"Chuyển khoản thành công! Số dư hiện tại của tài khoản nguồn: " + taiKhoanNguon.getSoDu());
			} else {
				System.out.println("Chuyển khoản thất bại! Số dư không đủ.");
			}
		} else {
			System.out.println("Số tài khoản nhận không tồn tại.");
		}
	}

	// Đổi mật khẩu
	public void doiMatKhau(Account taiKhoan) {
		System.out.print("Nhập mật khẩu cũ: ");
		String matKhauCu = scanner.next();
		if (taiKhoan.getMatKhau().equals(matKhauCu)) {
			System.out.print("Nhập mật khẩu mới: ");
			String matKhauMoi = scanner.next();
			taiKhoan.setMatKhau(matKhauMoi);
			System.out.println("Đổi mật khẩu thành công!");
		} else {
			System.out.println("Mật khẩu cũ không đúng.");
		}
	}

	// Tính lãi cho tài khoản tiết kiệm
	public void tinhLai(TaiKhoanTietKiem taiKhoanTietKiem) {
		taiKhoanTietKiem.tinhLai();
	}

	// Tìm tài khoản theo số tài khoản
	private Account timTaiKhoanTheoSo(long soTaiKhoan) {
		for (Account taiKhoan : danhSachTaiKhoan) {
			if (taiKhoan.getSoTaiKhoan() == soTaiKhoan) {
				return taiKhoan;
			}
		}
		return null;
	}
}
