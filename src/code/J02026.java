/* Author: NgVanAn */
package code;

import java.util.*;

public class J02026 {
	static int n, k;
	static Integer[] a = new Integer[20], b = new Integer[20];
	static void Try(int i){
		for(int j = a[i-1] + 1; j <= n -k + i; j++){
			a[i] = j;
			if(i == k){
				for(int l = 1; l <= k; l++) {
					System.out.print(b[a[l]] + " ");
				}
				System.out.println("");
			}
			else Try(i + 1);
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);  
		int t = sc.nextInt();
		while(t-- > 0){
			n = sc.nextInt();
			k = sc.nextInt();
			a[0] = 0;
			for(int i = 1; i <= n; i++) b[i] = sc.nextInt();
			Arrays.sort(b, 1, n + 1);
			Try(1);
		}
         }
}
