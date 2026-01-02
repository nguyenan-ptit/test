/* Author: NgVanAn */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class DanhSach implements Comparable<DanhSach>{
	private String ten, ho, name, dem;
	DanhSach(String name){
		String[] s = name.trim().toLowerCase().split("\\s+");
		this.ten = s[s.length-1];
		this.ho = s[0];
		this.dem = "";
		String tmp = "";
		for(int i = 0; i < s.length; i++){
			tmp = tmp + s[i].substring(0, 1).toUpperCase() + s[i].substring(1) + " ";
			if(i > 0 && i < s.length - 1) this.dem = this.dem + s[i];
		}
		this.name = tmp.trim();
	}
	@Override
	public int compareTo(DanhSach o) {
		if(!ten.equals(o.ten)) return ten.compareTo(o.ten);
		else if(!ho.equals(o.ho)) return ho.compareTo(o.ho);
		return dem.compareTo(o.dem);
	}
	@Override
	public String toString(){
		return name;
	}
}
public class J07072 {
	public static void main(String[] args)throws FileNotFoundException{
		Scanner sc = new Scanner(new File("DANHSACH.in")); 
		List<DanhSach> arr = new ArrayList<>();
		while(sc.hasNextLine()){
			DanhSach x = new DanhSach(sc.nextLine());
			arr.add(x);
		}
		Collections.sort(arr);
		for(DanhSach x : arr) System.out.println(x);
		sc.close();
         }
}
