package code;
import java.util.*;
public class J02005 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		List<Integer> arr = new ArrayList<>();
		List<Integer> giao = new ArrayList<>();
		for(int i = 0; i < a; i++)  arr.add(sc.nextInt());
		for(int i = 0; i < b; i++){
			int tmp = sc.nextInt();
			if(arr.contains(tmp) && giao.contains(tmp) == false) giao.add(tmp);
		}
		giao.sort(new Comparator<Integer>(){
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		for(int i = 0; i < giao.size(); i++) System.out.print(giao.get(i) + " ");
	}
}
