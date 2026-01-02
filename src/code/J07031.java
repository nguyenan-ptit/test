/* Author: NgVanAn */
package code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J07031 {
	static boolean nt(int n){
		if(n < 2) return false;
		for(int i = 2; i * i <= n; i++){
			if(n% i == 0) return false;
		}
		return true;
	}
	public static void main(String[] args)throws FileNotFoundException, IOException, ClassNotFoundException{
		FileInputStream fis1 = new FileInputStream("DATA1.in");
		FileInputStream fis2 = new FileInputStream("DATA2.in");
		ObjectInputStream ois1 = new ObjectInputStream(fis1);
		ObjectInputStream ois2 = new ObjectInputStream(fis2);
		List<Integer> arr1 = (ArrayList<Integer>) ois1.readObject();
		Set<Integer> set1  =  new HashSet<>(arr1);
		List<Integer> arr2 = (ArrayList<Integer>) ois2.readObject();
		Set<Integer> set2 = new HashSet<>(arr2);
		for(int i = 2; i < 1000000 / 2 ; i++){
			int tmp = 1000000 - i;
			if(nt(i) && nt(tmp) && ((set1.contains(i) && set1.contains(tmp)) || (!set2.contains(i) && !set2.contains(tmp)) )) System.out.println(i + " " + tmp);
		}
         }
}
