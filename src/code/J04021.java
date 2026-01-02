/* Author: NgVanAn */
package code;

import java.util.*;
class IntSet{
	private TreeSet<Integer> se = new TreeSet();
	IntSet(int[] a){
		for(int i : a){
			se.add(i);
		}
	}
	public IntSet(){}
	public IntSet union(IntSet a){
		IntSet x = new IntSet();
		for(Object i : a.se){
			x.se.add((Integer)i);
		}
		for(Object i : se){
			x.se.add((Integer)i);
		}
		return x;
	}
	@Override
	public String toString(){
		StringBuilder a = new StringBuilder("");
		for(Object x : se){
			a.append(x + " ");
		}
		return a.toString().trim();
	}
}
public class J04021 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
