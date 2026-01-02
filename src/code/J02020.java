/* Author: NgVanAn */
package code;

import java.util.*;

public class J02020 {
	public static Scanner sc = new Scanner(System.in);
	public static int n = sc.nextInt();
	public static int k = sc.nextInt();
	public static int cnt = 0;
	public static boolean ok = true;
	public static int[] a = new int[20];
	public static boolean[] use = new boolean[20];
	public static void Try(int j, int i){
		for(; i <= n; i++){
				a[j] = i;
				if(j  == k){
					cnt += 1;
					for(int f = 1; f <= k; f++) System.out.print(a[f]);
					System.out.print(" ");
				}
				else{
					Try(j + 1, i  + 1);
				}
		}
	}
	public static void main(String[] args){
		for(int i = 1; i <= n; i++) {
			use[i] = true;
		}
		Try(1, 1);
		System.out.println();
		System.out.print("Tong cong co " + cnt + " to hop" );
	}
}
