/* Author: NgVanAn */
package code;

import java.util.*;

public class J02014 {
	public static int index(long a[], int n){
		for(int i = 1; i < n - 1; i++){
			long left = a[i-1];
			long right = a[n-1] - a[i];
			if(left == right) return i + 1;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			long[] at = new long[n];
			for(int i = 0; i < n; i++) a[i] = sc.nextInt();
			at[0] = a[0] * 1L;
			for(int i = 1; i < n; i++){
				at[i] = at[i-1] + a[i] * 1L;
			}
			System.out.println(index(at, n));
		}
	}
}
