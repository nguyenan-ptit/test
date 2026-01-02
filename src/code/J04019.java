/* Author: NgVanAn */
package code;

import java.util.*;
class Point{
	private double x, y;
	Point(){}
	public static Point nextPoint(Scanner sc){
		Point a = new Point();
		a.x = sc.nextDouble();
		a.y = sc.nextDouble();
		return a;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
}
class Triangle extends Point{
	private double c1, c2, c3;
	Triangle(Point a, Point b, Point c){
		c1 = (double)Math.sqrt((a.getX()- b.getX()) * (a.getX()- b.getX()) + ((a.getY()- b.getY()) * (a.getY()- b.getY())));
		c2 = (double)Math.sqrt((c.getX()- b.getX()) * (c.getX()- b.getX()) + ((c.getY()- b.getY()) * (c.getY()- b.getY())));
		c3 = (double)Math.sqrt((a.getX()- c.getX()) * (a.getX()- c.getX()) + ((a.getY()- c.getY()) * (a.getY()- c.getY())));
	}
	public boolean valid(){
		if(c1 + c2 <= c3 || c1 + c3 <= c2 || c2 + c3 <= c1) return false;
		return true;
	}
	public String getPerimeter(){
		double c = (c1 + c2 + c3) ;
		return String.format("%.3f", c);
	}
}
public class J04019 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
