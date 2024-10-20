package tuan4;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số nguyên dương n: ");
		int n = scanner.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
		}

		System.out.println("Tổng từ 1 đến " + n + " là: " + sum);
		scanner.close();
	}
}
