/* Author: NgVanAn */
package code;

import java.util.*;

public class J03028 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			String s = sc.next();
			String tmp1 = s.substring(0, s.length() / 2);
			String tmp2 = s.substring(s.length() / 2);
			int cnt1 = 0;
			int cnt2 = 0;
			for(char x : tmp1.toCharArray()){
				cnt1 += (x - 65);
			}
			for(char x : tmp2.toCharArray()){
				cnt2 += (x - 65);
			}
			StringBuilder a = new StringBuilder("");
			StringBuilder b = new StringBuilder("");
			for(char x : tmp1.toCharArray()){
				int c = (x + cnt1);
				if(c > 90){
					c = (c - 90 - 1) % 26;
					a.append((char)(c + 65));
				}
				else a.append((char)c);
			}
			for(char x : tmp2.toCharArray()){
				int c = (x + cnt2);
				if(c > 90){
					c = (c - 90 - 1) % 26;
					b.append((char)(c + 65));
				}
				else b.append((char)c);
			}
			StringBuilder d = new StringBuilder("");
			for(int i = 0; i < b.length(); i++){
				char c = (char)(b.charAt(i) - 65 + a.charAt(i));
				if(c > 'Z'){
					d.append((char)(c - 'Z' + 'A' - 1));
				}
				else d.append(c);
			}
			System.out.println(d);
		}
    }
}
