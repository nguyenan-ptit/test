package code;
import java.util.*;
public class J01026 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0){
			int tmp = sc.nextInt();
			if((int)Math.sqrt(tmp) * (int)Math.sqrt(tmp) == tmp) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
