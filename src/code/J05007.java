/* Author: NgVanAn */
package code;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
class NhanVienJ05007 implements Comparable<NhanVienJ05007>{
	private String ma, ten , gt, ns, dc, mst, nkhd;

	public NhanVienJ05007(int ma, String ten, String gt, String ns, String dc, String mst, String nkhd) {
		this.ma = String.format("%05d", ma);
		this.ten = ten;
		this.gt = gt;
		this.ns = ns;
		this.dc = dc;
		this.mst = mst;
		this.nkhd = nkhd;
	}
	
	@Override
	public int compareTo(NhanVienJ05007 o) {
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			Date d1 = f.parse(this.ns);
			Date d2 = f.parse(o.ns);
		return (d1.compareTo(d2));
		} catch(Exception e){
			return 0;
		}
	}

	@Override
	public String toString() {
		return  ma + " " + ten + " " + gt + " " + ns + " " + dc + " " + mst + " " + nkhd ;
	}
	
}
public class J05007 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<NhanVienJ05007> arr = new ArrayList<>();
		for(int i = 1; i <= n; i++){
			NhanVienJ05007 x = new NhanVienJ05007(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
			arr.add(x);
		}
		Collections.sort(arr);
		for(Object x : arr){
			System.out.println(x);
		}
        }
}
