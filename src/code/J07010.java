/* Author: NgVanAn */
package code;

import java.util.*;
import java.io.*;
class SinhVienJ07010{
	private String msv, ten, mlop, ngaysinh;
	float gpa;
	public void setMsv(String msv){
		while(msv.length() < 3) msv = '0' + msv;
		this.msv = "B20DCCN" + msv;
	}
	public void setTen(String ten){
		this.ten = ten;
	}
	public void setMlop(String mlop){
		this.mlop = mlop;
	}
	public void setNgaysinh(StringBuilder ngaysinh){
		if(ngaysinh.charAt(2) != '/') ngaysinh.insert(0, '0');
		if(ngaysinh.charAt(5) != '/') ngaysinh.insert(3, '0');
		this.ngaysinh = ngaysinh.toString();
	}
	public void setGpa(float gpa){
		this.gpa = gpa;
	}
	public void getTT(){
		System.out.printf("%s %s %s %s %.2f\n",this.msv, this.ten,this.mlop,this.ngaysinh,this.gpa);
	}
};
public class J07010 {
	public static void main(String[] args)throws FileNotFoundException {
		Scanner sc = new Scanner(new File("SV.in"));  
		int n = sc.nextInt();
		int cnt = 1;
		while(n-- > 0){
			sc.nextLine();
			String num = Integer.toString(cnt);
			SinhVienJ07010 x = new SinhVienJ07010();
			x.setMsv(num);
			x.setTen(sc.nextLine());
			x.setMlop(sc.nextLine());
			x.setNgaysinh(new StringBuilder(sc.nextLine()));
			x.setGpa(sc.nextFloat());
			cnt += 1;
			x.getTT();
		}
         }
}
