/* Author: NgVanAn */
package code;

import java.util.*;

public class J03040 {
	public static boolean ck(String s){
		String tmp = s.substring(5, 8) + s.substring(9, 11);
		int cnt = 0;
		for(char x : tmp.toCharArray()){
			if(x == '6' || x == '8') cnt += 1;
		}
		if(cnt == 5) return true;
		cnt = 1;
		for(int i = 1; i < 5; i++){
			if(tmp.charAt(i) - tmp.charAt(i-1) == 1) cnt += 1;
			else break;
		}
		if(cnt == 5) return true;
		cnt = 1;
		for(int i = 1; i < 5; i++){
			if(tmp.charAt(i) == tmp.charAt(i-1)) cnt += 1;
			else break;
		}
		if(cnt == 5) return true;
		return (tmp.charAt(0) == tmp.charAt(1) && tmp.charAt(1) == tmp.charAt(2) && tmp.charAt(3) == tmp.charAt(4));
	}
           public static void main(String[] args){
                      Scanner sc = new Scanner(System.in);  
		int n = sc.nextInt();
		sc.nextLine();
		while(n--> 0){
			String s = sc.nextLine();
			if(ck(s)) System.out.println("YES");
			else System.out.println("NO");
		}
           }
}
