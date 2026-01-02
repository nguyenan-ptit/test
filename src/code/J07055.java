/* Author: NgVanAn */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class XepLoai implements Comparable<XepLoai>{
	private String msv, ten, hang;
	private Float diem;
	XepLoai(int i, String ten, float diem1, float diem2, float diem3){
		if(i < 10) this.msv = "SV0" + i;
		else this.msv = "SV" + i;
		String[] s = ten.trim().toLowerCase().split("\\s+");
		String tmp = "";
		for(String x : s){
			tmp = tmp + x.substring(0, 1).toUpperCase()+ x.substring(1) + " ";
		}
		this.ten = tmp.trim();
		this.diem = diem1 * 0.25f + diem2 * 0.35f + diem3 * 0.4f;
		if(this.diem >= 8) hang = "GIOI";
		else if(this.diem >= 6.5f) hang = "KHA";
		else if(this.diem >= 5) hang = "TRUNG BINH";
		else hang = "KEM";
	}
	@Override
	public int compareTo(XepLoai o) {
		return o.diem.compareTo(this.diem);
	}
	public String toString(){
		return msv + " " + ten + " " + String.format("%.2f", diem) + " " + hang;
	}
}
public class J07055 {
	public static void main(String[] args)throws FileNotFoundException{
		Scanner sc = new Scanner(new File("BANGDIEM.in"));  
		int n = Integer.parseInt(sc.nextLine());
		List<XepLoai> arr = new ArrayList<>();
		for(int i = 1; i <= n; i++){
			XepLoai x = new XepLoai(i, sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
			arr.add(x);
		}
		Collections.sort(arr);
		for(XepLoai x : arr) System.out.println(x);
         }
}
