/* Author: NgVanAn */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class SinhVienJ07018 {
	private String ma, ten , ns, lop;
	private float gpa;

	public SinhVienJ07018 (int ma, String ten, String lop, String ns, float gpa) {
		this.ma = String.format("B20DCCN%03d", ma);
		this.ten = ten;
		this.ns = ns;
		this.lop = lop;
		this.gpa = gpa;
	}
	public void chuanhoaTen(){
		String[] tmp = ten.trim().toLowerCase().split("\\s+");
		String s = "";
		for(String x : tmp){
			s += x.substring(0,1).toUpperCase() + x.substring(1) + " ";
		}
		ten = s.trim();
	}
	public void chuanhoaNs(){
		String[] a = ns.split("/");
		ns = String.format("%02d/%02d/%04d", Integer.parseInt(a[0]), Integer.parseInt(a[1]), Integer.parseInt(a[2]));
	}

	@Override
	public String toString() {
		return  ma + " " + ten + " " + lop + " " + ns + " " + String.format("%.2f", gpa) ;
	}
	
}
public class J07018 {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new File("SINHVIEN.in"));
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<SinhVienJ07018> arr = new ArrayList<>();
		for(int i = 1; i <= n; i++){
			SinhVienJ07018 x = new SinhVienJ07018(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()));
			x.chuanhoaNs();
			x.chuanhoaTen();
			arr.add(x);
		}
		for(SinhVienJ07018 x : arr){
			System.out.println(x);
		}
        }

	


	
}
