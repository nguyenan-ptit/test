/* Author: NgVanAn */
package code;

import java.util.*;
import java.math.BigInteger;

public class J03015 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			BigInteger  a =  sc.nextBigInteger();
			BigInteger  b =  sc.nextBigInteger();
			 BigInteger c = a.subtract(b);
			 StringBuilder sb = new StringBuilder(c.toString());
			 System.out.println(sb);
	}
}
