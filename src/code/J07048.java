/* Author: NgVanAn */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class SanPham implements Comparable<SanPham> {
	private String  msp, ten, date;
	private Integer gia;
	SanPham(String msp, String ten, int gia, String date){
		this.msp = msp;
		this.gia = gia;
		this.date = date;
		this.ten = ten;
	}
	@Override
	public int compareTo(SanPham o) {
		if(this.gia == o.gia) return this.msp.compareTo(o.msp);
		return o.gia.compareTo(this.gia);
	}
	@Override
	public String toString(){
		return msp + " " + ten + " " + gia + " " + date;
	}
	
}
public class J07048 {
	public static void main(String[] args)throws FileNotFoundException{
		Scanner sc = new Scanner(new File("SANPHAM.in"));
		int n = Integer.parseInt(sc.nextLine());
		List<SanPham> arr = new ArrayList<>();
		while(n-- > 0){
			SanPham x = new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine());
			arr.add(x);
		}
		Collections.sort(arr);
		for(SanPham x : arr) System.out.println(x);
		sc.close();
         }
}
