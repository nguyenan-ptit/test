/* Author: NgVanAn */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
class Online implements Comparable<Online>{
	private int time;
	private String name;
	Online(String name, String date1, String date2) throws ParseException{
		this.name = name;
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date st = sdf.parse(date1);
		Date ed = sdf.parse(date2);
		this.time = (int) ((ed.getTime() - st.getTime()) / (60 * 1000));
	}

	@Override
	public int compareTo(Online o) {
		if(time != o.time) return o.time - time;
		return name.compareTo(o.name);
	}
	@Override
	public String toString(){
		return name + " " + time;
	}
}
public class J07084 {
	public static void main(String[] args)throws FileNotFoundException, ParseException{
		Scanner sc = new Scanner(new File("ONLINE.in"));  
		int n = Integer.parseInt(sc.nextLine());
		List<Online> arr = new ArrayList<>();
		while(n-- > 0){
			Online x = new Online(sc.nextLine(), sc.nextLine(), sc.nextLine());
			arr.add(x);
		}
		Collections.sort(arr);
		for(Online x : arr) System.out.println(x);
         }
}
