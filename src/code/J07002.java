/* Author: NgVanAn */
package code;

import java.util.*;
import java.io.*;
public class J07002 {
	public static void main(String[] args){
		
		try{
			long cnt = 0;
			File inFile = new File("DATA.in");
			FileReader fileReader = new FileReader(inFile);
			BufferedReader br = new BufferedReader(fileReader);
			String line = null;
			while((line = br.readLine()) != null){
				String[] s = line.split("\\s+");
				for(String x : s){
					if(x.matches("\\d+")){
						if(x.length() <= 9){
							cnt += Integer.parseInt(x) * 1L;
						}
					}
				}
			}
			br.close();
			System.out.print(cnt);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
