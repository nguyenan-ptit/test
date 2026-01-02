/* Author: NgVanAn */
package code;

import java.util.*;

public class J02017 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		int m = 0;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			if(m  > 0 &&  (arr[m - 1] + a[i]) % 2 == 0) {
				m--;
			}
			else{
				arr[m++] = a[i];
			}
		}
		System.out.print(m);
	}
}
