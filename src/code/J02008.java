
package code;
import java.util.*;
public class J02008 {
	public static boolean[] a = new boolean[101];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List<Integer> arr = new ArrayList<>();
		for(int i = 0; i <= 100; i++) a[i] = true;
		for(int i = 2; i <= 10; i++){
			if(a[i]){
				arr.add(i);
				for(int j = i * i; j <= 100; j += i) a[j] = false;	
			}
		}
		for(int i = 11;i <= 100; i++) if(a[i]) arr.add(i);
		long[] sum = new long[101];
		for(int i = 1; i <= 100; i++){
			long cnt = 1;
			for(int j = 0; j < arr.size() && arr.get(j) <= i; j++){
				int f = 0;
				while((int)Math.pow(arr.get(j), f) <= i) {
					f+= 1;
				}
				cnt *= (long)Math.pow(arr.get(j), f - 1);
			}
			sum[i] = cnt;
		}
		int t = sc.nextInt();
		while(t-- > 0){
		int n = sc.nextInt();
		System.out.println(sum[n]);	
		}
	}
}
