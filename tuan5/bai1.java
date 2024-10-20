package tuan5;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số phần tử của mảng: ");
		int n = scanner.nextInt();
		int[] array = new int[n];
		int sum = 0;

		System.out.println("Nhập các phần tử của mảng:");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
			sum += array[i];
		}

		System.out.println("Tổng các phần tử trong mảng là: " + sum);
		scanner.close();
	}
}
