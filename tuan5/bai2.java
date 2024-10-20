package tuan5;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số phần tử của mảng: ");
		int n = scanner.nextInt();
		int[] array = new int[n];

		System.out.println("Nhập các phần tử của mảng:");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println("Mảng sau khi đảo ngược:");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		scanner.close();
	}
}
