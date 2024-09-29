package tuan4;

import java.util.Scanner;

public class bai6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào một số nguyên: ");
		int number = scanner.nextInt();

		if (isPalindrome(number)) {
			System.out.println(number + " là số đối xứng.");
		} else {
			System.out.println(number + " không phải là số đối xứng.");
		}
	}

	// Hàm kiểm tra số đối xứng
	public static boolean isPalindrome(int num) {
		int original = num;
		int reverse = 0;

		while (num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
		}

		return original == reverse;
	}
}
