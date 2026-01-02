/* Author: NgVanAn */
package code;

import java.util.*;
import java.io.*;

public class test {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("output.txt");
		pw.print("hello");
		pw.close();
//		Scanner sc = new Scanner(new File("DATA.in"));
//		while (sc.hasNextLine()) {
//			String[] s = sc.nextLine().split("\\s+");
//			String name = s[0];
//			int cnt = 0;
//			for(int i = 1; i < s.length; i++){
//				cnt += Integer.parseInt(s[i]);
//			}
//			System.out.println(name + "word "+ " " + cnt );
//		}
	}
}
