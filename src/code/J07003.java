/* Author: NgVanAn */
package code;

import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class J07003 {
	public static void main(String[] args){
		try{
			File inFile = new File("DATA.in");
			FileReader fr = new FileReader(inFile);
			BufferedReader br = new BufferedReader(fr);
			String s = br.readLine();
			int l = s.length();
			while(l > 1){
				int mid = l / 2;
				BigInteger a = new BigInteger(s.substring(0, mid ));
				BigInteger b = new BigInteger(s.substring(mid ));
				BigInteger c = a.add(b);
				s = c.toString();
				l = s.length();
				System.out.println(c);
			}
		}
		catch(Exception e){
			
		}
         }
}
