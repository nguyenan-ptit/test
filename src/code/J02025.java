/* Author: NgVanAn */
package code;

import java.util.*;

public class J02025 {
	static Integer[] a = new Integer[20], b = new Integer[20];
	static int n;
	static boolean nt(int n1){
		if(n1 < 2) return false;
		for(int i = 2; i  *i <= n1; i++) {
			if(n1 % i == 0) return false;
		}
		return true;
	}
	static void check(){
		int cnt = 0;
		for(int i = 1; i <= n; i++){
			cnt += a[i] * b[i];
		}
		if(nt(cnt)){
			for(int i = 1; i <= n; i++) {
				if(a[i] == 1) System.out.print(b[i] +  " ");
			}
			System.out.println("");
		}
	}
	static void Try(int i){
		for(int j = 0; j <= 1; j++){
			a[i] = j;
			if(i == n){
				check();
			}
			else Try(i + 1);
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);  
		int t = sc.nextInt();
		while(t-- > 0){
			n = sc.nextInt();
			for(int i = 1; i <= n; i++) b[i] = sc.nextInt();
			Arrays.sort(b, 1, n + 1, Comparator.reverseOrder());
			Try(1);
		}
         }
}
