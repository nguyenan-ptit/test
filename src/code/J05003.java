/* Author: NgVanAn */
package code;

import java.util.*;
class SinhVienJ05003{
	private String ma, ten, ns, lop;
	private float gpa;
	SinhVienJ05003(int i, String ten, String lop, String ns, float gpa){
		this.ma = String.format("B20DCCN%03d", i);
		this.ten = ten;
		this.lop = lop;
		this.ns = ns;
		this.gpa = gpa;
	}
	public void chuanhoans(){
		String[] tmp = ns.split("/");
		ns = String.format("%02d/%02d/%04d", Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]), Integer.parseInt(tmp[2]));
	}
	@Override
	public String toString(){
		return ma + " " + ten + " " + lop + " " + ns + " " + String.format("%.2f", gpa);
	}
}
public class J05003 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List<SinhVienJ05003> arr = new ArrayList<>();
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 1; i <= n; i++){
			SinhVienJ05003 x = new SinhVienJ05003(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()));
			x.chuanhoans();
			arr.add(x);
		}
		for(SinhVienJ05003 x : arr){
			System.out.println(x);
		}
    }
}

