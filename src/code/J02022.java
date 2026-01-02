/* Author: NgVanAn */
package code;

import java.util.*;

public class J02022 {
	public static boolean[] used = new boolean[20];
	public static int[] a = new int[20];
	public static Scanner sc = new Scanner(System.in);
	public static int n;
	public static boolean check(){
		for(int i = 2; i <= n; i++){
			if(Math.abs(a[i] - a[i-1]) == 1) return false;
		}
		return true;
	}
	public static void Try(int j){
		for(int i = 1; i <= n; i++){
			if(used[i]){
				a[j] = i;
				used[i] = false;
				if(j >= n){
					if(check()){
						for(int k = 1; k <= n; k++) System.out.print(a[k]);
						System.out.println();
					}
				}
				else{
					Try(j + 1);
				}
				used[i] = true;
			}
		}
	}
	public static void main(String[] args){
		int t = sc.nextInt();
		while(t-- > 0){
			n = sc.nextInt();
			for(int i = 1; i <= n; i++) used[i] = true;
			Try(1);
		}
	}
}
