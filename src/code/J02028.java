/* Author: NgVanAn */
package code;

import java.util.*;

public class J02028 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			long k = sc.nextLong();
			long[] a = new long[n];
			int left = 0;
			int right = 0;
			for(int i = 0; i < n; i++) a[i] = sc.nextLong();
			long cnt = a[0];
			boolean ok = false;
			while(left < n){
				if(cnt == k){
					ok = true;
					break;
				}
				
				if(left == right || cnt < k){
					right++;
					if(right == n){
					break;
					}
					cnt += a[right];
				}
				else if(cnt > k){
					cnt -= a[left];
					left++;
				}
			}
			if(ok){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
    }
}
