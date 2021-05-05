package com.javaex.basics;

public class ForMultiplictionTable {
	
	public static void main(String[] args) {
		printStars();
		forLoopEx();
	}

	private static void printStars() {
		int i,j;
		for (i=0; i<7; i++) {
			System.out.println();
			
			for (j=1; j<1+i; j++) {
				System.out.print("*");
			}
		}
		
	}


	private static void forLoopEx() {
		for (int i=2; i<10; i++) {
			System.out.println();
		
		    for (int m=1; m<10; m++) {
				System.out.println(i + "*" + m + " = " + (i*m));
			}
		}
	}
}

 