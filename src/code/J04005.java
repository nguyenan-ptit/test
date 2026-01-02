/* Author: NgVanAn */
package code;

import java.util.*;
class SinhVien{
	private String name;
	private String date;
	private double gpa;
	public void setName(String name){
		this.name = name;
	}
	public void setDate(String date){
		this.date = date;
	}
	public void setGpa(double gpa1, double gpa2, double gpa3){
		gpa = (gpa1 + gpa2 + gpa3);
		
	}
	public void ThongTin(){
		System.out.printf("%s %s %.1f", name, date, gpa);
	}
}
public class J04005 {
         public static void main(String[] args){
                 Scanner sc = new Scanner(System.in);  
		SinhVien x = new SinhVien();
		x.setName(sc.nextLine());
		x.setDate(sc.nextLine());
		x.setGpa(sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
		x.ThongTin();
         }
}
