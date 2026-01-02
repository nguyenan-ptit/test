/* Author: NgVanAn */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class KhachHangJ07056 implements Comparable<KhachHangJ07056>{
	private String mkh, ten, hang;
	private Long tiendm, tienvdm, vat, so, tong;
	void input(int i, Scanner sc){
		if(i < 10) mkh = "KH0" + i;
		else mkh = "KH" + i;
		Map<String, Integer> mp = new HashMap<>();
		mp.put("A" ,100);
		mp.put("B", 500);
		mp.put("C", 200);
		String[] s = sc.nextLine().toLowerCase().trim().split("\\s+");
		String tmp = "";
		for(String x : s) {
			tmp = tmp + x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
		}
		Scanner scLine = new Scanner(sc.nextLine());
//		System.out.println(sc.nextLine());
		ten = tmp.trim();
		hang = scLine.next();
		long so1 = scLine.nextLong();
		long so2 = scLine.nextLong();
		so = so2 - so1;
		if(so > mp.get(hang)){
			tiendm = mp.get(hang) * 450L;
			tienvdm = (so - mp.get(hang)) * 1000L;
			vat = tienvdm / 20;
		}
		else{
			tiendm = so * 450L;
			tienvdm = 0L;
			vat = 0L;
		}
		tong = tiendm + tienvdm + vat;
	}
	@Override
	public String toString(){
		return mkh + " " + ten + " " + tiendm + " " + tienvdm + " " + vat + " " + tong;
	}

	@Override
	public int compareTo(KhachHangJ07056 o) {
		return o.tong.compareTo(this.tong);
	}
}
public class J07056 {
	public static void main(String[] args)throws FileNotFoundException{
		Scanner sc = new Scanner(new File("KHACHHANG.in"));  
		int n = Integer.parseInt(sc.nextLine());
		List<KhachHangJ07056> arr = new ArrayList<>();
		for(int i = 1; i <= n; i++){
			KhachHangJ07056 x = new KhachHangJ07056();
			x.input(i, sc);
			arr.add(x);
		}
		Collections.sort(arr);
		for(KhachHangJ07056 x : arr) System.out.println(x);
         }
}
