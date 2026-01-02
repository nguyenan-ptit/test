/* Author: NgVanAn */
package code;

import java.util.*;
import java.io.*;

public class J07005 {
	public static void main(String[] args)throws IOException{
		DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
		TreeMap<Integer, Integer> mp = new TreeMap<>();
		HashSet<Integer> se = new HashSet<>();
		for(int i = 0; i < 100000; i++){
			int x = dis.readInt();
			if(se.contains(x)){
				mp.put(x, mp.get(x) + 1);
			}
			else {
				se.add(x);
				mp.put(x, 1);
			}
		}
		for(Map.Entry<Integer, Integer> x : mp.entrySet()){
			System.out.println(x.getKey() + " " + x.getValue());
		}
	}
}
