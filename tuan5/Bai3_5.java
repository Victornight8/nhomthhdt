package tuan05;

import java.util.Scanner;

public class Bai3 {
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
	static void SapXep() {
		for(i=0;i<x;i++)
			for(int j=0;j<x-1;j++)
				if(A[j]>A[j+1])
				{
					int tam=A[j];
					A[j]=A[j+1];
					A[j+1]=tam;
				}
	}
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.print("Nhap so phan tu: ");
		x=sc.nextInt();
		A=new int[x];
		Nhap();
		Xuat();
		System.out.print("\nSap xep lai: ");
		SapXep();
		Xuat();
	}
}
