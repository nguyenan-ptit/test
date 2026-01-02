/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.util.Scanner;
public class J01002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >= 1){
            int n = sc.nextInt();
            long cnt = (1L * n + 1) * n / 2;
            System.out.println(cnt);
        }
    }
}
