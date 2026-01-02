/* Author: NgVanAn */
package code;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Khach implements Comparable<Khach> {

	private String mkh, ten, mp;
	private long sum;

	Khach(String ten, String mp, String ngayden, String ngaydi, int cnt)throws IOException, ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		if (cnt >= 10) {
			this.mkh = "KH" + cnt;
		} else {
			this.mkh = "KH0" + cnt;
		}
		this.ten = ten;
		this.mp = mp;
		Date startDay = sdf.parse(ngayden);
		Date lastDay = sdf.parse(ngaydi);
		Long duration = (lastDay.getTime() - startDay.getTime()) / (1000L * 60 * 60 * 24);
		sum = duration;
	}

	@Override
	public int compareTo(Khach o) {
		if (this.sum < o.sum) {
			return 1;
		}
		return -1;
	}

	@Override
	public String toString() {
		return mkh + " " + ten + " " + mp + " " + sum;
	}
}

public class J07046 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		Scanner sc = new Scanner(new File("KHACH.in"));
		int n = Integer.parseInt(sc.nextLine());
		List<Khach> arr = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			Khach x = new Khach(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), i);
			arr.add(x);
		}
		Collections.sort(arr);
		for (Khach x : arr) {
			System.out.println(x);
		}
	}
}
