/* Author: NgVanAn */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
class WordSet{
	private TreeSet<String> se = new TreeSet<>();
	private HashSet<String> se1 = new HashSet<>();
	WordSet(){}
	WordSet(String file) throws FileNotFoundException{
		Scanner sc = new Scanner(new File(file));
		while(sc.hasNext()){
			String s = sc.next().toLowerCase();
			se.add(s);
			se1.add(s);
		}
	}

	public TreeSet<String> getSe() {
		return se;
	}
	public WordSet union(WordSet o){
		WordSet x = new WordSet();
		x.se.addAll(this.getSe());
		x.se.addAll(o.se);
		return x;
	}
	public WordSet intersection(WordSet o){
		WordSet x = new WordSet();
		for(String s : o.getSe()){
			if(se1.contains(s)){
				x.se.add(s);
			}
		}
		return x;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		for(String x : se){
			s.append(x + " ");
		}
		return s.toString().trim();
	}
	
}
public class J07014 {
	public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
