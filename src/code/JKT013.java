/* Author: NgVanAn */
package code;

import java.util.*;

public class JKT013 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0){
			int q = sc.nextInt();
			Stack<String> st = new Stack();
			st.push("6");
			st.push("8");
			List<String> arr = new ArrayList<>();
			arr.add("6");
			arr.add("8");
			while(!st.isEmpty()){
				String tmp = st.peek();
				st.pop();
				String s1 = tmp + '6';
				if(s1.length() <= q) {
					arr.add(s1);
					st.push(s1);
				}
				String s2 = tmp + '8';
				if(s2.length() <= q) {
					arr.add(s2);
					st.push(s2);
				}
			}
			Collections.sort(arr, new Comparator<String>(){
				@Override
				public int compare(String o1, String o2){
					if(o1.length() == o2.length()) return o2.compareTo(o1);
					return o2.length() - o1.length();
				}
				
			});
			System.out.println(arr.size());
			for(String s : arr) System.out.print(s + " ");
			System.out.println();
		}
         }
}
