/* Author: NgVanAn */
package code;

import java.util.*;

public class J02037 {
	public static boolean check(int[] a, int n){
		boolean ok = false;
		if(n % 2 == 0){
			ok = true;
		}
		int cnt = 0;
		for(int i = 0; i < n; i++){
			if (a[i] % 2 == 0) cnt += 1;
		}
		
		return (cnt * 2 > n && ok) || (!ok && cnt * 2 < n ) ;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t= Integer.parseInt(sc.nextLine());
		while(t-- > 0){
			String s = sc.nextLine();
			String[] tmp = s.trim().split("\\s+");
			int[] a = new int[tmp.length];
			for(int i = 0; i < tmp.length; i++) a[i] = Integer.parseInt(tmp[i]);
			if(check(a, tmp.length)){
				System.out.println("YES");
			}
			else System.out.println("NO");
		}
    }
}
