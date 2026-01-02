/* Author: NgVanAn */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class SinhVien implements Comparable<SinhVien> {
	private String msv, ho, ten, dem, name, sdt, email;
	SinhVien(String msv, String name, String sdt, String email){
		this.msv = msv;
		String[] s =name.split("\\s+");
		ho = s[0];
		ten = s[s.length-1];
		dem = "";
		for(int i = 1; i < s.length-1; i++) dem = dem + s[i];
		this.name = name;
		this.sdt = sdt;
		this.email = email;
	}
	@Override
	public int compareTo(SinhVien o) {
		if(!ten.equals(o.ten)) return ten.compareTo(o.ten);
		else if(!ho.equals(o.ho)) return ho.compareTo(o.ho);
		else if(!dem.equals(o.dem)) return dem.compareTo(o.dem);
		return msv.compareTo(o.msv);
	}
	@Override
	public String toString(){
		return msv + " " + name + " " + sdt + " " + email;
	}
}
public class J07081 {
	public static void main(String[] args)throws FileNotFoundException{
		Scanner sc = new Scanner(new File("SINHVIEN.in"));  
		List<SinhVien> arr = new ArrayList<>();
		int n = Integer.parseInt(sc.nextLine());
		while(n-- > 0){
			SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
			arr.add(x);
		}
		Collections.sort(arr);
		for(SinhVien x : arr) System.out.println(x);
		sc.close();
         }
}
