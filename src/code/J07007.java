/* Author: NgVanAn */
package code;

import java.util.*;
import java.io.*;
public class J07007 {
	public static void main(String[] args)throws FileNotFoundException{
		Scanner sc = new Scanner(new File("VANBAN.in")); 
		Set<String> se = new TreeSet<>();
		while(sc.hasNext()){
			String[] s = sc.nextLine().split("\\s+");
			for(String x : s){
				se.add(x.toLowerCase());
			}
		}
		for(String x : se) System.out.println(x);
		sc.close();
         }
}
