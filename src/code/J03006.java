/* Author: NgVanAn */
package code;

import java.util.*;

public class J03006 {
	public static boolean SoThuanNghich(String s){
		for(char x : s.toCharArray()){
			int tmp = x - '0';
			if(tmp % 2 == 1) return false;
		}
		for(int i = 0; i < s.length() / 2; i++){
			if(s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while(n-- > 0){
			String s = sc.nextLine();
			if(SoThuanNghich(s)){
				System.out.println("YES");
			}
			else System.out.println("NO");
		}
	}
}
