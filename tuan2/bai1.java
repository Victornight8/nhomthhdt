package tuan2;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập tên của bạn: ");
		String name = scanner.nextLine();
		System.out.println("Hello " + name);
		scanner.close();
	}
}
