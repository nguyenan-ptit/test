/* Author: NgVanAn */
package code;

import java.util.*;

public class J03025 {
	public static boolean ktr(String s){
		int cnt = 0;
		for(int i = 0; i < s.length() / 2; i++){
			if(s.charAt(i) != s.charAt(s.length() - 1 - i)) cnt += 1;
			if(cnt > 1) return false;
		}
		if(cnt == 0 && s.length() % 2 == 0) return false;
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while(n-- > 0){
			String s = sc.nextLine();
			if(ktr(s)) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
