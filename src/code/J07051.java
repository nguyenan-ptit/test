/* Author: NgVanAn */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
class KhachHang implements Comparable<KhachHang>{
	private String ten, phong, mkh;
	private Long tien, songayo, gia;
	
	KhachHang(int i, String ten, String phong, String ngaynhan, String ngaytra, Long dv, Long gia){
		StringBuilder ngay1 = new StringBuilder( ngaynhan);
		StringBuilder ngay2 = new StringBuilder( ngaytra);
		this.phong = phong;
		if(ngay1.charAt(2) !='/') ngay1.insert(0, '0');
		if(ngay1.charAt(5) != '/') ngay1.insert(3, '0');
		if(ngay2.charAt(2) !='/') ngay2.insert(0, '0');
		if(ngay2.charAt(5) != '/') ngay2.insert(3, '0');
		String[] s = ten.toLowerCase().split("\\s+");
		String tens = "";
		for(String x : s) tens = tens +(x.substring(0, 1).toUpperCase() + x.substring(1) + " ");
		this.ten = tens.trim();
		if(i < 10) mkh = "KH0" + i;
		else mkh = "KH" + i;
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate st = LocalDate.parse(ngay1, f);
		LocalDate ed = LocalDate.parse(ngay2, f);
		songayo = (long) ChronoUnit.DAYS.between(st, ed) + 1;
		this.tien = gia * songayo + dv;
	}

	KhachHang() {
	}
	@Override
	public int compareTo(KhachHang o) {
		return o.tien.compareTo(this.tien);
	}
	public String toString(){
		return mkh + " " + ten + " " + phong + " " + songayo + " " + tien;
	}
	
}
public class J07051 {
	public static void main(String[] args)throws FileNotFoundException{
		Scanner sc = new Scanner(new File("KHACHHANG.in"));  
		List<KhachHang> arr = new ArrayList<>();
		Map<Character, Long> mp  = new HashMap<>();
		mp.put('1' , 25L);
		mp.put('2' , 34L);
		mp.put('3' , 50L);
		mp.put('4' , 80L);
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 1; i <= n; i++){
			String phong;
			KhachHang x = new KhachHang(i, sc.nextLine().trim(), phong = sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim(), Integer.parseInt(sc.nextLine().trim()) * 1L, mp.get(phong.charAt(0)));
			arr.add(x);
		}
		Collections.sort(arr);
		for(KhachHang x : arr) System.out.println(x);
         }
}
