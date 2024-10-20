package tuan3;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số a: ");
		int a = scanner.nextInt();
		System.out.print("Nhập số b: ");
		int b = scanner.nextInt();
		System.out.print("Nhập số c: ");
		int c = scanner.nextInt();
		System.out.println("Số nhỏ nhất là: " + Math.min(Math.min(a, b), c));
		scanner.close();
	}
}
