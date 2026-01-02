/* Author: NgVanAn */
package code;

import java.util.*;
import java.math.BigInteger;
public class J03039 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while(n-- > 0){
			String[] s = sc.nextLine().split(" ");
			BigInteger a = new BigInteger(s[0]);
			BigInteger b = new BigInteger(s[1]);
			if(a.toString().length() < b.toString().length()){
				BigInteger tmp = b.mod(a);
				if(tmp.toString() == "0") System.out.println("YES");
				else System.out.println("NO");
			}
			else if(a.toString().length() == b.toString().length()){
				BigInteger tmp = a.subtract(b).abs();
				if(tmp.toString() == "0") System.out.println("YES");
				else System.out.println("NO");
			}
			else{
				BigInteger tmp = a.mod(b);
				if(tmp.toString() == "0") System.out.println("YES");
				else System.out.println("NO");
			}
		}
	}
}
