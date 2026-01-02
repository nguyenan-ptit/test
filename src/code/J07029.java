/* Author: NgVanAn */
package code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J07029 {
	static boolean nt(int n){
		if(n < 2) return false;
		for(int i = 2; i * i <= n; i++){
			if(n % i == 0) return false;
		}
		return true;
	}
	public static void main(String[] args)throws FileNotFoundException, IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("DATA.in");
		ObjectInputStream  ois = new ObjectInputStream(fis);
		int[] a = new int[1000001];
		List<Integer> arr = (ArrayList<Integer>) ois.readObject();
		for(Integer x : arr){
			a[x] += 1;
		}
		int cnt = 0;
		for(int i = 999999; i >= 2; i--){
			
			if(a[i] > 0 && nt(i)){
				cnt += 1;
				System.out.println(i + " " + a[i]);
				if(cnt >= 10) break;
			}
		}
		ois.close();
         }
}
