package tuan3;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập hệ số a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhập hệ số b: ");
		double b = scanner.nextDouble();
		System.out.print("Nhập hệ số c: ");
		double c = scanner.nextDouble();

		double delta = b * b - 4 * a * c;

		if (a == 0) {
			System.out.println("Phương trình không phải bậc 2.");
		} else if (delta < 0) {
			System.out.println("Phương trình vô nghiệm.");
		} else if (delta == 0) {
			double x = -b / (2 * a);
			System.out.println("Phương trình có nghiệm kép: x = " + x);
		} else {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Phương trình có hai nghiệm: x1 = " + x1 + ", x2 = " + x2);
		}
		scanner.close();
	}
}
