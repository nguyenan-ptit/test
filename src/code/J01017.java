

package code;

import java.util.*;
public class J01017 {
	public static boolean kt(long n){
		long tmp = n % 10;
		n /= 10;
		while(n > 1){
			long a = n % 10;
			if(Math.abs( a - tmp) != 1) return false;
			tmp = a;
			n /= 10;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0){
			long q = sc.nextLong();
			if(kt(q)) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
