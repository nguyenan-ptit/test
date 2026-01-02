/* Author: NgVanAn */
package code;

import java.util.*;

public class test {
	public static int tong(String s){
		int cnt = 0;
		for(char c : s.toCharArray()){
			cnt += c - '0';
		}
		return cnt;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			arr.add(sc.next());
		}
		
		Collections.sort(arr, new Comparator<String>(){
			@Override
			public int compare(String a, String b){
			return tong(a) - tong(b);
			}
			});
		for(String x : arr) {
			System.out.print(x + " ");
		}
        }
}
