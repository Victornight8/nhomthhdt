package account_bank;

import java.util.Scanner;

public class MainProject {
	public static void main(String[] args) {
		AccountManager manager = new AccountManager();
		Scanner sc = new Scanner(System.in);
		int luaChon;
		boolean run = true;

		do {
			System.out.println("+-------------------------+");
			System.out.println("|        CHÀO MỪNG       |");
			System.out.println("+-------------------------+");
			System.out.println("| 1. Đăng nhập            |");
			System.out.println("| 2. Đăng ký Tài khoản TK |");
			System.out.println("| 3. Đăng ký Tài khoản TT |");
			System.out.println("| 4. Thoát                |");
			System.out.println("+-------------------------+");
			System.out.print("Vui lòng chọn: ");
			luaChon = sc.nextInt();

			if (luaChon == 1) {
				Account taiKhoanHienTai = manager.dangNhap();
				if (taiKhoanHienTai != null) {
					System.out.println("Đăng nhập thành công! Xin chào.");
					boolean loggedIn = true;
					while (loggedIn) {
						System.out.println("+-------------------------+");
						System.out.println("| 1. Gửi tiền             |");
						System.out.println("| 2. Rút tiền             |");
						System.out.println("| 3. Kiểm tra số dư       |");
						System.out.println("| 4. Chuyển khoản         |");
						System.out.println("| 5. Đổi mật khẩu         |");
						System.out.println("| 6. Tính lãi suất        |");
						System.out.println("| 7. Đăng xuất            |");
						System.out.println("+-------------------------+");
						System.out.print("Chọn chức năng: ");
						int action = sc.nextInt();

						switch (action) {
						case 1 -> manager.guiTien(taiKhoanHienTai);
						case 2 -> manager.rutTien(taiKhoanHienTai);
						case 3 -> manager.kiemTraSoDu(taiKhoanHienTai);
						case 4 -> manager.chuyenKhoan(taiKhoanHienTai);
						case 5 -> manager.doiMatKhau(taiKhoanHienTai);
						case 6 -> {
							if (taiKhoanHienTai instanceof TaiKhoanTietKiem) {
								manager.tinhLai((TaiKhoanTietKiem) taiKhoanHienTai);
							} else {
								System.out.println("Chức năng này chỉ áp dụng cho tài khoản tiết kiệm.");
							}
						}
						case 7 -> loggedIn = false;
						default -> System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
						}
					}
				} else {
					System.out.println("Đăng nhập thất bại! Số tài khoản hoặc mật khẩu không đúng.");
				}
			} else if (luaChon == 2) {
				manager.dangKyTaiKhoanTietKiem();
			} else if (luaChon == 3) {
				manager.dangKyTaiKhoanThanhToan();
			} else if (luaChon == 4) {
				run = false;
				System.out.println("Đã thoát hệ thống. Tạm biệt!");
			}
		} while (run);
		sc.close();
	}
}
