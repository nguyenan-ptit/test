/* Author: NgVanAn */
package code;

import java.util.*;

public class J03024 {

	public static String kq(String s) {
		if (s.charAt(0) == '0') {
			return "INVALID\n";
		}
		if ((s.charAt(s.length() - 1) - '0') % 2 == 0) {
			int cnt = 0;
			for (char x : s.toCharArray()) {
				if (x < '0' || x > '9') {
					return "INVALID\n";
				}
				if ((x- '0') % 2 == 0) {
					cnt += 1;
				}
			}
			if(cnt > s.length() / 2 && s.length() % 2 == 0)  return "YES\n";
			return "NO\n";
		}
		int cnt = 0;
			for (char x : s.toCharArray()) {
				if (x < '0' || x > '9') {
					return "INVALID\n";
				}
				if ((x- '0') % 2 == 1) {
					cnt += 1;
				}
			}
			if(cnt > s.length() / 2 && s.length() % 2 == 1) return "YES\n";
			return "NO\n";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while (n-- > 0) {
			String s = sc.nextLine();
			System.out.print(kq(s));
		}
	}
}
