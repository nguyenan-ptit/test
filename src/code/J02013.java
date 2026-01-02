/* Author: NgVanAn */
package code;

import java.util.*;

public class J02013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int j = 0; j < n; j++) {
			boolean check = false;
			for (int i = 1; i < n; i++) {
				if (a[i] < a[i - 1]) {
					check = true;
					int tmp = a[i];
					a[i] = a[i - 1];
					a[i - 1] = tmp;
				}
			}
			if (check) {
				System.out.print("Buoc " + (j + 1) +": " );
				for (int f = 0; f < n; f++) System.out.print(a[f] + " ");
				System.out.println();
			}
			else break;
		}
	}
}
