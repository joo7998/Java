package com.javaex.basics;

public class ForMultiplictionTable {
	public static void main(String[] args) {
		for (int i=2; i<10; i++) {
			System.out.println("\n");
			for (int m=1; m<10; m++) {
				System.out.println(i + " x " + m + " = " + (i*m));
			}
		}
	}

}
