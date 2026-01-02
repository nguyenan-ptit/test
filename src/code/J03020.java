/* Author: NgVanAn */
package code;

import java.util.*;

public class J03020 {
	public static boolean check(String s){
		StringBuilder tmp = new StringBuilder(s);
		tmp.reverse();
		return s.equals(tmp.toString());
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = 0;
		String s = new String();
		int cnt = 0;
		
		LinkedHashMap<String, Integer> mp = new LinkedHashMap<>();
		while(sc.hasNext()){
			String x = sc.next();
			if(x.isEmpty()) break;
			if(check(x)){
				if(mp.containsKey(x)){
					mp.put(x, mp.get(x) + 1);
				}
				else{
					mp.put(x, 1);
					size = Math.max(x.length(), size);
				}
			}
		}
		for(Map.Entry<String, Integer> x : mp.entrySet()){
			if(x.getKey().length() == size){
				System.out.println(x.getKey() + " " + x.getValue());
			}
		}
    }
}