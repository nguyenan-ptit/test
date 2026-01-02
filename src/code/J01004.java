/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

/**
 *
 * @author ThinkPad
 */
import java.util.*;
public class J01004 {
         public static boolean nt(int n){
                  if(n < 2) return false;
                  for(int i = 2; i < (int)Math.sqrt(n); i++){
                      if(n % i == 0) return false;
                  }
                  return true;
         }
         public static void main(String[] args){
                  Scanner sc = new Scanner(System.in);
                  int n = sc.nextInt();
                  while(n-- > 0){
                      if(nt(sc.nextInt())){
                          System.out.println("YES");
                      }
                      else System.out.println("NO");
                  }
         }
}
