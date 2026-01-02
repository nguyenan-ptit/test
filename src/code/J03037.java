/* Author: NgVanAn */
package code;

import java.util.*;

public class J03037 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String tmp = sc.next();
		int[] first = new int[26];
		int[] last = new int[26];
		for(int i = 0; i < 26; i++){
			first[i] = -1;
		}
		for(int i = 0; i < 52; i++){
			int index = tmp.charAt(i) - 'A';
			if(first[index] == -1){
				first[index] = i;
			}
			else last[index] = i;
		}
		int cnt = 0;
		for(int i = 0; i < 25; i++){
			for(int j = i + 1; j < 26; j++ ){
				if((first[i] < first[j] && first[j] < last[i] && last[i] < last[j]) || (first[j] < first[i] && first[i] < last[j] && last[j] < last[i])){
					cnt += 1;
				}
			}
		}
		System.out.println(cnt);
	
    }
}
