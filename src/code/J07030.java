/* Author: NgVanAn */
package code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J07030 {
	static boolean nt(int n){
		if(n < 2) return false;
		for(int i = 2; i * i <= n; i++){
			if(n % i == 0) return false;
		}
		return true;
	}
	public static void main(String[] args)throws FileNotFoundException, IOException, ClassNotFoundException {
		FileInputStream fis1 = new FileInputStream("DATA1.in");
		FileInputStream fis2 = new FileInputStream("DATA2.in");
		ObjectInputStream ois1 = new ObjectInputStream(fis1);
		ObjectInputStream ois2 = new ObjectInputStream(fis2);
		List<Integer> arr1 = (ArrayList<Integer>) ois1.readObject();
		Set<Integer> set1  =  new TreeSet<>(arr1);
		List<Integer> arr2 = (ArrayList<Integer>) ois2.readObject();
		Set<Integer> set2 = new HashSet<>(arr2);
		int[] a = new int[1000001];
		for(Integer x : set1){
			int tmp = 1000000 - x;
			if(tmp > x &&nt(tmp) && nt(x) && set2.contains(tmp)) {
				System.out.println(x + " " + tmp);
			}
		} 
		ois1.close();
		ois2.close();
         }
}
