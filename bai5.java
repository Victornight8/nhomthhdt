 Nhanh2_HoangDinh

package baitap_tuan3;
import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Vui long nhap canh thu nhat: ");
        int a = sc.nextInt();
        System.out.println("Vui long nhap canh thu hai: ");
        int b = sc.nextInt();
        System.out.println("Vui long nhap canh thu ba: ");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && a+c>b){
            System.out.println("Ba canh tao thanh 1 tam giac");
            if(a==b && b==c){
                System.out.println("Day la tam giac deu");
            }
            else{
                if(a==b || a==c || b==c){
                    System.out.println("Day la tam giac can");
                }
                else{
                    if(a * a == b*b + c*c || b*b == a*a + c*c || c*c== a*a +b* b){
                        System.out.println("Day la tam giac vuong");
                    }
                    else{
                        System.out.println("Day la tam giac thuong");
                    }
                }
            }
        }else{
            System.out.println("khong phai la tam giac");
        }
        sc.close();
    }

package tuan4;

import java.util.Scanner;

public class bai5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào số nguyên thứ nhất: ");
		int a = scanner.nextInt();
		System.out.print("Nhập vào số nguyên thứ hai: ");
		int b = scanner.nextInt();

		int gcd = findGCD(a, b);
		int lcm = findLCM(a, b, gcd);

		System.out.println("UCLN của " + a + " và " + b + " là: " + gcd);
		System.out.println("BCNN của " + a + " và " + b + " là: " + lcm);
	}

	// Hàm tìm UCLN (GCD) bằng thuật toán Euclid
	public static int findGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	// Hàm tìm BCNN (LCM)
	public static int findLCM(int a, int b, int gcd) {
		return (a * b) / gcd;
	}
 main
}
