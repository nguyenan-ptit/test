/* Author: NgVanAn */
package code;
import java.util.*;
public class J02012 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		System.out.println("Buoc " + 0 +": " + a[0]);
		for(int i = 1; i < n; i++){
			int pos = i - 1;
			int x = a[i];
			while(pos >= 0 && a[pos] > x){
				a[pos + 1] = a[pos];
				pos -= 1;
			}
			a[pos + 1] = x;
			System.out.print("Buoc " + i +": ");
			for(int k = 0; k <= i; k++){
				System.out.print(a[k] +" ");
			}
			System.out.println();
		}
	}
}
