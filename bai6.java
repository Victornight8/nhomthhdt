
package baitap_tuan3;
import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("nhap so thu nhat: ");
        int a= sc.nextInt();
        System.out.printf("nhap so thu hai: ");
        int b= sc.nextInt();
        System.out.println("chon bieu thuc can tinh: ");
        System.out.println("1.Phep cong: ");
        System.out.println("2.Phep tru: ");
        System.out.println("3.Phep nhan: ");
        System.out.println("4.Phep chia: ");
        System.out.printf("Nhap so tuong ung voi bieu thuc: ");
        int choice=sc.nextInt();
        double result;
        switch(choice){
            case 1: 
                  result = a+b;
                  System.out.println("ket qua cua la: "+result);
                  break;
            case 2:
                result = a - b;
                System.out.println("ket qua cua la: " + result);
                break;
            case 3:
                result = a * b;
                System.out.println("ket qua cua la: " + result);
                break;
            case 4:
                result =(float) a / b;
                System.out.println("ket qua cua la: " + result);
                break;
            default:
                System.out.println("vui long chon 1 trong 4 phep tinh tren");
                break;
        }
        sc.close();
    }
    
    
}
