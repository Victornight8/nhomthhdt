
package baitap_tuan5.Tuan5;
import java.util.*;
public class bai5_5 {
    static Scanner sc;
     public static void NHAP(int ds[], int n) {
        sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("Phan tu thu %d: ", i + 1);
            ds[i] = sc.nextInt();
        }
    } 
    public static void INDS(int ds[], int n){
        System.out.printf("Cac phan tu duoc in ra man hinh la:  ");
        for(int i=0;i<n;i++){
            System.out.printf(ds[i] + " ");
        }
    }public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.printf("Nhap so n: ");
        int n= sc.nextInt();
        int a[] = new int[100];
        NHAP(a, n);
        INDS(a, n);
    }
}
