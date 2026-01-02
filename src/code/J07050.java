/* Author: NgVanAn */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class MatHang implements Comparable<MatHang>{
	private String mh, ten, nhom;
	private Float loinhuan;
	MatHang(int i, String ten, String nhom, Float giam, Float giab){
		this.ten = ten;
		this.nhom = nhom;
		this.loinhuan = giab - giam;
		if(i < 10) mh =  "MH0" + i;
		else mh = "MH" + i;
	}
	@Override
	public int compareTo(MatHang o) {
		return o.loinhuan.compareTo(this.loinhuan);
	}
	@Override
	public String toString(){
		return mh + " " + ten + " " + nhom + " " + String.format( "%.2f", loinhuan);
	}
}
public class J07050 {
	public static void main(String[] args)throws FileNotFoundException{
		Scanner sc = new Scanner(new File("MATHANG.in"));  
		int n = Integer.parseInt(sc.nextLine());
		List<MatHang> arr = new ArrayList<>();
		for(int i = 1; i <= n; i++){
			MatHang x = new MatHang(i, sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
			arr.add(x);
		}
		Collections.sort(arr);
		for(MatHang x : arr) System.out.println(x);
         }
}
