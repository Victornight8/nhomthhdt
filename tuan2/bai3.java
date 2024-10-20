package tuan2;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào số nguyên thứ nhất: ");
		int num1 = scanner.nextInt();

		System.out.print("Nhập vào số nguyên thứ hai: ");
		int num2 = scanner.nextInt();

		int sum = num1 + num2;
		int difference = num1 - num2;
		int product = num1 * num2;
		int quotient = num1 / num2;
		int remainder = num1 % num2;

		System.out.println("Tổng: " + sum);
		System.out.println("Hiệu: " + difference);
		System.out.println("Tích: " + product);
		System.out.println("Thương: " + quotient);
		System.out.println("Phần dư: " + remainder);

		scanner.close();
	}
}
