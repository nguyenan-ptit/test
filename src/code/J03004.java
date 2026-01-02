/* Author: NgVanAn */
package code;

import java.util.*;

public class J03004 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while(n-- > 0){
			String s = sc.nextLine();
			s = s.toLowerCase();
			String[] arr = s.trim().split("\\s+");
			String f = "";
			for(int i = 0; i < arr.length; i++){
				arr[i] = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
				f += arr[i] + " ";
			}
			System.out.println(f);
		}
	}
}
