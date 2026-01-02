/* Author: NgVanAn */
package code;

import java.util.*;
class PhanSoJ04014{
	private long x, y;
	public PhanSoJ04014(long x, long y){
		this.x = x;
		this.y = y;
	}
	public PhanSoJ04014(){}
	public long gcd(long a, long b){
		while(b != 0){
			long tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}
	public PhanSoJ04014 cong( PhanSoJ04014 b){
		long mau = 1l * y * b.y /gcd(y, b.y);
		PhanSoJ04014 c = new PhanSoJ04014();
		long tu = 1l *x * (mau / y) + b.x * (mau / b.y);
		long d = gcd(tu, mau);
		c.x = tu / d;
		c.y = mau / d;
		return c;
	}
	public PhanSoJ04014 nhan( PhanSoJ04014 b){
		PhanSoJ04014 c = new PhanSoJ04014();
		long tu = x * b.x;
		long mau = y * b.y;
		long d = gcd(tu, mau);
		c.x = tu / d;
		c.y = mau / d;
		return c;
	}
	@Override
	public String toString(){
		return x + "/" + y;
	}
}
public class J04014 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			PhanSoJ04014 a = new PhanSoJ04014(sc.nextLong(), sc.nextLong());
			PhanSoJ04014 b = new PhanSoJ04014(sc.nextLong(), sc.nextLong());
			PhanSoJ04014 c = (a.cong(b)).nhan(a.cong(b));
			PhanSoJ04014 d = a.nhan(b).nhan(c);
			System.out.println(c + " " + d);
		}
        }
}
