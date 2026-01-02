

package code;

import java.util.*;
public class J01013 {
	public static int[] a= new int[2000001];
	public static void sang(){
		for(int i = 2; i <= 2000000; i++){
			a[i] = i ;
		}
		for(int i = 2; i <= 1415; i++){
			for(int  j = i * i ; j <= 2000000; j += i) {
				if(a[j] == j) a[j] = i;
			}
		}
	}
	public static void main(String[] args){
		sang();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long cnt = 0;
		while(n-- > 0){
			int t = sc.nextInt();
			while(t > 1){
				cnt += a[t] ;
				t /= a[t];
			}
		}
		System.out.println(cnt);
	}
}
