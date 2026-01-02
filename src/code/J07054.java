/* Author: NgVanAn */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class BangDiem implements Comparable<BangDiem>{
	private String msv, ten;
	public Float diem;
	BangDiem(int i, String ten, float diem1, float diem2, float diem3){
		if(i < 10) msv = "SV0" + i;
		else msv = "SV" + i;
		String[] s = ten.trim().toLowerCase().split("\\s+");
		String tmp = "";
		for(String x : s) tmp = tmp + x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
		this.ten = tmp.trim();
		this.diem = (diem1 * 3 + diem2 * 3 + diem3 * 2) / 8;
	}
	@Override
	public int compareTo(BangDiem o) {
		return o.diem.compareTo(this.diem);
	}
	public String toString(){
		return msv + " " + ten + " " + String.format("%.2f", diem);
	}
}
public class J07054 {
	public static void main(String[] args)throws FileNotFoundException{
		Scanner sc = new Scanner(new File("BANGDIEM.in"));  
		int n = Integer.parseInt(sc.nextLine());
		List<BangDiem> arr = new ArrayList<>();
		for(int i = 1; i <= n; i++){
			BangDiem x = new BangDiem(i, sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
			arr.add(x);
		}
		Collections.sort(arr);
		int cnt = 1;
		int cnt1 = 1;
		float diem1 = 0;
		for(BangDiem x : arr){
			if(cnt1 == 1) {
				System.out.println(x + " " + cnt);
				diem1 = x.diem;
				cnt1 += 1;
			}
			else if(diem1 == x.diem){
				System.out.println(x + " " + cnt);
				cnt1 += 1;
			}
			else{
				diem1 = x.diem;
				System.out.println(x + " " + cnt1);
				cnt1 += 1;
				cnt = cnt1;
			}
		}
         }
}
