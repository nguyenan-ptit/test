/* Author: NgVanAn */
package code;

import java.util.*;
import java.io.*;
public class J07006 {
	public static void main(String[] args)throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in")); 
		List<Integer> arr = (ArrayList<Integer>) ois.readObject();
		int[] a = new int[1000];
		for(Integer i : arr){
			a[i] += 1;
		}
		for(int i  = 0; i < 1000; i++) System.out.println(i + " " + a[i]); 
         }
}
