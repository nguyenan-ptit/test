/* Author: NgVanAn */
package code;

import java.util.*;

public class J02023 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);  
		int n = sc.nextInt();
		int s = sc.nextInt();
		if(n == 1 && (s == 0 || s == 1)){
			System.out.println(s + " " + s);
		}
		else if((n >= 2 && s <= 1) || n * 9 < s){
			System.out.println((-1) + " " + (-1));
		}
		else{
			int[] maxn = new int[n];
			int[] minn = new int[n];
			int s1 = s;
			for(int i = n - 1; i >= 0; i--){
				if(i == 0){
					if(s1 == 0) minn[i] = 1;
					else minn[i] = s1;
				}
				else if(s1 > 0){
					minn[i] = Math.min(s1, 9);
					s1 -= minn[i];
					if(s1 == 0) minn[i] -= 1;
				}
				else {
					minn[i] = 0;
				}
			}
			for(int i = 0; i < n ; i++){
				maxn[i] = Math.min(s, 9);
				s -= maxn[i];
			}
			for(int i = 0; i < n; i++){
				System.out.print(minn[i]);
			}
			System.out.print(" ");
			for(int i = 0; i < n; i++){
				System.out.print(maxn[i]);
			}
		}
         }
}
