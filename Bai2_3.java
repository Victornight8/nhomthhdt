package baitap_T03;

import java.util.Scanner;

public class Bai02 {
	static double dtb;
	static Scanner sc;
	
	static String XepLoai(double d) {
		if(d>=80) {
			return "Gioi";
		}else if(d>=65) {
			return "Kha";
		}else if(d>=50) {
			return "Trung binh";
		}else {
			return "Yeu";
		}
	}
	
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.print("Nhap dtb: ");
		dtb=sc.nextDouble();
		if (dtb <= 100 && dtb >= 0) { 
			System.out.print("Xep loai: " + XepLoai(dtb));
	       } else {
	    	   System.out.print("Nhap dtb khong hop le!"); 
	       }
		sc.close(); 		
	}

}
