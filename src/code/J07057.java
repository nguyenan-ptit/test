/* Author: NgVanAn */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class ThiSinhJ07057 implements Comparable<ThiSinhJ07057>{
	private String mhs,  ten, dantoc, khuvuc, trangthai;
	private Float diem;
	ThiSinhJ07057(int i, String ten, float diem, String dantoc, String khuvuc){
		if(i < 10) mhs = "TS0" + i;
		else mhs = "TS" + i;
		String tmp = "";
		String[] s = ten.trim().toLowerCase().split("\\s+");
		for(String x : s) tmp =  tmp + x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
		this.ten = tmp.trim();
		if(dantoc.equals("Kinh")){
			this.diem = diem;
		}
		else this.diem = diem + 1.5f;
		if(khuvuc.equals("1")) this.diem += 1.5f;
		else if(khuvuc.equals("2")) this.diem += 1f;
		if(this.diem > 30) this.diem = 30f;
		if(this.diem >= 20.5f) trangthai = "Do";
		else trangthai = "Truot";
	}
	@Override
	public int compareTo(ThiSinhJ07057 o) {
		if(this.diem != o.diem) return o.diem.compareTo(this.diem);
		return this.mhs.compareTo(o.mhs);
	}
	public String toString(){
		return mhs + " " + ten + " " + String.format("%.1f", diem) + " " + trangthai;
	}
}
public class J07057 {
	public static void main(String[] args)throws FileNotFoundException{
		Scanner sc = new Scanner(new File("THISINH.in"));  
		int n = Integer.parseInt(sc.nextLine());
		List<ThiSinhJ07057> arr = new ArrayList<>();
		for(int i = 1; i <= n; i++){
			ThiSinhJ07057 x = new ThiSinhJ07057(i, sc.nextLine(), Float.parseFloat(sc.nextLine()), sc.nextLine(), sc.nextLine());
			arr.add(x);
		}
		Collections.sort(arr);
		for(ThiSinhJ07057 x : arr) System.out.println(x);
         }
}
