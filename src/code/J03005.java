/* Author: NgVanAn */
package code;

import java.util.*;

public class J03005 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0){
			sc.nextLine();
			String s = sc.nextLine();
			s = (s.trim().toLowerCase());
			String[] arr = s.split("\\s+");
			String f = "";
			for(int i = 1; i < arr.length; i++){
				arr[i] = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
					f += arr[i] ;
					if(i < arr.length - 1) f += " ";
					else f +=", ";
			}
			f += arr[0].toUpperCase();
			System.out.println(f);
		}
	}
}
