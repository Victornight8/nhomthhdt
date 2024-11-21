package tuan05;

import java.util.Scanner;

public class Bai1 {
	static int [] A;
	static int i;
	static int x;
	static Scanner sc;
	static void Nhap() {
		for(i=0;i<x;i++) {
			System.out.print("A["+i+"] = ");
			A[i]=sc.nextInt();
		}
	}
	static void Xuat() {
		for(i=0;i<x;i++) {
			System.out.print(" "+A[i]);
		}
	}
	static int Tong() {
		int S=0;
		for(i=0;i<x;i++)
			S=S+A[i];
		return S;
	}
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.print("Nhap so phan tu: ");
		x=sc.nextInt();
		A=new int[x];
		Nhap();
		Xuat();
		System.out.print("\nTong cua cac phan tu: "+Tong());
	}

}
