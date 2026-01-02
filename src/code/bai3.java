/* Author: NgVanAn */
package code;

import java.io.File;
import java.io.IOException;
import java.util.*;
class Pair<T, U>{
	private T first;
	private U second;
	public Pair(T f, U s){
		this.first = f;
		this.second = s;
	}
	public boolean isPrime(){
		if((Integer)this.first < 2 || (Integer)this.second < 2) return false;
		for(int i = 2; i * i <= (Integer)this.first; i++){
			if((Integer)this.first % i == 0) return false;
		}
		for(int i = 2; i * i <= (Integer)this.second; i++){
			if((Integer)this.second % i == 0) return false;
		}
		return true;
	}
	@Override
	public String toString(){
		return this.first + " " +  this.second ;
	}
}
public class bai3 {

	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
	public static void main5878727(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("DATA.in"));
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			boolean check = false;
			for (int i = 2; i <= 2 * Math.sqrt(n); i++) {
				Pair<Integer, Integer> p = new Pair<>(i, n - i);
				if (p.isPrime()) {
					System.out.println(p);
					check = true;
					break;
				}
			}
			if (!check) {
				System.out.println(-1);
			}
		}
	}
}
