/* Author: NgVanAn */
package code;

import java.util.*;

public class J03009 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while(n-- > 0){
			String[] s = sc.nextLine().trim().split("\\s+");
			String[] s1 = sc.nextLine().trim().split("\\s+");
			TreeSet<String> set = new TreeSet<>();
			for(int i = 0 ; i < s.length; i++){
				if(Arrays.asList(s1).contains(s[i]) == false) set.add(s[i]);
			}
			for(String x : set)  System.out.print( x + " ");
			System.out.println();
		}
	}
}
