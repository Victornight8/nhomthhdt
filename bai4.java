
package baitap_tuan3;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Nhap vao so thu nhat: ");
        int a = sc.nextInt();
        System.out.printf("Nhap vao so thu hai: ");
        int b = sc.nextInt();
        System.out.printf("Nhap vao so thu ba: ");
        int c = sc.nextInt();
        if (a < b && a < c) 
            System.out.println("so nho nhat trong ba so la: " + a);
        else
            if (b < c) 
                System.out.println("so nho nhat trong ba so la: " + b);
            else
                System.out.println("so nho nhat trong ba so la: " + c);
    }
}

