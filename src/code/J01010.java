

package code;

import java.util.*;
public class J01010 {	
	public static long check(long n){
		long cnt = 0;
		int j = 0;
		while(n > 0){
			long tmp = n % 10;
			if(tmp != 0L && tmp != 1L && tmp != 8L&& tmp != 9L){
				return -1;
			}
			else if(tmp <= 1L) {
				cnt += (long)Math.pow(10, j++)*tmp;
			}
			else{
				j++;
			}
			n /= 10;
		}
		return cnt;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0){
			long a = sc.nextLong();
			long k = check(a);
			if(k != -1 && k != 0){
				System.out.println(k);
			}
			else{
				System.out.println("INVALID");
			}
		}
	}
}
