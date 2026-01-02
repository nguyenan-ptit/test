/* Author: NgVanAn */
package code;

import java.util.*;
class TamGiac04010{
	private
		double p1, p2, p3;
	TamGiac04010(double x1, double y1, double x2, double y2, double x3, double y3){
		p1 = Math.sqrt((x1-x2) * (x1 - x2) + (y1- y2) * (y1 - y2));
		p2 = Math.sqrt((x3-x2) * (x3 - x2) + (y3- y2) * (y3 - y2));
		p3 = Math.sqrt((x3-x1) * (x3 - x1) + (y3- y1) * (y3 - y1));
	}
	@Override
	public String toString(){
		if(p1 + p2 <= p3 || p3 + p2 <= p1 || p1 + p3 <= p2) return "INVALID";
		double s = (double)Math.sqrt((p1 + p2 + p3)*(p1 + p2 - p3) * (p1 + p3 - p2) * (p2 + p3 - p1)) * 0.25;
		double R = p1 * p2 * p3 / (4 * s);
		return String.format("%.3f", R * R * Math.PI);
	}
}
public class J04010 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		int t = sc.nextInt();
		while(t-- > 0){
			TamGiac04010 x = new TamGiac04010(sc.nextDouble(),sc.nextDouble(), sc.nextDouble(),sc.nextDouble(), sc.nextDouble(),sc.nextDouble());
			System.out.println(x);
		}
         }

	
}
