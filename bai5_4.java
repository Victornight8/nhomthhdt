package tuan4_456;

import java.util.Scanner;

public class bai5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào số nguyên thứ nhất: ");
		int a = scanner.nextInt();
		System.out.print("Nhập vào số nguyên thứ hai: ");
		int b = scanner.nextInt();

		int gcd = findGCD(a, b);
		int lcm = findLCM(a, b, gcd);

		System.out.println("UCLN của " + a + " và " + b + " là: " + gcd);
		System.out.println("BCNN của " + a + " và " + b + " là: " + lcm);
	}

	// Hàm tìm UCLN (GCD) bằng thuật toán Euclid
	public static int findGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	// Hàm tìm BCNN (LCM)
	public static int findLCM(int a, int b, int gcd) {
		return (a * b) / gcd;
	}
}
