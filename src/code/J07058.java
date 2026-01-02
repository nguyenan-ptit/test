/* Author: NgVanAn */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class MonHoc implements Comparable<MonHoc>{
	private String mmh, ten, hinhthuc;
	MonHoc(String mmh, String ten, String hinhthuc){
		this.mmh = mmh.trim();
		this.ten = ten;
		this.hinhthuc = hinhthuc;
	}

	@Override
	public int compareTo(MonHoc o) {
		return this.mmh.compareTo(o.mmh);
	}
	@Override
	public String toString(){
		return mmh + " " + ten + " " + hinhthuc; 
	}
}
public class J07058 {
	public static void main(String[] args)throws FileNotFoundException{
		Scanner sc = new Scanner(new File("MONHOC.in"));  
		int n = Integer.parseInt(sc.nextLine());
		List<MonHoc> arr = new ArrayList<>();
		while(n-- > 0){
			MonHoc x = new MonHoc(sc.nextLine(),sc.nextLine(), sc.nextLine());
			arr.add(x);
		}
		Collections.sort(arr);
		for(MonHoc x : arr) System.out.println(x);
         }
}
