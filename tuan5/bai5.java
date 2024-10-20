package tuan5;

import java.util.ArrayList;
import java.util.Scanner;

public class bai5 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số phần tử của danh sách: ");
		int n = scanner.nextInt();

		System.out.println("Nhập các phần tử của danh sách:");
		for (int i = 0; i < n; i++) {
			list.add(scanner.nextInt());
		}

		System.out.println("Các phần tử của danh sách là:");
		for (int num : list) {
			System.out.print(num + " ");
		}
		scanner.close();
	}
}
