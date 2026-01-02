/* Author: NgVanAn */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class ThiSinh implements Comparable<ThiSinh>{
	private String mats, ten;
	public Float diem, dc;
	public String mhs;
	ThiSinh(String mats, String ten, float toan,float ly, float hoa, float dc){
		String tmp = "";
		String[] s = ten.trim().toLowerCase().split("\\s+");
		for(String x : s){
			tmp = tmp + x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
		}
		this.ten = tmp.trim();
		this.mats = mats;
		this.dc = dc;
		this.diem = toan * 2 + ly + hoa + dc;
	}
	@Override
	public int compareTo(ThiSinh o) {
		if(this.diem == o.diem) return this.mats.compareTo(o.mats);
		return o.diem.compareTo(this.diem);
	}
	@Override
	public String toString(){
		String dcr = (dc == (int) (float)(dc)) ? String.valueOf((int) (float)(dc)) : String.format("%.1f", dc);
		String diemr = (diem == (int) (float)diem) ? String.valueOf((int)(float) diem) : String.format("%.1f", diem);
		return mats + " " + ten + " " + dcr  + " " + diemr; 
	}

}
public class J07052 {
	public static void main(String[] args)throws FileNotFoundException{
		Scanner sc = new Scanner(new File("THISINH.in"));  
		int n = Integer.parseInt(sc.nextLine());
		Map<String, Float> mp = new HashMap<>();
		List<ThiSinh> arr = new ArrayList<>();
		mp.put("KV1", (float)0.5);
		mp.put("KV2", (float)1);
		mp.put("KV3", (float)2.5);
		while(n-- > 0){
			String ms;
			ThiSinh x = new ThiSinh(ms = sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), mp.get(ms.substring(0, 3)));
			arr.add(x);
		}
		int cnt = Integer.parseInt(sc.nextLine());
		float minn = 0;
		Collections.sort(arr);
		for(ThiSinh x :arr){
			if(cnt >= 1){
				cnt -= 1;
				minn = x.diem;
			}
			else break;
		}
		System.out.printf("%.1f\n", minn);
		for(ThiSinh x : arr){
			if(x.diem >= minn) System.out.println(x + " TRUNG TUYEN");
			else System.out.println(x + " TRUOT");
		}
         }
}
