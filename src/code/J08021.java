/* Author: NgVanAn */
package code;

import java.util.*;

public class J08021 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		while(n-- > 0){
			String s = sc.nextLine();
			Stack<Integer> st = new Stack();
			int maxx = 0;
			st.push(-1);
			for(int i = 0; i < s.length(); i++){
				if(s.charAt(i) == '('){
					st.push(i);
				}
				else{
					st.pop();
					if(st.isEmpty()) st.push(i);
					else maxx = Math.max(maxx, i - st.peek());
				}
			}
			System.out.println(maxx);
		}
         }
}
