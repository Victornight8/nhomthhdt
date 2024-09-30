Nhanh2_HoangDinh

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


package tuan4;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào một số nguyên: ");
		int number = scanner.nextInt();

		if (isPrime(number)) {
			System.out.println(number + " là số nguyên tố.");
		} else {
			System.out.println(number + " không phải là số nguyên tố.");
		}
	}

	// Hàm kiểm tra số nguyên tố
	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
main
