/* Author: NgVanAn */
package code;

import java.util.*;

public class J03032 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while(n-- > 0){
			String[] s = sc.nextLine().split(" ");
			for(int i = 0; i < s.length; i++){
				StringBuilder sb = new StringBuilder(s[i]);
				System.out.print(sb.reverse().toString() +" ");
			}
			System.out.println();
		}
	}
}
