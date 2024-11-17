package hospital_management;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Prescription extends Medicine {

    public Prescription() {
        super();
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Nhập tên thuốc: ");
        this.name = scanner.nextLine();

        System.out.print("Nhập loại thuốc: ");
        this.type = scanner.nextLine();

        boolean validQuantity = false;
        while (!validQuantity) {
            System.out.print("Nhập số lượng: ");
            this.quantity = scanner.nextLong();

            if (this.quantity < 20) {
                System.out.println("Số lượng thuốc phải nhiều hơn 20.");
            } else {
                validQuantity = true;
            }
        }

        boolean validExpiryDate = false;
        scanner.nextLine();  // Đọc bỏ ký tự xuống dòng
        while (!validExpiryDate) {
            System.out.print("Nhập ngày hết hạn (yyyy-MM-dd): ");
            String expiryDateStr = scanner.nextLine();
            try {
                this.expiryDate = LocalDate.parse(expiryDateStr, formatter);
                if (!this.expiryDate.isAfter(LocalDate.now())) {
                    System.out.println("Thuốc đã hết hạn.");
                } else {
                    validExpiryDate = true;
                }
            } catch (Exception e) {
                System.out.println("Định dạng ngày không hợp lệ.");
            }
        }

        System.out.print("Nhập giá: ");
        this.price = scanner.nextBigDecimal();
    }

    public static void main(String[] args) {
        Prescription pres1 = new Prescription();
        pres1.input();
        pres1.displayInfo();
    }
}
