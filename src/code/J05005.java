/* Author: NgVanAn */
package code;

import java.util.*;
class SinhVienJ05005 implements Comparable<SinhVienJ05005>{
	private String ma, ten, lop, ns;
	private float gpa;

	public SinhVienJ05005(int ma, String ten, String lop, String ns, float gpa) {
		this.ma = String.format("B20DCCN%03d", ma);
		this.ten = ten;
		this.lop = lop;
		this.ns = ns;
		this.gpa = gpa;
	}
	public void chuanhoaTen(){
		String[] tmp = ten.trim().toLowerCase().split("\\s+");
		String a = "";
		for(String x : tmp){
			a += x.substring(0,1).toUpperCase() + x.substring(1) + " ";
		}
		ten = a.trim();
	}
	public void chuanhoaNS(){
		String[] a = ns.split("/");
		ns = String.format("%02d/%02d/%04d", Integer.parseInt(a[0]), Integer.parseInt(a[1]), Integer.parseInt(a[2]));
	}
	
	@Override
	public String toString() {
		return  ma + " " + ten + " " + lop + " " + ns + " " + String.format("%.2f", gpa);
	}

	@Override
	public int compareTo(SinhVienJ05005 o) {
		return Double.compare(o.gpa, this.gpa);
	}
	
}
public class J05005 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<SinhVienJ05005> arr = new ArrayList<>();
		for(int i = 1; i <= n; i++){
			SinhVienJ05005 x = new SinhVienJ05005(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()));
			x.chuanhoaNS();
			x.chuanhoaTen();
			arr.add(x);
		}
		Collections.sort(arr);
		for(SinhVienJ05005 x : arr){
			System.out.println(x);
		}
        }
}
