/* Author: NgVanAn */
package code;

import java.util.*;
import java.math.BigInteger;
public class J03033 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n--  > 0){
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();
			BigInteger c = a.gcd(b);
			BigInteger tich = a.multiply(b);
			BigInteger tmp = tich.divide(c);
			System.out.println(tmp.toString());
		}
	}
}
