

package code;

import java.util.*;
public class J01024 {
	public static boolean threeCheck(int n){
		while(n > 1){
			int tmp = n % 10;
			n /= 10;
			if(tmp != 1 && tmp != 0  && tmp != 2) return false;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0){
			int q = sc.nextInt();
			if(threeCheck(q)) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
