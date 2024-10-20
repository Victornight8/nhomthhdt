package taiKhoanNganHang;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		TaiKhoan tk = new TaiKhoan(); 

        System.out.println("Bạn muốn sử dụng phương thức nào: ");
        System.out.println("1. Kiểm tra tài khoản");
        System.out.println("2. Gửi tiền vào tài khoản");
        System.out.println("3. Rút tiền khỏi tài khoản");
        System.out.println("4. Đổi mật khẩu");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                tk.KiemTraSoDu();
                break;
            case 2:
                System.out.printf("Nhập số tiền bạn muốn gửi vào tài khoản: ");
                double tienGui = sc.nextDouble();
                tk.GuiTien(tienGui);
                break;
            case 3:
                System.out.println("Nhập số tiền bạn muốn rút khỏi tài khoản: ");
                double tienRut = sc.nextDouble();
                tk.RutTien(tienRut);
                break;
            case 4:
            	System.out.print("Ấn phím 9 để xác nhận đổi mật khẩu: ");
            	int CHOICE=sc.nextInt();
        		if(CHOICE==9) {
        			System.out.println("Nhập mật khẩu: ");
                    String matKhauCu = sc.next();
                    /*sc.next(): Đọc và trả về từ tiếp theo, tức là chuỗi được ngăn cách bởi khoảng trắng 
                    (space, tab hoặc newline). Nó không đọc hết dòng hiện tại.*/
                    System.out.println("Nhập mật khẩu mới: ");
                    String matKhauMoi = sc.next();
                    tk.DoiMatKhau(matKhauCu, matKhauMoi);
        		}
                break;
            default:
                System.out.println("Lựa chọn của bạn không hợp lệ");
        }
    }
}

