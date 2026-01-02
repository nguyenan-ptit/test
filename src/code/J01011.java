

package code;

import java.util.*;
public class J01011 {
	public static long gcd1(long a, long b){
		while(b != 0){
			long tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0){
			long a = sc.nextLong();
			long b = sc.nextLong();
			long u = gcd1(a, b);
			System.out.println(a / u * b+ " " + u);
		}
	}
}
