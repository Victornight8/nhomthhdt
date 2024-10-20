package taiKhoanNganHang;

import java.util.Scanner;

public class TaiKhoan {
	private int stk;
	private String chutk;
	private double soDu;
	private String mk;
	
	public int getStk() {
		return stk;
	}
	public void setStk(int stk) {
		this.stk = stk;
	}
	public String getChutk() {
		return chutk;
	}
	public void setChutk(String chutk) {
		this.chutk = chutk;
	}
	public double getSoDu() {
		return soDu;
	}
	public void setSoDu(double soDu) {
		this.soDu = soDu;
	}
	public String getMk() {
		return mk;
	}
	public void setMk(String mk) {
		this.mk = mk;
	}
	
	public TaiKhoan() {
		super();
		setStk(1375349296);
		setChutk("Nguyễn Văn A");
		setSoDu(1200);
		setMk("momy98@");
	}
	
	public void KiemTraSoDu() {
		System.out.print("\nTài khoản của bạn còn: "+soDu+"VND");
	}
	
	public void GuiTien(double tienGui) {
		if(tienGui>0) {
			soDu+=tienGui;
			System.out.print("Đã gửi: "+tienGui+"VND");
			KiemTraSoDu();
		}else 
			System.out.print("Số tiền không hợp lệ");
	}
	
	public void RutTien(double tienRut) {
		if(tienRut>0&&tienRut<=soDu) {
			soDu-=tienRut;
			System.out.print("Đã rút: "+tienRut+"VND");	
			KiemTraSoDu();
		}else
			System.out.print("Tài khoàn của bạn không đủ tiền");
	}
	
	public void DoiMatKhau(String matKhauCu,String matKhauMoi) {
		if (this.mk.equals(matKhauCu)) 
		/*kiểm tra xem nội dung của chuỗi matKhauCu có khớp với nội dung của thuộc tính mk 
		(mật khẩu hiện tại) hay không. Nếu khớp, nó trả về true; ngược lại, nó trả về false*/
		{
            this.mk = matKhauMoi;
            System.out.println("Đã đổi mật khẩu");
        } else {
            System.out.println("Bạn đã nhập sai mật khẩu");
        }
	}
}
