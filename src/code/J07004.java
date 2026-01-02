/* Author: NgVanAn */
package code;

import java.util.*;
import java.io.*;

public class J07004 {

	public static void main(String[] args) {
		try {
			File file = new File("DATA.in");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			TreeMap<Integer, Integer> tmap = new TreeMap<>();
			while ((line = br.readLine()) != null) {
				String[] input = line.split("\\s+");
				for (String s : input) {
					int tmp = Integer.parseInt(s);
					if (tmap.containsKey(tmp) == false) {
						tmap.put(tmp, 1);
					} else {
						tmap.put(tmp, tmap.get(tmp) + 1);
					}
				}
			}
			for (Map.Entry<Integer, Integer> entry : tmap.entrySet()) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
