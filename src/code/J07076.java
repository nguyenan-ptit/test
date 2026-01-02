/* Author: NgVanAn */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07076 {
	public static void main(String[] args)throws FileNotFoundException{
		Scanner sc = new Scanner(new File("MATRIX.in"));  
		int n = Integer.parseInt(sc.nextLine());
		while(n-- > 0){
			Scanner scLine1 = new Scanner(sc.nextLine());
			Scanner scLine2 = new Scanner(sc.nextLine());
			int a = scLine1.nextInt();
			int b = scLine1.nextInt();
			int f = scLine1.nextInt();
			int[][] matrix = new int[a][b];
			int[] tmp = new int[a];
			for(int i = 0; i < a; i++){
				for(int j = 0; j < b; j++) {
					matrix[i][j] = scLine2.nextInt();
					if(j == f - 1) {
						tmp[i] = matrix[i][j];
					}
				}
			}
			Arrays.sort(tmp);
			for(int i = 0; i < a; i++){
				matrix[i][f-1] = tmp[i];
			}
			for(int i = 0; i < a; i++){
				for(int j = 0; j < b; j++ ) System.out.print(matrix[i][j] + " ");
				System.out.println();
			}
		}
         }
}
