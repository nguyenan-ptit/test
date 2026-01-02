/* Author: NgVanAn */
package code;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;
import java.math.BigInteger;
public class J07022 {
	public static void main(String[] args)throws FileNotFoundException{
		FileInputStream fout = new FileInputStream("DATA.in");
		Scanner sc = new Scanner(fout);
		List<String> arr = new ArrayList<>();
		while(sc.hasNext()){
			if(sc.hasNextBigInteger()){
				BigInteger a = new BigInteger(sc.next());
				if(a.compareTo(BigInteger.valueOf((long)Math.pow(2L, 32) - 1)) >= 0) {
					arr.add(a.toString());
				}
			}
			else arr.add(sc.next());
		}
		Collections.sort(arr);
		for(String x : arr) System.out.print(x + " ");
         }
}
