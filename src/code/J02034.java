/* Author: NgVanAn */
package code;

import java.util.*;

public class J02034 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> arr = new ArrayList<>();
		int minn = 1;
		for(int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			arr.add(tmp);
			minn = Math.max(minn, tmp);
		}
		if(arr.size() == minn){
			System.out.print("Excellent!");
		}
		else{
			for(int i = 1; i <= minn; i++){
				if(arr.contains(i) == false) System.out.println(i);
			}
		}
	}
}
