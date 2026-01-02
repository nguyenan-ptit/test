/* Author: NgVanAn */
package code;

import java.util.*;
class DanhSach{
	String ten, donvi, ma ;
	int giaban, giamua, loinhuan;
	public DanhSach(String ten, String donvi, int giamua, int giaban, String ma){
		this.ten = ten;
		this.donvi = donvi;
		this.giaban = giaban;
		this.giamua = giamua;
		this.ma = ma;
		this.loinhuan = giaban - giamua;
	}
}
public class J05081 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);  
		int n = sc.nextInt();
		List<DanhSach> ds = new ArrayList<>();
		for(int i = 0; i < n; i++){
			StringBuilder s = new StringBuilder(Integer.toString(i + 1));
			while(s.length() < 3){
				s.insert(0,'0');
			}
			s.insert(0, "MH");
			sc.nextLine();
			ds.add(new DanhSach(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt(), s.toString()));
		}
		Collections.sort(ds, new Comparator<DanhSach>(){
			@Override
			public int compare(DanhSach a, DanhSach b){
				if(a.loinhuan != b.loinhuan) return b.loinhuan - a.loinhuan;
				return a.ten.compareTo(b.ten);
			}
		});
		for(DanhSach x : ds){
			System.out.printf("%s %s %s %d %d %d\n", x.ma, x.ten, x.donvi, x.giamua, x.giaban, x.loinhuan);
		}
         }
}
