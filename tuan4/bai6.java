package tuan4;

import java.util.Scanner;

public class bai6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập một số nguyên: ");
		int n = scanner.nextInt();
		int original = n;
		int reversed = 0;

		while (n != 0) {
			int digit = n % 10;
			reversed = reversed * 10 + digit;
			n /= 10;
		}

		if (original == reversed) {
			System.out.println(original + " là số đối xứng.");
		} else {
			System.out.println(original + " không phải là số đối xứng.");
		}
		scanner.close();
	}
}
