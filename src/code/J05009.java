/* Author: NgVanAn */
package code;

import java.util.*;
class ThuKhoaJ05009{
	private String ma, ten, ns;
	private float gpa;

	public ThuKhoaJ05009(int ma, String ten, String ns, float gpa1, float gpa2, float gpa3) {
		this.ma = ma + "";
		this.ten = ten;
		this.ns = ns;
		this.gpa = gpa1 + gpa2 + gpa3;
	}

	public float getGpa() {
		return gpa;
	}

	@Override
	public String toString() {
		return  ma + " " + ten + " " + ns + " " + gpa  ;
	}
	
}
public class J05009 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		float gpaMax = 0;
		ArrayList<ThuKhoaJ05009> arr = new ArrayList<>();
		for(int i = 1; i <= n; i++){
			ThuKhoaJ05009 x = new ThuKhoaJ05009(i, sc.nextLine() , sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
			gpaMax = Math.max(x.getGpa(), gpaMax);
			arr.add(x);
		}
		for(ThuKhoaJ05009 x : arr){
			if(x.getGpa() == gpaMax){
				System.out.println(x);
			}
		}
        }
}
