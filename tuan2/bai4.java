package tuan2;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số tiền gửi: ");
		double principal = scanner.nextDouble();

		System.out.print("Nhập lãi suất hàng năm (theo %): ");
		double annualInterestRate = scanner.nextDouble();

		System.out.print("Nhập số tháng gửi: ");
		int months = scanner.nextInt();

		// Tính lãi suất hàng tháng
		double monthlyInterestRate = annualInterestRate / 12 / 100;

		// Tính số tiền lãi
		double interest = principal * monthlyInterestRate * months;

		// Tính số tiền gốc và lãi cuối kỳ
		double total = principal + interest;

		System.out.println("Số tiền lãi: " + interest);
		System.out.println("Số tiền gốc và lãi cuối kỳ: " + total);

		scanner.close();
	}
}
