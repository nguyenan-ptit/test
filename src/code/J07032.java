/* Author: NgVanAn */
package code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J07032 {

	static boolean check(String s) {
		if (s.length() % 2 == 0 || s.length() == 1) {
			return false;
		}
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
			if ((s.charAt(i) - '0') % 2 == 0) {
				return false;
			}
		}
		return (s.charAt(s.length() / 2) - '0') % 2 == 1;
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		FileInputStream fis1 = new FileInputStream("DATA1.in");
		FileInputStream fis2 = new FileInputStream("DATA2.in");
		ObjectInputStream ois1 = new ObjectInputStream(fis1);
		ObjectInputStream ois2 = new ObjectInputStream(fis2);
		int[] a = new int[1000001];
		List<Integer> arr1 = (ArrayList<Integer>) ois1.readObject();
		List<Integer> arr2 = (ArrayList<Integer>) ois2.readObject();
		for (Integer x : arr1) {
			a[x] += 1;
		}
		for (Integer x : arr2) {
			a[x] += 1;
		}
		Set<Integer> set1 = new HashSet<>(arr1);
		Set<Integer> set2 = new HashSet<>(arr2);
		int cnt = 0;
		for (int i = 10; i <= 1000000; i++) {
			if (set2.contains(i) && set1.contains(i)) {
				if (check(String.valueOf(i))) {
					cnt += 1;
					System.out.println(i + " " + a[i]);
					if (cnt >= 10) {
						return;
					}
				}
			}
		}
		ois1.close();
		ois2.close();
	}
}
