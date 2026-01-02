

package code;

import java.util.*;
public class J01025 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2= sc.nextInt();
		int x01 = sc.nextInt();
		int y01 = sc.nextInt();
		int x02 = sc.nextInt();
		int y02 = sc.nextInt();
		x1 = Math.min(x1, x01);
		y1 = Math.min(y1, y01);
		x2 = Math.max(x2, x02);
		y2 = Math.max(y2, y02);
		int s = Math.max(x2 - x1 + 1 , y2- y1 + 1) - 1;
		System.out.print(s * s);
	}
}
