J04014/* Author: NgVanAn */
package code;

import java.util.*;

class PhanSo {

	private long tu, mau;

	public void setTu(long tu) {
		this.tu = tu;
	}

	public void setMau(long mau) {
		this.mau = mau;
	}

	public long gcd(long a, long b) {
		while (b != 0) {
			long tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}

	public void RutGon() {
		long c = gcd(tu, mau);
		tu /= c;
		mau /= c;
		System.out.print(tu + "/" + mau);
	}

	public void tong(PhanSo other) {
		long c = gcd(mau, other.mau);
		tu = tu * other.mau / c + other.tu * mau / c;
		mau = mau * other.mau / c;
	}
}

public class J04004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhanSo x = new PhanSo();
		PhanSo y = new PhanSo();
		x.setTu(sc.nextLong());
		x.setMau(sc.nextLong());
		y.setTu(sc.nextLong());
		y.setMau(sc.nextLong());
		x.tong(y);
		x.RutGon();
	}
}
