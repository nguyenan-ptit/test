

package code;

import java.util.*;
public class J01009 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long cnt = 0;
		long tmp = 1;
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			tmp *= i;
			cnt += tmp;
		}
		System.out.print(cnt);
	}
}
