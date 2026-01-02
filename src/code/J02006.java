package code;
import java.util.*;
public class J02006 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		TreeSet<Integer> set = new TreeSet<>();
		for(int i =0; i <  a + b; i++) set.add(sc.nextInt());
		for(int x : set) System.out.print(x + " ");
	}
}
