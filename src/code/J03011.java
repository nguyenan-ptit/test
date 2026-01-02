/* Author: NgVanAn */
package code;

import java.util.*;

public class J03011 {
	public static long mod(String b, long a){
		long cnt = 0;
		for(int j = 0; j  < b.length(); j++){
			cnt = cnt * 10 + (b.charAt(j) - '0');
			cnt %= a;
		}
		return cnt % a;
	}
	public static String gcd(long a, String b){
		while(a != 0){
			long tmp = a;
			a = mod(b, a);
			b = String.valueOf(tmp);
		}
		return b;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			long a = sc.nextLong();
			sc.nextLine();
			String s = sc.nextLine();
			System.out.println(gcd(a, s));
		}
	}
}
