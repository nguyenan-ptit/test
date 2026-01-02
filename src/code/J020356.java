/* Author: NgVanAn */
package code;

import java.util.*;

public class J020356 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), s = sc.nextInt();
		if(n * 9 < s || (n > 1 && s == 0) || (n > 1 && s < 2 )){
			System.out.println("-1 -1");
			return;
		}
		int[] maxx = new int[n];
		int[] minn = new int[n];
		int s1 = s;
		for(int i = 0; i < n; i++){
			if(s >= 9){
				maxx[i] = 9;
				s -= 9;
			}
			else {
				maxx[i] = s;
				s = 0;
			}
		}
		if((n-1) * 9 >= s1){
			s1 -= 1;
			for(int i = 0; i < n -1; i++ ){
				if(s1 > 9){
					minn[i] = 9;
					s1 -= 9;
				}
				else {
					minn[i] = s1;
					s1 = 0;
				}
			}
			minn[n-1] = 1;
		}
		else {
			for(int i = 0; i < n; i++ ){
				if(s1 > 9){
					minn[i] = 9;
					s1 -= 9;
				}
				else {
					minn[i] = s1;
					s1 = 0;
				}
			}
		}
		for(int i = n -1; i >= 0; i--) {
			System.out.print(minn[i]);
		}
		System.out.print(" ");
		for(int i = 0; i< n; i++){
			System.out.print(maxx[i]);
		}
    }
}
