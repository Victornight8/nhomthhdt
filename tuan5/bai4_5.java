package baitap_tuan5.Tuan5;
import java.util.*;
public class bai4_5 {
    static Scanner sc;
    // Hàm nhập mảng
    public static void NHAP(int ds[], int n) {
        sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("Phan tu thu %d: ", i + 1);
            ds[i] = sc.nextInt();
        }
    }
    // Hàm kiểm tra số lần xuất hiện của các phần tử trong mảng
    public static void KIEMTRA(int a[], int b[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[j] == a[i])
                    b[i]++;
            }
        }
    }
    // Hàm xuất ra phần tử xuất hiện nhiều nhất
    public static void XUAT(int a[], int b[], int n) {
        int max = 0; // Khởi tạo max bằng 0
        int index = -1; // Biến lưu chỉ số của phần tử có số lần xuất hiện nhiều nhất
    
        // Tìm số lần xuất hiện lớn nhất và lưu lại chỉ số
        for (int i = 0; i < n; i++) {
            if (b[i] > max) {
                max = b[i];
                index = i;
            }
        }

        // In ra phần tử có số lần xuất hiện nhiều nhất
        if (index != -1) {
            System.out.println("Phan tu xuat hien nhieu nhat la: " + a[index] + ", va xuat hien " + max + " lan");
        }
        else
            System.out.println("Khong co phan tu nao trong mang duoc lap lai.");
    }

    public static void main(String[] args) {
        int a[] = new int[100];
        int b[] = new int[a.length];
        System.out.printf("Nhap n phan tu: ");
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        NHAP(a, n);
        KIEMTRA(a, b, n);
        XUAT(a, b, n);
    } 
}
