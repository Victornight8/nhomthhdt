import java.util.Scanner;
public class Bai1_4 {

    static Scanner sc;

    static int Tinh (int x) {
        int S = 0;
        for (int i = 1; i <=x; i++) {
            S = S +i;
        }
        return S;
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Nhap n ");
        int n = sc.nextInt();
        System.out.println("Tong day so la:"+ Tinh(n));
    }
    
}
