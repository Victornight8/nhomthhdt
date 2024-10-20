package tuan3;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập điểm trung bình của học sinh: ");
		double average = scanner.nextDouble();

		if (average >= 8.0) {
			System.out.println("Xếp loại: Giỏi");
		} else if (average >= 6.5) {
			System.out.println("Xếp loại: Khá");
		} else if (average >= 5.0) {
			System.out.println("Xếp loại: Trung bình");
		} else {
			System.out.println("Xếp loại: Yếu");
		}
		scanner.close();
	}
}
