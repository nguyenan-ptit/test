/* Author: NgVanAn */
package code;

import java.util.*;

class Rectange{
	int width, height;
	String color;
	boolean ok = true;
	int getWidth(){
		return width;
	}
	int getHeight(){
		return  height;
	}
	String getColer(){
		return color.substring(0,1).toUpperCase() + color.substring(1).toLowerCase();
	}
	void setWidth(int width){
		if(width <= 0){
			ok = false;
		}
		else this.width = width;
		
	}
	void setHeight(int height){
		if(height <= 0){
			ok = false;
		}
		else this.height = height;
	}
	void setColor(String coler){
		this.color = coler;
	}
	int findArea(){
		return width * height;
	}
	int findPerimeter(){
		return (width + height) * 2;
	}
	
	
}
public class J04002 {
           public static void main(String[] args){
                      Scanner sc = new Scanner(System.in);  
		Rectange x = new Rectange();
		x.setWidth(sc.nextInt());
		x.setHeight(sc.nextInt());
		x.setColor(sc.nextLine().trim());
		if(x.ok == false) {
			System.out.print("INVALID");
		}
		else System.out.print(x.findPerimeter() +" " + x.findArea() + " " + x.getColer());
           }
}
