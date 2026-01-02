/* Author: NgVanAn */
package code;

import java.util.*;
class Point{
	double x, y;
	void setXY(double x, double y){
		this.x = x;
		this.y = y;
	}
	double GetP(double x){
		return x;
	}

	private void setY(int y) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}
}
public class J04001 {
           public static void main(String[] args){
                      Scanner sc = new Scanner(System.in);  
		int n = sc.nextInt();
		while (n-- > 0){
			Point x1 = new Point();
			Point x2 = new Point();
			x1.setXY(sc.nextDouble(), sc.nextDouble());
			x2.setXY(sc.nextDouble(), sc.nextDouble());
			double c =Math.sqrt(Math.abs((x1.x - x2.x) * (x1.x - x2.x) + (x1.y - x2.y) * (x1.y - x2.y)));
			System.out.printf("%.4f\n", c);
		}
           }
}
