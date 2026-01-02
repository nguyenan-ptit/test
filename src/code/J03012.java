/* Author: NgVanAn */
package code;

import java.util.*;
import java.math.BigInteger;
public class J03012 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while(t-- > 0){
			String tmp1 = sc.nextLine();
			String tmp2 = sc.nextLine();
			BigInteger a = new BigInteger(tmp1);
			BigInteger b = new BigInteger(tmp2);
			System.out.println(a.add(b));
			}
        }
}
