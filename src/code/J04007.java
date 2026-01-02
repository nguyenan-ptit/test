/* Author: NgVanAn */
package code;

import java.util.*;
class NhanVien{
	private String ten, gioitinh, ns, diachi, mst, ngaykhd;
	public String mnv = "00001" ;
	public void setThongTin(String ten, String gioitinh, String ns, String diachi, String mst, String ngaykhd){
		this.ten = ten;
		this.gioitinh = gioitinh;
		this.ns = ns;
		this.diachi = diachi;
		this.mst = mst;
		this.ngaykhd = ngaykhd;
	}
	public void getThongTin(){
		System.out.print(mnv +" " +ten +" "+ gioitinh + " " + ns + " " + diachi + " " + mst + " " + ngaykhd);
	}
}
public class J04007 {
         public static void main(String[] args){
                 Scanner sc = new Scanner(System.in);  
		NhanVien x = new NhanVien();
		x.setThongTin(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine());
		x.getThongTin();
         }
}
