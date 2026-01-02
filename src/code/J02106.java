/* Author: NgVanAn */
package code;

import java.util.*;

public class J02106 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f = 0;
		for(int i = 0; i < n; i++){
			int cnt= 0;
			for(int j = 0; j < 3; j++) {
				int tmp = sc.nextInt();
				if(tmp == 1) cnt += 1;
			}
			if(cnt >  1)f +=  1;
		}
		System.out.print(f);
	}
}
