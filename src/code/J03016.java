/* Author: NgVanAn */
package code;

import java.util.*;
import java.math.BigInteger;
public class J03016 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			String tmp = sc.next();
			BigInteger a = new BigInteger(tmp);
			if(a.mod(new BigInteger("11")).intValueExact() == 0){
				System.out.println("1");
				
			}
			else System.out.println("0");
		}
    }
}
