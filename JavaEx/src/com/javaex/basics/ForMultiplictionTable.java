package com.javaex.basics;

public class ForMultiplictionTable {
	
	public static void main(String[] args) {
		forLoopEx();
		forLoopEx2();
	}
	
	private static void forLoopEx2() {
		for (int x=1; x<7; x++) {
			System.out.println("\n");
	
		    for(int *=1; x<7; x++) {
		    	System.out.println(x*x);
		    }
		}
}

	private static void forLoopEx() {
		for (int i=2; i<10; i++) {
			System.out.println("\n");
		
		    for (int m=1; m<10; m++) {
				System.out.println(i + "*" + m + " = " + (i*m));
			}
		}
	}
}

 