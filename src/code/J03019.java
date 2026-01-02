/* Author: NgVanAn */
package code;

import java.util.*;

public class J03019 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder tmp = new StringBuilder("");
		char c = s.charAt(s.length() - 1);
		for(int i = s.length() - 1; i >= 0; i--){
			if(s.charAt(i) >= c){
				c = s.charAt(i);
				tmp.append(c);
			}
		}
		tmp.reverse();
		System.out.println(tmp);
    }
}
