/* Author: NgVanAn */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class DoanhNghiep{
	String mdn, tendn, sosv;
	void getTT(){
		System.out.println(mdn + " " + tendn + " " + sosv);
	}
}
public class J07037 {
	public static void main(String[] args)throws FileNotFoundException{
		Scanner sc = new Scanner(new File("DN.in"));  
		List<DoanhNghiep> dn = new ArrayList<>();
		int n = Integer.parseInt(sc.nextLine());
		while(n-- > 0){
			DoanhNghiep x = new DoanhNghiep();
			x.mdn = sc.nextLine();
			x.tendn = sc.nextLine();
			x.sosv = sc.nextLine();
			dn.add(x);
		}
		Collections.sort(dn, (DoanhNghiep a, DoanhNghiep b) -> a.mdn.compareTo(b.mdn));
		for(DoanhNghiep x : dn) x.getTT();
         }
}
