package hospital_management;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Medicine {
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

    public abstract void input();

    public void displayInfo() {
        System.out.println("Medicine ID: " + medicineID);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Quantity: " + quantity);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Price: " + price + " USD");
    }
}
