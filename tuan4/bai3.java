package tuan4;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số nguyên dương: ");
		int n = scanner.nextInt();
		long factorial = 1;

		for (int i = 2; i <= n; i++) {
			factorial *= i;
		}

		System.out.println("Giai thừa của " + n + " là: " + factorial);
		scanner.close();
	}
}
