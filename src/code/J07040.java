/* Author: NgVanAn */
package code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J07040 {
	public static void main(String[] args)throws FileNotFoundException, IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("NHIPHAN.in");
		Scanner sc = new Scanner(new File("VANBAN.in"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<String> arr = (ArrayList<String>) ois.readObject();
		Set<String> set = new HashSet<>();
		for(String x : arr){
			String[] s = x.trim().toLowerCase().split("\\s+");
			set.addAll(Arrays.asList(s));
		}
		List<String> arr1 = new ArrayList<>();
		while(sc.hasNext()){
			arr1.add(sc.next().toLowerCase());
		}
	
		
		for(String x : arr1){
			if(set.contains(x)) {
				System.out.println(x);
				set.remove(x);
			}
		}
         }
}
