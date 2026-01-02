/* Author: NgVanAn */
package code;

import java.util.*;
class TuyenSinhJ04013{
	private float gpa1, gpa2, gpa3, gpa, diemut;
	private String ma, ten, ut, tt;

	public TuyenSinhJ04013(String ma, String ten, float gpa1, float gpa2, float gpa3) {
		this.gpa1 = gpa1;
		this.gpa2 = gpa2;
		this.gpa3 = gpa3;
		this.ma = ma;
		this.ten = ten;
		this.gpa = gpa1 * 2 + gpa2 + gpa3;
		if(ma.substring(0, 3).equals("KV1")){
			this.diemut = (float)0.5;
		}
		else if(ma.substring(0, 3).equals("KV2")){
			this.diemut = 1;
		}
		else this.diemut = (float)2.5;
		if(this.gpa + this.diemut >= 24) this.tt = "TRUNG TUYEN";
		else this.tt = "TRUOT";
	}

	@Override
	public String toString() {
		String diemut1 = String.valueOf((int)(diemut));
		if(Math.floor(diemut) != diemut){
			diemut1 = String.format("%.1f", diemut);
		}
		String gpaT = String.valueOf((int)(gpa));
		if(Math.floor(gpa) != gpa){
			gpaT = String.format("%.1f", gpa);
		}
		return ma + " " + ten + " " + diemut1 + " " + gpaT + " " + this.tt;
	}

	
}
public class J04013 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		TuyenSinhJ04013 x = new TuyenSinhJ04013(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
		System.out.println(x);
        }
}
