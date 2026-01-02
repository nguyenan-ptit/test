/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

/**
 *
 * @author ThinkPad
 */
import java.util.Scanner;
public class J01003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == 0 && b != 0){
            System.out.print("VN");
        }
        else if(b == 0 ){
            System.out.print("VSN");
        }
        else{
            System.out.printf("%.2f", -1 * (float)b / a);
        }
    }
}
