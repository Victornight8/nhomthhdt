package nganhang;
import java.util.Scanner;

public class NganHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tai khoan: ");
        String STK = sc.nextLine();
        System.out.println("Nhap ten chu tai khoan: ");
        String chuTK = sc.nextLine();
        System.out.println("Nhap mat khau: ");
        String MK = sc.nextLine();
        System.out.println("Nhap so du ban dau: ");
        double soDu = sc.nextDouble();
        sc.nextLine();  // Clear the newline character

        // Tạo đối tượng TaiKhoan
        TaiKhoan tk = new TaiKhoan(STK, chuTK, MK, soDu);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Gui tien");
            System.out.println("2. Rut tien");
            System.out.println("3. Kiem tra so du");
            System.out.println("4. Doi mat khau");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    tk.guiTien();
                    break;
                case 2:
                    tk.rutTien();
                    break;
                case 3:
                    tk.kiemTra();
                    break;
                case 4:
                    tk.doiMatKhau();
                    break;
                case 0:
                    System.out.println("Tam biet!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
