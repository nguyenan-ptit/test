/* Author: NgVanAn */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class XetTuyen implements Comparable<XetTuyen>{
	private String ten, ma, ngaysinh, hang ;
	private float diem;
	public int  namsinh;
	XetTuyen(int i, String ten, String ngaysinh, float diem1, float diem2){
		if(i < 10) this.ma = "PH0" + i;
		else this.ma = "PH" + i;
		String tmp = "";
		String[] s = ten.trim().toLowerCase().split("\\s+");
		for(String x : s)  tmp =  tmp + x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
		this.ten = tmp.trim();
		StringBuilder ngay = new StringBuilder(ngaysinh);
		if(ngay.charAt(2) != '/') ngay.insert(0, '0');
		if(ngay.charAt(5) != '/') ngay.insert(3, '0');
		namsinh = 2021 - Integer.parseInt(ngay.substring(6)) ;
		this.ngaysinh = ngay.toString();
		if(diem1 >= 8 && diem2 >= 8){
			this.diem = (diem1 + diem2) / 2 + 1;
			if(this.diem > 10) this.diem = 10;
		}
		else if(diem1 >= (float)7.5 && diem2 >= 7.5f){
			this.diem = (diem1 + diem2)/2  + + 0.5f;
		}
		else this.diem = (diem1 + diem2) / 2;
		this.diem = Math.round(this.diem);
		if(this.diem >= 9) hang = "Xuat sac";
		else if(diem >= 8) hang = "Gioi";
		else if(diem >= 7) hang = "Kha";
		else if(diem >= 5) hang = "Trung binh";
		else hang = "Truot";
	}
	@Override
	public int compareTo(XetTuyen o) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}
	
	@Override
	public String toString(){
		return ma + " " + ten + " " + namsinh + " " + (int)diem + " " +hang;
	}
	
}
public class J07053 {
	public static void main(String[] args)throws FileNotFoundException{
		Scanner sc = new Scanner(new File("XETTUYEN.in"));  
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 1; i <= n; i++){
			XetTuyen x = new XetTuyen(i, sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
			System.out.println(x);
		}
         }
}
