package tuan5;

import java.util.ArrayList;
import java.util.Scanner;

public class bai6 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số phần tử của danh sách: ");
		int n = scanner.nextInt();

		System.out.println("Nhập các phần tử của danh sách:");
		for (int i = 0; i < n; i++) {
			list.add(scanner.nextInt());
		}

		System.out.print("Nhập vị trí muốn thêm phần tử: ");
		int index = scanner.nextInt();
		System.out.print("Nhập giá trị phần tử cần thêm: ");
		int value = scanner.nextInt();
		list.add(index, value);

		System.out.println("Danh sách sau khi thêm phần tử: " + list);

		System.out.print("Nhập vị trí muốn xóa phần tử: ");
		index = scanner.nextInt();
		list.remove(index);

		System.out.println("Danh sách sau khi xóa phần tử: " + list);
		scanner.close();
	}
}
