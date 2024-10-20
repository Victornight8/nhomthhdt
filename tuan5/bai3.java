package tuan5;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số phần tử của mảng: ");
		int n = scanner.nextInt();
		int[] array = new int[n];

		System.out.println("Nhập các phần tử của mảng:");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		Arrays.sort(array);
		System.out.println("Mảng sau khi sắp xếp tăng dần: " + Arrays.toString(array));
		scanner.close();
	}
}
