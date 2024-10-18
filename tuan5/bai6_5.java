package baitap_tuan5.Tuan5;
import java.util.Scanner;
public class bai6_5 {
    static Scanner sc;
    public static void NHAP(int ds[], int n) {
        sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("Phan tu thu %d:  ", i + 1);
            ds[i] = sc.nextInt();
        } 
    }
    public static int THEM(int a[], int n, int x, int vt) {
        vt = vt - 1;
        // Kiểm tra vị trí hợp lệ
        if (vt < 0 || vt > n) {
            System.out.println("Vi tri khong hop le.");
            return n;
        }
        // Dịch chuyển các phần tử từ vị trí vt trở đi để tạo không gian thêm phần tử
        for (int i = n; i > vt; i--) {
            a[i] = a[i - 1];
        }
        // Thêm phần tử x vào vị trí vt
        a[vt] = x;
        // Tăng số lượng phần tử của mảng
        n++;
        return n;
    }
    // Hàm xóa 
    public static int XOA(int a[], int n, int vt) {
        vt = vt - 1;
        // Kiểm tra vị trí hợp lệ
        if (vt < 0 || vt >= n) {
            System.out.println("Vi tri khong hop le.");
            return n;
        }
        // Dịch chuyển các phần tử từ vị trí vt+1 trở đi để lấp vào chỗ trống
        for (int i = vt; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        // Giảm số lượng phần tử của mảng
        n--;
        
        return n;
    }

    // Hàm in danh sách các phần tử
    public static void INDS(int ds[], int n) {
        System.out.printf("Cac phan tu duoc in ra man hinh la: ");
        for (int i = 0; i < n; i++) {
            System.out.printf(ds[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.printf("Nhap so n: ");
        int n = sc.nextInt();
        int a[] = new int[100];
        NHAP(a, n);
        // In mảng ban đầu
        INDS(a, n);
        // Thêm phần tử vào mảng
        System.out.println("Nhap phan tu ban muon them: ");
        int x = sc.nextInt();
        System.out.println("Nhap vi tri ban muon them: ");
        int vtThem = sc.nextInt();
        n = THEM(a, n, x, vtThem);
        // In mảng sau khi thêm
        INDS(a, n);
        // Xóa phần tử khỏi mảng
        System.out.println("Nhap vi tri ban muon xoa: ");
        int vtXoa = sc.nextInt();
        n = XOA(a, n, vtXoa);
        // In mảng sau khi xóa
        INDS(a, n);
    }
}
