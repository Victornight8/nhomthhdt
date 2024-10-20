package tuan3;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào một số: ");
		int number = scanner.nextInt();

		if (number > 0) {
			System.out.println("Số dương");
		} else if (number < 0) {
			System.out.println("Số âm");
		} else {
			System.out.println("Bằng 0");
		}
		scanner.close();
	}
}
