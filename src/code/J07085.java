/* Author: NgVanAn */
package code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J07085 {
	static int tong(String n){
		int cnt = 0;
		for(char c : n.toCharArray()){
			cnt += c - '0';
		}
		return cnt;
	}
	public static void main(String[] args)throws FileNotFoundException, IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("DATA.in");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<String> arr = (ArrayList<String>) ois.readObject();
//		List<String> arr = new ArrayList<>();
//		arr.add("Jhsf00dklT12uhf780LPPZH");
//		arr.add("AAAAddd0000000000000000001T");
		for(String x : arr){
			String tmp = "";
			for(char c : x.toCharArray()){
				if(c <='9' && c - '0' >= 0){
					tmp = tmp + c;
				}
			}
			if(!tmp.isEmpty()){
				for(int i = 0; i < tmp.length(); i++){
					if(tmp.charAt(i)!= '0') {
						tmp = tmp.substring(i);
						break;
					}
				}
				System.out.println(tmp + " "+ tong(tmp));
			}
		}
         }
}
