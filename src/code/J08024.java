/* Author: NgVanAn */
package code;

import java.util.*;
import java.math.BigInteger;

public class J08024 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			BigInteger MOD = new BigInteger(String.valueOf(n));
			Queue<String> q = new LinkedList();
			q.offer("9");
			while(!q.isEmpty()){
				String tmp = q.poll();
				BigInteger sb = new BigInteger(tmp);
				if(sb.mod(MOD).equals(BigInteger.ZERO)){
					System.out.println(tmp);
					break;
				}
				q.offer(tmp + "0");
				q.offer(tmp + "9");
			}
		}
	}
}
