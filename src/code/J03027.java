/* Author: NgVanAn */
package code;

import java.util.*;

public class J03027 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] c = new char[100];
		int m = 0;
		for(int i = 0 ; i < s.length(); i++){
			if(m > 0 && c[m -1] == s.charAt(i)){
				m--;
			}
			else{
				c[m++] = s.charAt(i);
			}
		}
		if(m == 0) System.out.print("Empty String");
		else{
			for(int i = 0; i < m; i++) System.out.print(c[i]);
		}
	}
}
