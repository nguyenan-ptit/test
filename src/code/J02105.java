/* Author: NgVanAn */
package code;

import java.util.*;

public class J02105 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<List<Integer>> arr = new ArrayList<>();
		for(int i = 1; i <= n; i++){
			List<Integer> a = new ArrayList<>();
			for(int j = 1; j <= n; j++) {
				int tmp = sc.nextInt();
				if(tmp == 1){
					a.add(j);
				}
			}
			arr.add(a);
		}
		for(int i = 0; i < n; i++){
			System.out.print("List(" + (i + 1) +") = ");
			for(int j = 0; j < arr.get(i).size(); j++) System.out.print(arr.get(i).get(j) + " ");
			System.out.println();
		}
	}
}
