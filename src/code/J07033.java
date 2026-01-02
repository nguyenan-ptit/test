/* Author: NgVanAn */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class SinhVien4 {

	private String msv, ten, lop, email;

	public void setMsv(String msv) {
		this.msv = msv;
	}

	public void setTen(String ten) {
		this.ten = ten.toLowerCase();
	}

	public void setMlop(String lop) {
		this.lop = lop;

	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMsv() {
		return this.msv;
	}

	public void getTT() {
		System.out.print(this.msv + " " );
		for(String x : this.ten.split("\\s+")){
			System.out.print(x.substring(0,1).toUpperCase() + x.substring(1) + " ");
		}
		System.out.println( this.lop + " " + this.email);
	}
}

public class J07033 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("SINHVIEN.in"));
		int n = Integer.parseInt(sc.nextLine());
		List<SinhVien4> sv = new ArrayList<>();
		while (n-- > 0) {
			SinhVien4 x = new SinhVien4();
			x.setMsv(sc.nextLine());
			x.setTen(sc.nextLine());
			x.setMlop(sc.nextLine());
			x.setEmail(sc.nextLine());
			sv.add(x);
		}
		Collections.sort(sv, new Comparator<SinhVien4>() {
			@Override
			public int compare(SinhVien4 a, SinhVien4 b) {
				if (a.getMsv().compareTo(b.getMsv()) > 0) {
					return 1;
				}
				return -1;
			}
		});
		for (SinhVien4 x : sv) {
			x.getTT();
		}
		sc.close();
	}
}