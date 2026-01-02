

package code;

import java.util.Scanner;
public class J01018 {
	public static boolean kt(long n){
		long tmp = n % 10;
		n /= 10;
		long cnt  = tmp;
		while(n > 1){
			long a = n % 10;
			cnt += a;
			if(Math.abs( a - tmp) != 2) return false;
			tmp = a;
			n /= 10;
		}
		return cnt % 10 == 0;
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
