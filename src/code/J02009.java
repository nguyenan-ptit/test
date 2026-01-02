/* Author: NgVanAn */
package code;

import java.util.*;

public class J02009 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> mp= new TreeMap<>();
		while(n-- > 0){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(mp.containsKey(a)) mp.put(a, b + mp.get(a));
			else mp.put(a, b);
		}
		long cnt = 0;
		for(Map.Entry<Integer, Integer> entry : mp.entrySet() ){
			if(cnt <= entry.getKey()){
				cnt = 1L*entry.getKey();
			}
			cnt += 1L*entry.getValue();
		}
		System.out.println(cnt);
         }
}
