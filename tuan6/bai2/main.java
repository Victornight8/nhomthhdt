import java.util.*;


// Lớp Student với các thuộc tính mã sinh viên, tên và điểm trung bình
class Student {
    private String maSV;
    private String ten;
    private double diemTB;

    // Constructor để khởi tạo đối tượng sinh viên
    public Student(String maSV, String ten, double diemTB) {
        this.maSV = maSV;
        this.ten = ten;
        this.diemTB = diemTB;
    }
    // Getter và Setter cho các thuộc tính
    public String getMaSV() {
        return maSV;
    }
    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public double getDiemTB() {
        return diemTB;
    }
    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    // Phương thức để in thông tin sinh viên
    public void display() {
        System.out.printf("Ma SV: %s - Ten: %s - Diem TB: %.2f\n", maSV, ten, diemTB);
    }
}

public class main{
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> danhSachSV = new ArrayList<>();
    // Hàm thêm sinh viên
    public static void themSinhVien() {
        System.out.println("Nhap ma sinh vien: ");
        String maSV = sc.nextLine();
        System.out.println("Nhap ten sinh vien: ");
        String ten = sc.nextLine();
        System.out.println("Nhap diem trung binh: ");
        double diemTB = sc.nextDouble();
        sc.nextLine(); // Để xử lý việc xuống dòng sau khi nhập số
        // Thêm sinh viên vào danh sách
        danhSachSV.add(new Student(maSV, ten, diemTB));
        System.out.println("Da them sinh vien thanh cong.");
    }
    // Hàm xóa sinh viên theo mã
    public static void xoaSinhVien() {
        System.out.println("Nhap ma sinh vien can xoa: ");
        String maSV = sc.nextLine();
        boolean found = false;
        for (Student sv : danhSachSV) {
            if (sv.getMaSV().equals(maSV)) {
                danhSachSV.remove(sv);
                System.out.println("Da xoa sinh vien co ma: " + maSV);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay sinh vien voi ma: " + maSV);
        }
    }

    // Hàm tìm kiếm sinh viên theo mã
    public static void timKiemSinhVien() {
        System.out.println("Nhap ma sinh vien can tim: ");
        String maSV = sc.nextLine();

        boolean found = false;
        for (Student sv : danhSachSV) {
            if (sv.getMaSV().equals(maSV)) {
                System.out.println("Thong tin sinh vien tim thay:");
                sv.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay sinh vien voi ma: " + maSV);
        }
    }

    // Hàm sắp xếp sinh viên theo điểm trung bình
    public static void sapXepTheoDiem() {
        Collections.sort(danhSachSV, new Comparator<Student>() {
            public int compare(Student sv1, Student sv2) {
                // So sánh theo điểm trung bình (từ cao xuống thấp)
                return Double.compare(sv2.getDiemTB(), sv1.getDiemTB());
            }
        }
        );
        System.out.println("Danh sach sinh vien da sap xep theo diem trung binh:");
        for (Student sv : danhSachSV) {
            sv.display();
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Them sinh vien");
            System.out.println("2. Xoa sinh vien");
            System.out.println("3. Tim sinh vien theo ma");
            System.out.println("4. Sap xep sinh vien theo diem trung binh");
            System.out.println("5. Thoat");

            System.out.print("Chon chuc nang: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Xử lý xuống dòng sau khi nhập số

            switch (choice) {
                case 1:
                    themSinhVien();
                    break;
                case 2:
                    xoaSinhVien();
                    break;
                case 3:
                    timKiemSinhVien();
                    break;
                case 4:
                    sapXepTheoDiem();
                    break;
                case 5:
                    System.out.println("Ket thuc chuong trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}

