/* Author: NgVanAn */
package code;

import java.util.*;
class SinhVienJ04006{
	private String ten, lop;
	private StringBuilder ngaysinh;
	private float gpa;
	public String msv = "B20DCCN001";
	public void setThongTin(String ten, String lop, String ngaysinh, float gpa){
		this.ten = ten;
		this.lop = lop;
		this.ngaysinh = new StringBuilder(ngaysinh);
		this.gpa = gpa;
		if(this.ngaysinh.charAt(2) != '/') this.ngaysinh.insert(0, "0");
		if(this.ngaysinh.charAt(5) != '/') this.ngaysinh.insert(3, "0");
	}
	public void getThongTin(){
		System.out.printf("%s %s %s %s %.2f", msv, ten,lop,ngaysinh, gpa);
	}
	
}
public class J04006 {
         public static void main(String[] args){
                 Scanner sc = new Scanner(System.in);
		SinhVienJ04006 x = new SinhVienJ04006();
		x.setThongTin(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
		x.getThongTin();
         }
}
