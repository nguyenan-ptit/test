/* Author: NgVanAn */
package code;

import java.util.*;
import java.io.*;
public class J07015 {
	static int[] a = new int[10001];
	static void sang(){
		for(int i = 2; i <= 10000; i++) a[i] = 1;
		for(int i = 2; i <= 100; i++){
			if(a[i] == 1){
				for(int j = i * i; j <= 10000; j += i) a[j] = 0;
			}
		}
	}
	public static void main(String[] args)throws FileNotFoundException, IOException, ClassNotFoundException{
		sang();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
		List<Integer> arr = (ArrayList<Integer>) ois.readObject();
		int[] f = new int[10001];
		for(Integer x : arr){
			if(a[x] == 1) f[x] += 1;
		}
		for(int i = 2; i <= 10000; i++ ){
			if(f[i] != 0) {
				System.out.println(i + " " + f[i]);
			}
		}
         }
}
