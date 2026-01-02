/* Author: NgVanAn */
package code;

import java.util.*;

public class J03007 {

	public static boolean SoThuanNghich(String s) {
		int cnt = 0;
		for (char x : s.toCharArray()) {
			int tmp = x - '0';
			cnt += tmp;
		}
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return (cnt % 10 == 0 && s.charAt(s.length()-1) == '8');
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while (n-- > 0) {
			String s = sc.nextLine();
			if (SoThuanNghich(s)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
