/* Author: NgVanAn */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class MonHoc implements Comparable<MonHoc>{
	private String mmh, ten, lythuyet, sotin;
	String thuchanh;
	MonHoc(String mmh, String ten, String sotin, String lythuyet, String thuchanh1){
		this.mmh = mmh;
		this.ten = ten;
		this.sotin = sotin;
		this.lythuyet = lythuyet;
		this.thuchanh = thuchanh1;
	}
	@Override
	public int compareTo(MonHoc o) {
		return mmh.compareTo(o.mmh);
	}
	@Override
	public String toString(){
		return mmh + " " + ten + " " + sotin + " " + lythuyet + " " + thuchanh;
	}
}	
public class J07073 {
	public static void main(String[] args)throws FileNotFoundException{
		Scanner sc = new Scanner(new File("MONHOC.in"));  
		int n = Integer.parseInt(sc.nextLine());
		List<MonHoc> arr = new ArrayList<>();
		while(n-- > 0){
			MonHoc x = new MonHoc(sc.nextLine(), sc.nextLine(),sc.nextLine(), sc.nextLine(), sc.nextLine());
			arr.add(x);
		}
		Collections.sort(arr);
		for(MonHoc x: arr) {
			if(!x.thuchanh.equals("Truc tiep")) System.out.println(x);
		}
		sc.close();
         }
}
