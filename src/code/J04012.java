/* Author: NgVanAn */
package code;

import java.util.*;
class NhanVien{
	private String ten, ma, cv;
	private long luong, thuong, pc, tn;
	NhanVien(String ten , long luong, long ngay, String cv){
		this.ten = ten;
		this.luong = luong * ngay;
		this.cv = cv;
		this.thuong = 0;
		if(ngay >= 25){
			this.thuong += this.luong / 5;
		}
		else if(ngay >= 22) this.thuong += this.luong / 10;
		if(cv.equals("GD")){
			this.pc = 250000;
		}
		else if (cv.equals("PGD")){
			this.pc = 200000;
		}
		else if(cv.equals("TP")){
			this.pc = 180000;
		}
		else this.pc = 150000;
		this.tn = this.luong + this.pc + this.thuong;
	}

	@Override
	public String toString() {
		return "NV01 " + ten + " " +  luong + " " + thuong+ " " +  pc + " " + tn ;
	}
	
}
public class J04012 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		NhanVien x = new NhanVien(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
		System.out.println(x);
        }
}
