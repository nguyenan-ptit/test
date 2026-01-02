
package code;

import java.util.*;
import java.io.*;
public class HELLOFILE {
    public static void main(String[] args) throws FileNotFoundException{
        File myObj = new File("Hello.txt");
        Scanner myReader = new Scanner(myObj);
        while(myReader.hasNextLine()){
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
    }
}
