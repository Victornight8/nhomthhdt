package baitap_T03;

import java.util.Scanner;

public class Bai01 {
	static int n;
	static Scanner sc;
	
	static String KT(int x) {
		if(x==0)
			return "bang 0";
		else
			if(x>0)
				return "so duong";
			else
				return "so am";
	}
	
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.print("Nhap mot so nguyen: ");
		n=sc.nextInt();
		System.out.print("So nguyen nay la: "+KT(n));
	}

}
