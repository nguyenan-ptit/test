

package code;

import java.util.*;
import java.io.*;
public class J01021 {
	public static int MOD = 1000000007;
	public static long powpow(long a, long b){
		if(b == 0) return 1;
		if(b == 1) return a;
		long tmp = powpow(a, b / 2) ;
		if(b % 2 == 0) return(tmp %  MOD) * (tmp %  MOD)  %   MOD;
		return ((tmp %  MOD) *(tmp %  MOD)  %   MOD * a) %   MOD ;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int cnt = 0;
		while((line = br.readLine()) != null){
			line = line.trim();
//			line.trim() -> xoa khoang trang dau cuoi
			if (line.isEmpty()) continue;
			String[] input = line.split("\\s+");
//			split("\\s+") -> dung de tach khoang trang
			cnt += 1;
			long a = Long.parseLong(input[0]);
			long b =Long.parseLong(input[1]);
			if( a == 0 && b == 0 ) break;
			System.out.println(powpow(a, b));
			if(cnt == 20) break;
		}
	}
}
