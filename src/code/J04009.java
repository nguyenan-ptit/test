/* Author: NgVanAn */
package code;

import java.util.*;
class TamGiac2 {
	private double c1, c2, c3;
	TamGiac2(double x1, double y1, double x2, double y2, double x3, double y3){
		this.c1 = (double) Math.sqrt((x1-x2) * (x1- x2) + (y1 - y2) * (y1- y2));
		this.c2 = (double) Math.sqrt((x3-x2) * (x3- x2) + (y3 - y2) * (y3- y2));
		this.c3 = (double) Math.sqrt((x3-x1) * (x3- x1) + (y3 - y1) * (y3- y1));
	}
	public boolean check(){
		if(c1 + c2 <= c3 || c1 + c3 <= c2 || c2 + c3 <= c1) return false;
		return true;
	}
	@Override
	public String toString() {
		if(c1 + c2 <= c3 || c1 + c3 <= c2 || c2 + c3 <= c1) return "INVALID";
		return String.format("%.2f",(double)(Math.sqrt((c1+c2+c3)* (c1 + c2 - c3) * (c1 + c3 - c2) * (c2 + c3 - c1)) / 4));
	}
	
}
public class J04009 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		int t = sc.nextInt();
		while(t-- > 0){
			TamGiac2 x = new TamGiac2(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
			System.out.println(x);
		}
    }
}
