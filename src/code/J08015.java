/* Author: NgVanAn */
package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class J08015 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);  
		int n = sc.nextInt();
		while(n-- > 0){
			int q = sc.nextInt();
			int k = sc.nextInt();
			int cnt = 0;
			Map<Integer, Integer> mp = new TreeMap<>();
			for(int i = 0; i < q; i++){
				int tmp = sc.nextInt();
				if(mp.get(k - tmp) != null) cnt += mp.get(k - tmp);
				mp.put(tmp, mp.get(tmp) != null ? mp.get(tmp) + 1 : 1);
			}
			System.out.println(cnt);
		}
         }
}
