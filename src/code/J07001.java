/* Author: NgVanAn */
package code;

import java.util.*;
import java.io.*;
public class J07001 {
	public static void main(String[] args){
		try{
			File inFile = new File("DATA.in");
			FileReader fileReader = new FileReader(inFile);
			BufferedReader br = new BufferedReader(fileReader);
			String line = null;
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
			br.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
         }
}
