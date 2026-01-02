/* Author: NgVanAn */
package code;

import java.util.*;

public class J02016 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);  
		int n = sc.nextInt();
		while(n-- > 0){
			int q = sc.nextInt();
			Set<Long> se = new HashSet<>();
			int[] a = new int[q];
			for(int i = 0; i < q; i++){
				a[i] = sc.nextInt();
				se.add(1L * a[i] * a[i]);
			}
			Arrays.sort(a);
			boolean ok = false;
			for(int i = 0; i < q- 2; i ++){
				if(!ok){
					for(int j = i + 1; j < q - 1; j++){
						long tmp = a[i] * 1L  * a[i]  +a[j] * 1L  * a[j];
						if(se.contains(tmp)) {
							System.out.println("YES");
							ok = true;
							break;
						}
					}
				}
				else break;
			}
			if(!ok) System.out.println("NO");
		}
	}
}
