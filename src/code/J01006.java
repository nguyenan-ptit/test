

package code;

import java.util.*;
public class J01006 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long[] a = new long[93];
		a[1] = 1;
		a[2] = 1;
		for(int i = 3; i < 93; i ++){
			a[i] = a[i-1] + a[i-2];
		}
		int n = sc.nextInt();
		while(n-- > 0){
			int q = sc.nextInt();
			System.out.println(a[q]);
		}
	}
}
