/* Author: NgVanAn */
package code;

import java.util.*;

class PhanSoJ04003 {

	private int tu, mau;

	public void setTu(int tu) {
		this.tu = tu;
	}

	public void setMau(int mau) {
		this.mau = mau;
	}

	public int gcd(int a, int b) {
		while (b != 0) {
			int tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}

	public void RutGon() {
		int c = gcd(tu, mau);
		System.out.print(tu / c + "/" + mau / c);
	}
}

public class J04003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhanSoJ04003 x = new PhanSoJ04003();
		x.setTu(sc.nextInt());
		x.setMau(sc.nextInt());
		x.RutGon();
	}
}
