/* Author: NgVanAn */
package code;

import java.util.*;

public class J03031 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			String tmp = sc.next();
			int k = sc.nextInt();
			HashSet<Character> se = new HashSet<>();
			for(char x : tmp.toCharArray()){
				se.add(x);
			}
			if(tmp.length() < 26 || (se.size() + k) < 26){
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
		}
        }
}
