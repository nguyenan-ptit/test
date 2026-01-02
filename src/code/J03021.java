/* Author: NgVanAn */
package code;

import java.util.*;
public class J03021 {
	public static boolean check(StringBuilder s){
		StringBuilder s1 = new StringBuilder(s);
		s1.reverse();
		return s1.toString().equals(s.toString()) ;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while(n-- > 0){
			String s = sc.nextLine();
			StringBuilder sb = new StringBuilder();
			s = s.toLowerCase();
			for(char x : s.toCharArray()){
				if(x <= 'c'){
					sb.append(2);
				}
				else if(x <= 'f') sb.append(3);
				else if(x <= 'i') sb.append(4);
				else if(x <= 'l') sb.append(5);
				else if(x <= 'o') sb.append(6);
				else if(x <= 's') sb.append(7);
				else if(x <= 'v') sb.append(8);
				else sb.append(9);
			}
			if(check(sb)){
				System.out.println("YES");
			}
			else System.out.println("NO");
			
		}
	}
}
