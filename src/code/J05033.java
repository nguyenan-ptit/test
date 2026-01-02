/* Author: NgVanAn */
package code;

import java.util.*;
class ThoiGian{
	int gio, phut, giay;
	public ThoiGian(int gio, int phut, int giay){
		this.gio = gio;
		this.giay = giay;
		this.phut = phut;
	}
}
public class J05033 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);  
		int n = sc.nextInt();
		List<ThoiGian> arr = new ArrayList<>();
		for(int i = 0; i < n; i++){
			arr.add(new ThoiGian(sc.nextInt(),sc.nextInt(),sc.nextInt()));
		}
		Collections.sort(arr, new Comparator<ThoiGian>(){
			@Override
			public int compare(ThoiGian a, ThoiGian b){
				if(a.gio != b.gio) return a.gio - b.gio;
				if(a.phut != b.phut) return a.phut - b.phut;
				return a.giay - b .giay;
			}
		});
		for(ThoiGian x : arr){
			System.out.println(x.gio +" " + x.phut + " " + x.giay);
		}
         }
}
