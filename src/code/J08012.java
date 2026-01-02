/* Author: NgVanAn */
package code;

import java.util.*;

public class J08012 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);  
		int n = sc.nextInt();
		int[] deg = new int[n + 1];
		for(int i = 0; i < n - 1; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			deg[a] += 1;
			deg[b] += 1;
		}
		int cnt1 = 0;
		int cnt2 = 0;
		for(int i = 0; i < n; i++){
			if(deg[i + 1] == 1) cnt1 += 1;
			else if(deg[i + 1] == n - 1) cnt2 += 1;
		}
		if(cnt1 == n - 1 && cnt2 == 1) System.out.println("Yes");
		else System.out.print("No");
         }
}
