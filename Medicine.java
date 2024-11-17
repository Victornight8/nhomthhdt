package hospital_management;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Medicine {
    private static final AtomicInteger counter = new AtomicInteger(10000); 
    // Khởi tạo bộ đếm bắt đầu từ 10000 để đảm bảo ID luôn có 5 chữ số.
    protected String medicineID;
    protected String name;
    protected String type;
    protected long quantity;
    protected LocalDate expiryDate;
    protected BigDecimal price;

    public Medicine() {
        this.medicineID = String.valueOf(counter.getAndIncrement()); 
        // Tự động tăng ID mỗi khi tạo đối tượng mới
    }

    public String getMedicineID() {
        return medicineID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Nhập tên thuốc: ");
        this.name = scanner.nextLine();

        System.out.print("Nhập loại thuốc: ");
        this.type = scanner.nextLine();

        System.out.print("Nhập số lượng: ");
        this.quantity = scanner.nextLong();

        System.out.print("Nhập ngày hết hạn (yyyy-MM-dd): ");
        String expiryDateStr = scanner.next();
        this.expiryDate = LocalDate.parse(expiryDateStr, formatter);

        System.out.print("Nhập giá: ");
        this.price = scanner.nextBigDecimal();
    }

    public void displayInfo() {
        System.out.println("Medicine ID: " + medicineID);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Quantity: " + quantity);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Price: " + price + " USD");
    }

    public static void main(String[] args) {
        Medicine med1 = new Medicine();
        med1.input();
        med1.displayInfo();
    }
}
