/* Author: NgVanAn */
package code;

import java.util.*;

public class J03022 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = "";
		while(sc.hasNextLine()){
			String tmp = sc.nextLine();
			if(tmp.isEmpty()) break;
			s += tmp;
		}
		String[] tmp = s.split("[.\\?\\!]");
		for(String x : tmp) {
			String[] tmp1 = x.trim().split("\\s+");
			for(int i = 0; i < tmp1.length; i++){
				if(i == 0){
					System.out.print(tmp1[i].substring(0, 1).toUpperCase() + tmp1[i].substring(1).toLowerCase());
				}
				else System.out.print(" " + tmp1[i].toLowerCase());
			}
			System.out.println("");
		}
    }
}
