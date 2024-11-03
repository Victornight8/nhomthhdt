package VoHoangDinh_baitapcanhan;

import java.util.Scanner;
import java.util.HashMap;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static class TAOTK {

        private HashMap<String, TaiKhoan> users = new HashMap<>();
        private Scanner scanner = new Scanner(System.in);

        // Hàm đăng ký
        public void DangKy() {
            System.out.print("Nhập tên đăng nhập: ");
            String username = scanner.nextLine();
            if (users.containsKey(username)) {
                System.out.println("Tên đăng nhập đã tồn tại. Vui lòng chọn tên đăng nhập khác.");
                return;
            }

            System.out.println("Chọn loại tài khoản: ");
            System.out.println("1. Tài khoản tiết kiệm");
            System.out.println("2. Tài khoản thanh toán");
            int loaiTaiKhoan = Integer.parseInt(scanner.nextLine());

            TaiKhoan taiKhoan = TaiKhoan.nhapThongTinTaiKhoan(loaiTaiKhoan);
            users.put(username, taiKhoan);
            System.out.println("Đăng ký thành công!");
        }

        // Hàm đăng nhập
        public void login() {
            System.out.print("Nhập tên đăng nhập: ");
            String username = scanner.nextLine();
            System.out.print("Nhập mật khẩu: ");
            String password = scanner.nextLine();

            // Kiểm tra tài khoản và mật khẩu
            if (users.containsKey(username) && users.get(username).getMatKhau().equals(password)) {
                System.out.println("Đăng nhập thành công!");
                accountMenu(users.get(username));
            } else {
                System.out.println("Tên đăng nhập hoặc mật khẩu không chính xác.");
            }
        }

        // Menu tài khoản
        private void accountMenu(TaiKhoan taiKhoan) {
            while (true) {
                System.out.println("-----------MENU-----------");
                System.out.println("1. Kiểm tra số dư hiện tại.");
                System.out.println("2. Gửi tiền vào tài khoản");
                System.out.println("3. Rút tiền");
                System.out.println("4. Đổi mật khẩu");
                System.out.println("5. Áp dụng lãi suất (nếu là tài khoản tiết kiệm)");
                System.out.println("6. Thanh toán (nếu là tài khoản thanh toán)");
                System.out.println("0. Thoát");
                System.out.print("Chọn phương thức bạn muốn thực hiện: ");

                String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        taiKhoan.SODU();
                        break;
                    case "2":
                        System.out.print("Nhập số tiền muốn gửi: ");
                        double soTienGui = scanner.nextDouble();
                        System.out.print("Nhập mật khẩu: ");
                        String matKhauGui = scanner.next();
                        taiKhoan.GUITIEN(soTienGui, matKhauGui);
                        scanner.nextLine(); // Tiêu thụ dòng còn lại
                        break;
                    case "3":
                        System.out.print("Nhập số tiền muốn rút: ");
                        double soTienRut = scanner.nextDouble();
                        System.out.print("Nhập mật khẩu: ");
                        String matKhauRut = scanner.next();
                        taiKhoan.RutTien(soTienRut, matKhauRut);
                        scanner.nextLine(); // Tiêu thụ dòng còn lại
                        break;
                    case "4":
                        System.out.print("Nhập mật khẩu cũ: ");
                        String matKhauCu = scanner.next();
                        System.out.print("Nhập mật khẩu mới: ");
                        String matKhauMoi = scanner.next();
                        taiKhoan.doiMatKhau(matKhauCu, matKhauMoi);
                        scanner.nextLine(); // Tiêu thụ dòng còn lại
                        break;
                    case "5":
                        if (taiKhoan instanceof TaiKhoanTietKiem) {
                            ((TaiKhoanTietKiem) taiKhoan).apDungLai();
                        } else {
                            System.out.println("Chức năng này chỉ dành cho tài khoản tiết kiệm.");
                        }
                        break;
                    case "6":
                        if (taiKhoan instanceof TaiKhoanThanhToan) {
                            System.out.print("Nhập số tiền thanh toán: ");
                            double soTienThanhToan = scanner.nextDouble();
                            System.out.print("Nhập mật khẩu: ");
                            String matKhauThanhToan = scanner.next();
                            ((TaiKhoanThanhToan) taiKhoan).thanhToan(soTienThanhToan);
                            scanner.nextLine(); // Tiêu thụ dòng còn lại
                        } else {
                            System.out.println("Chức năng này chỉ dành cho tài khoản thanh toán.");
                        }
                        break;
                    case "0":
                        System.out.println("Thoát tài khoản.");
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                }
            }
        }

        // Menu điều hướng
        public void showMenu() {
            while (true) {
                System.out.println("\n----- MENU -----");
                System.out.println("1. Đăng ký");
                System.out.println("2. Đăng nhập");
                System.out.println("0. Thoát");
                System.out.print("Chọn chức năng: ");

                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        DangKy();
                        break;
                    case 2:
                        login();
                        break;
                    case 0:
                        System.out.println("Thoát chương trình.");
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                }
            }
        }
    }

    public static void main(String[] args) {
        // Tạo chương trình chạy tiếng Việt có dấu 
        try {
            OutputStream outputStream = System.out;
            PrintStream printStream = new PrintStream(outputStream, true, StandardCharsets.UTF_8.name());
            System.setOut(printStream);
        } catch (Exception e) {
            e.printStackTrace();
        }

        TAOTK tk = new TAOTK();
        tk.showMenu();
    }
}