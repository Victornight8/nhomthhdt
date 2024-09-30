import java.util.Scanner;

public class Bai3_4 {
    static Scanner sc;

    static int GT (int n) {
        if (n==0 || n==1) {
            return 1;
        }
         else {
            return n*GT(n-1);
        }
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = sc.nextInt();
        System.out.print("Giai thua cua N la "+ GT(n));
    }
    
}
