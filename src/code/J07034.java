/* Author: NgVanAn */
package code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

class MonHocJ07034 {
	String maMon, ten, sotin;
	void getTT() {
		System.out.println(maMon + " " + ten + " " + sotin);
	}
}

public class J07034 {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("MONHOC.in");
		Scanner sc = new Scanner(fis);
		List<MonHocJ07034> mh = new ArrayList<>();
		int n = sc.nextInt();
		sc.nextLine();
		while (n-- > 0) {
			MonHocJ07034 x = new MonHocJ07034();
			x.maMon = sc.nextLine().trim();
			x.ten = sc.nextLine().trim();
			x.sotin = sc.nextLine().trim();
			mh.add(x);
		}
		Collections.sort(mh, (MonHocJ07034 a, MonHocJ07034 b) -> a.ten.compareTo(b.ten));
		for(MonHocJ07034 x : mh){
			x.getTT();
		}
	}
}
