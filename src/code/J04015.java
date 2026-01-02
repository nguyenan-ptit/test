/* Author: NgVanAn */
package code;

import java.util.*;
class ThuNhap{
	private String mluong, ten;
	private int luong, thunhap;
	public void setThongTin(String mluong, String ten, int thunhap){
		this.mluong =mluong;
		this.ten = ten;
		this.thunhap= thunhap;
	}
	public void HienThi(){
		int heso = Integer.parseInt(mluong.substring(2));
		int phucap = mluong.substring(0,2).equals("HP") ? 900000 : (mluong.substring(0,2).equals("HT") ? 2000000 : 500000);
		luong = thunhap * heso + phucap;
		System.out.print(mluong +" " +ten +" " + heso + " " + phucap + " " + luong +" ");
	}
}
public class J04015 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ThuNhap x = new ThuNhap();
		x.setThongTin(sc.nextLine(), sc.nextLine(), sc.nextInt());
		x.HienThi();
	}
}
