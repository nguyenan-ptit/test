/* Author: NgVanAn */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class DanhSach implements Comparable<DanhSach>{
	private String ten, ho, name;
	public Set<String> se = new HashSet<>();
	DanhSach(String name){
		String[] s = name.split("\\s+");
		this.name = name;
		ho = s[0];
		ten = s[s.length - 1];
		String tmp = "";
		for(int i = 0; i < s.length; i++){
			for(int j = 0; j < s.length; j++){
				if(j == i){
					tmp = tmp +"*";
				}
				else  tmp = tmp + s[j].charAt(0);
				if(j < s.length - 1) tmp += ".";
			}
			se.add(tmp);
			tmp ="";
		}
	}
	@Override
	public int compareTo(DanhSach o) {
		if(ten != o.ten) return ten.compareTo(o.ten);
		return ho.compareTo(o.ho);
	}
	public String toString(){
		return name;
	}
}
public class J07071 {
	public static void main(String[] args)throws FileNotFoundException{
		Scanner sc = new Scanner(new File("DANHSACH.in"));  
		int n = Integer.parseInt(sc.nextLine());
		List<DanhSach> arr = new ArrayList<>();
		while(n-- > 0){
			DanhSach x = new DanhSach(sc.nextLine());
			arr.add(x);
		}
		Collections.sort(arr);
		int q = Integer.parseInt(sc.nextLine());
		while(q-- > 0){
			String tmp = sc.nextLine();
			for(DanhSach x : arr){
				if(x.se.contains(tmp)) System.out.println(x);
			}
		}
         }
}
