/* Author: NgVanAn */
package code;

import java.util.*;

public class J08020 {

	static boolean ktra(String s) {
		Map<Character, Character> mp = new HashMap<>();
		mp.put(')', '(');
		mp.put(']', '[');
		mp.put('}', '{');

		LinkedList<Character> arr = new LinkedList<>();

		for (char c : s.toCharArray()) {
			if (mp.containsValue(c)) {          // dấu mở
				arr.addLast(c);
			} else if (mp.containsKey(c)) {     // dấu đóng
				if (arr.isEmpty() || arr.getLast() != mp.get(c)) {
					return false;
				}
				arr.removeLast();
			}
		}
		return arr.isEmpty();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			String s = sc.next();
			if (ktra(s)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
