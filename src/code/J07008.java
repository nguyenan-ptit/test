/* Author: NgVanAn */
package code;

import java.util.*;
import java.io.*;

public class J07008 {
	public static int[] a = new int[100];
	public static boolean ok = true;
	static int n;
	static List<String> arr = new ArrayList<>();
	static void Try(int i, int j, String s){
		for(int k = j; k <= n; k++){
			if(i <= n){
				if(a[j - 1] < a[k]){
					if(i  > 1){
					arr.add(s + Integer.toString(a[k]) + " ");
					}
				Try(i + 1, k + 1, s + Integer.toString(a[k]) + " ");
				}
			}
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DAYSO.in"));
		 n = sc.nextInt();
		int[] b = new int[100];
		for (int i = 1; i <= n; i++) {
			a[i] =sc.nextInt();
		}
		Try(1, 1, "");
		Collections.sort(arr);
		for (String x : arr) {
			System.out.println(x);
		}
		sc.close();
	}
}
