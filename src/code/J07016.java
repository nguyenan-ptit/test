/* Author: NgVanAn */
package code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J07016 {
	public static boolean isPrime(int n){
		if(n < 2) return false;
		for(int i = 2; i * i <= n; i++){
			if(n % i == 0) return false;
		}
		return true;
	}
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
		ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA2.in"));
		ArrayList<Integer> arr1 = (ArrayList<Integer>) ois.readObject();
		ArrayList<Integer> arr2 = (ArrayList<Integer>) ois1.readObject();
		TreeMap<Integer, Integer> mp1 = new TreeMap<>();
		HashMap<Integer, Integer> mp2 = new HashMap<>();
		for(Integer x : arr1){
			if(isPrime(x)){
				if(!mp1.containsKey(x)) mp1.put(x, 1);
				else mp1.put(x, mp1.get(x) + 1);
			}
		}
		for(Integer x : arr2){
			if(isPrime(x)){
				if(!mp2.containsKey(x)) mp2.put(x, 1);
				else mp2.put(x, mp2.get(x) + 1);
			}
		}
		for(Map.Entry<Integer, Integer> se : mp1.entrySet()){
			if(mp2.containsKey(se.getKey())){
				System.out.println(se.getKey() + " " + se.getValue() + " " + mp2.get(se.getKey()));
			}
		}
        }
}
