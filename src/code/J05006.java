/* Author: NgVanAn */
package code;

import java.util.*;
class NhanVienJ05006{
	private String ma, ten, gt, ns, dc, mst, nkhd;

	public NhanVienJ05006(int ma, String ten, String gt, String ns, String dc, String mst, String nkhd) {
		this.ma =String.format("%05d", ma);
		this.ten = ten;
		this.gt = gt;
		this.ns = ns;
		this.dc = dc;
		this.mst = mst;
		this.nkhd = nkhd;
	}

	@Override
	public String toString() {
		return  ma + " " + ten + " " + gt + " " + ns + " " + dc + " " + mst + " " + nkhd ;
	}
	
}
public class J05006 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<NhanVienJ05006> arr = new ArrayList<>();
		for(int i = 1; i <= n; i++){
			NhanVienJ05006 x = new NhanVienJ05006(i, sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine());
			arr.add(x);
		}
		for(Object x : arr){
			System.out.println(x);
		}
    }
}
