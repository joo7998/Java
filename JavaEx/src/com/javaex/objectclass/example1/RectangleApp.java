package com.javaex.objectclass.example1;

public class RectangleApp {

	public static void main(String[] args) {
		Rectangle a = new Rectangle(6, 4);
		Rectangle b = new Rectangle(12, 2);
		Rectangle c =  new Rectangle(6, 6);
		
		System.out.println("a.equals(b):" + a.equals(b));
		// should be true 
		System.out.println("a.equals(c):" + a.equals(c));
		// should be false 

	}

}
