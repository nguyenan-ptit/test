

package code;

import java.util.*;
public class J01016 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int cnt = 0;
		while(n > 1){
			long tmp = n % 10;
			n /= 10;
			if(tmp == 4 || tmp == 7) cnt += 1;
		}
		if(cnt == 4 || cnt == 7) System.out.print("YES");
		else System.out.print("NO");
	}
}
