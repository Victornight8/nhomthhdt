
package baitap_tuan6.bai1;
import java.util.*;
public class main {
    static Scanner sc;
    public static void main(String[] args) {
        hinhChuNhat hcn= new hinhChuNhat();
        sc= new Scanner(System.in);
        System.out.printf("Nhap chieu dai cua hinh chu nhat: ");
        int cd= sc.nextInt();
        System.out.printf("Nhap chieu rong cua hinh chu nhat: ");
        int cr= sc.nextInt();
        hcn.setChieudai(cd);
        hcn.setChieurong(cr);
        hcn.INKQ();
    }
}
