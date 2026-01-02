

package code;

import java.util.*;
public class J01014 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc .nextInt();
		while(n-- > 0){
			long q = sc.nextLong();
			int maxx = 1;
			for(int i = 2; i <= (int)Math.sqrt(q); i++){
				while(q  % i == 0){
					q /= i;
					maxx = i;
				}
			}
			if(q > 1 ) System.out.println(q);
			else System.out.println(maxx);
		}
	}
}
