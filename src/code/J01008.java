

package code;

import java.util.*;
public class J01008 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int j = 1;
		while(n-- > 0){
			TreeMap<Integer, Integer> mp = new TreeMap<>();
			int t = sc.nextInt();
			System.out.print("Test " + j++  +": ");
			for(int i = 2; i <= (int)Math.sqrt(t); i++){
					while(t % i == 0){
						if(mp.containsKey(i)){
							mp.put(i, mp.get(i) + 1);
						}
						else mp.put(i, 1);
						t /= i;
					}
			}
			if(t > 1) mp.put(t, 1);
			for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
				System.out.print(entry.getKey() + "(" + entry.getValue() +") ");
			}
			System.out.println();
		}
	}
}
