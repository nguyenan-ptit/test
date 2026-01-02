/* Author: NgVanAn */
package code;
import java.util.*;
public class J02011 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		for(int i = 0; i < n-1; i++){
			int min_index = i;
			for(int j = i + 1; j < n; j++){
				if(a[min_index] > a[j]) min_index = j;
			}
			if(min_index !=  i){
				int tmp = a[i];
				a[i] = a[min_index];
				a[min_index] = tmp;
			}
			System.out.print("Buoc " + (i+ 1) + ": ");
			for(int k = 0; k < n; k++) System.out.print(a[k]+ " ");
			System.out.println();
		}
	}
}
