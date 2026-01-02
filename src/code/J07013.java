/* Author: NgVanAn */
package code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.*;
class SinhVien implements Serializable {
	private 
		String ma, ten, lop, ngaySinh;
		float gpa;

	public String getMa() {
		return ma;
	}

	public String getTen() {
		return ten;
	}

	public String getLop() {
		return lop;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public float getGpa() {
		return gpa;
	}
	
	public SinhVien(int i , String ten, String lop, String ngaySinh, float gpa) {
		this.ma = "B20DCCN" + String.format("%03d", i);
		this.ten = ten;
		this.lop = lop;
		this.ngaySinh = ngaySinh;
		this.gpa = gpa;
	}
	public void chuanhoaNgaySinh(){
		String[] s = ngaySinh.split("/");
		ngaySinh = String.format("%02d/%02d/%04d", Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2]));
	}
	public String toString(){
		return ma + " " + ten + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa);
	}
}
public class J07013 {
	public static void main(String[] args)throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SV.in"));
		List<SinhVien> arr = (ArrayList<SinhVien>) ois.readObject();
		int i = 1;
		for(SinhVien x :  arr){
			x.chuanhoaNgaySinh();
			System.out.println(x);
		}
    }
}
