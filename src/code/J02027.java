/* Author: NgVanAn */
package code;

import java.util.*;

public class J02027 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0; i < n; i++){
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			long cnt = 0;
			int right = 0;
			for(int left = 0; left < n; left++){
 
				while(right < n && a[right] - a[left] < k){
					right++;
				}
				if(right > left){
				cnt += (right - left - 1);
				}
			}
			System.out.println(cnt);
		}
    }
}