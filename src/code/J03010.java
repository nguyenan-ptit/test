/* Author: NgVanAn */
package code;

import java.util.*;

public class J03010 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		Map<String, Integer> arr = new LinkedHashMap<>();
		while(n-- > 0){
			String s = sc.nextLine().trim();
			s = s.toLowerCase();
			String[] s1 = s.split("\\s+");
			String f = s1[s1.length -1];
			for(int i = 0; i < s1.length - 1; i++){
				f += s1[i].charAt(0);
			}
			if(arr.containsKey(f) == false ){
				arr.put(f, 1);
				System.out.println(f + "@ptit.edu.vn");
			}
			else{
				arr.put(f, arr.get(f) + 1);
				System.out.println(f + arr.get(f) + "@ptit.edu.vn");
			}
		}
	}
}
