
package code;
import java.util.Scanner;
class Point3D{
	private int x, y, z;
	
	public Point3D(){}
	
	public Point3D(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4 ){
		Point3D a = new Point3D();
		Point3D b = new Point3D();
		a.x =p2.x - p1.x;
		a.y = p2.y - p1.y;
		a.z = p2.z - p1.z;	
		b.x = p2.x - p4.x;
		b.y = p2.y - p4.y;
		b.z = p2.z - p4.z;
		int x3 = a.x * b.y - a.y * b.x;
		int x2 =  a.x*b.z - a.z * b .x;
		int x1 =  a.y * b.z - a.z * b.y;
		
		
		int D = -(p2.x * x1 + p2.y * x2 + p2.z * x3);
		int tmp = (p3.x * x1 + p3.y * x2 + p3.z * x3 ) + D;
		if(tmp == 0) return true;
		return false;
		
	}
		
}
public class J04011 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
    }
}
