

package code;

import java.util.*;
public class J01007 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Long> arr = new ArrayList<>();
		arr.add(1L);
		arr.add(1L);
		long a = 1;
		long b = 1;
		for(int i = 3; i <= 99; i++){
			long c = a + b;
			arr.add(c);
			a= b;
			b = c;
		}
		while(n-- > 0){
			if(arr.contains(sc.nextLong()) == true){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
}
