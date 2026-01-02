package code;
import java.util.*;
public class J02007 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int cnt = 0;
		while(t-- > 0){
			cnt += 1;
			int n = sc.nextInt();
			Map<Integer, Integer> map = new LinkedHashMap<>();
			for(int i = 0; i < n; i++){
				int tmp = sc.nextInt();
				if(map.containsKey(tmp)) map.put(tmp, map.get(tmp) + 1);
				else map.put(tmp, 1);
			}
			System.out.println("Test " + cnt +":");
			for(Map.Entry<Integer, Integer> entry : map.entrySet()){
				System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
			}
		}
	}
}
