/* Author: NgVanAn */
package code;

import java.util.*;

public class J03026 {
	public static int kt(String a, String b){
		int cnt = -1;
		if(b.contains(a)) return -1;
		for(int i = a.length() - 1; i >= 0; i--){
			String tmp = a.substring(i);
			if(b.contains(tmp) == false) cnt = Math.max(cnt,a.length() - i);
		}
		for(int i = 0; i <a.length() - 1 ; i++){
			String tmp = a.substring(0, i + 1);
			if(b.contains(tmp) == false) cnt = Math.max(cnt, i + 1);
		}
		return cnt;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while(n-- > 0){
			String a = sc.nextLine();
			String b = sc.nextLine();
			if(b.length() < a.length()){
				System.out.println(kt(a, b));
			}
			else{
				System.out.println(kt(b, a));
			}
		}
	}
}
