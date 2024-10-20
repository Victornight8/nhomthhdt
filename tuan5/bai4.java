package tuan5;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số phần tử của mảng: ");
		int n = scanner.nextInt();
		int[] array = new int[n];
		int maxCount = 0;
		int mostFrequent = array[0];

		System.out.println("Nhập các phần tử của mảng:");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (array[i] == array[j]) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				mostFrequent = array[i];
			}
		}

		System.out.println("Phần tử xuất hiện nhiều nhất là: " + mostFrequent);
		scanner.close();
	}
}
