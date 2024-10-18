    
package baitap_tuan6.bai1;
import java.util.*;
public class hinhChuNhat {
    static Scanner sc;
    private int Chieudai;
    private int Chieurong;
    public void setChieudai(int Chieudai){
        this.Chieudai = Chieudai;
    }
    public void setChieurong(int Chieurong){
        this.Chieurong = Chieurong;
    }
    public int Dientich(){
        return this.Chieudai * this.Chieurong;
    }
    public int Chuvi(){
        return (this.Chieudai + this.Chieurong)*2;
    }
    public void INKQ(){
        System.out.println("Dien tich hinh chu nhat la: "+Dientich());
        System.out.println("Chuvi hinh chu nhat la: "+Chuvi());
        
    }
}
