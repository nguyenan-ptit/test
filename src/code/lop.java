/* Author: NgVanAn */
package code;

import java.util.*;
class TamGiaclop{
	private double xp1, xp2, xp3, yp1,yp2,yp3;
	private double p1, p2, p3;
	public TamGiaclop(double xp1, double yp1, double xp2,double yp2, double xp3,double yp3){
		this.xp1 = xp1;
		this.xp2 = xp2;
		this.xp3 = xp3;
		this.yp1 = yp1;
		this.yp2 = yp2;
		this.yp3 = yp3;
	}
	public boolean check(){
		p1 = Math.sqrt((xp1 - xp2) *(xp1 - xp2) + (yp1 - yp2) *(yp1 - yp2) );
		p2 = Math.sqrt((xp1 - xp3) *(xp1 - xp3) + (yp1 - yp3) *(yp1 - yp3) );
		p3 = Math.sqrt((xp3 - xp2) *(xp3 - xp2) + (yp3 - yp2) *(yp3 - yp2) );
		if(p1 + p2 <= p3 || p1 + p3 <= p2 || p2 + p3 <= p1) return false;
		return true;
	}
	@Override
	public String toString() {
		return String.format("%.2f",(double)Math.sqrt((p1+p2+p3)* (p1 + p2 - p3) * (p1 + p3 - p2) * (p2 + p3 - p1)) / 4);
	}
}
public class lop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n -- > 0){
			TamGiaclop x = new TamGiaclop(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(),sc.nextDouble(), sc.nextDouble());
			
			if(!x.check()){
				System.out.println("INVALID");
			}
			else {
				System.out.println(x);
			}
		}
	}
}
