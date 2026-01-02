/* Author: NgVanAn */
package code;

import java.util.*;

public class J08022 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			Stack<Integer> st = new Stack();
			int[] a = new int[n];
			int[] b = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			for(int i = n - 1; i >= 0; i--){
				while(st.size() > 0 && st.peek() <= a[i]){
					st.pop();
				}
				if(st.isEmpty()) b[i] = -1;
				else{
					b[i] = st.peek();
				}
				st.push(a[i]);
			}
			for(int i = 0; i < n ; i++) System.out.print(b[i] + " ");
			System.out.println();
		}
         }
}
