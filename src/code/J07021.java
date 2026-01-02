/* Author: NgVanAn */
package code;

import java.util.*;
import java.io.*;
public class J07021 {
	public static void main(String[] args)throws FileNotFoundException{
		Scanner sc = new Scanner(new File("DATA.in"));
		String line = new String();
		while(!(line = sc.nextLine()).equals("END")){
			line = line.trim();
			if(line.isEmpty()) continue;
			String[] name = line.toLowerCase().split("\\s+");
			for(String x : name){
				System.out.print(x.substring(0, 1).toUpperCase() + x.substring(1) + " ");
			}
			System.out.println();
		}
		sc.close();
         }
}
