/* Author: NgVanAn */
package code;

import java.util.*;
class Pair<U, T>{
	private U first;
	private T second;
	public Pair(U f, T s){
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
		return this.first + " " + this.second;
	}
}
public class J04020 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
}
