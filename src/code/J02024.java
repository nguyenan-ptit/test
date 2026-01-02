/* Author: NgVanAn */
package code;

import java.util.*;

public class J02024 {
	private static int n;
	private static Integer[] a = new Integer[20], b = new Integer[20];
	private static void check(){
		int cnt = 0;
		for(int i = 1; i <= n; i++){
			cnt += a[i] * b[i-1];
		}
		if(cnt % 2 != 0){
			for(int i = 1; i <= n; i++){
				if(a[i] == 1) System.out.print(b[i-1] +  " ");
			}
			System.out.println("");
		}
	}
	private static void Try(int i) {
		for (int j = 0; j <= 1; j++) {
			a[i] = j;
			if (i == n) {
				check();
			} else {
				Try(i + 1);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				b[i] = sc.nextInt();
			}
			Arrays.sort(b, 0, n, Comparator.reverseOrder());
			Try(1);
		}
	}
}
