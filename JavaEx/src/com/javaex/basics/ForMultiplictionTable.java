package com.javaex.basics;

public class ForMultiplictionTable {
	
	public static void main(String[] args) {
		forLoopEx();
//		forLoopEx2();
	}
	
//	private static void forLoopEx2() {
//		for (int x=*; x<7; x++) {
//			System.out.println("\n");
//		}
//		    for(int x=*; x<7; x++) {
//		    	System.out.println(* +)
//		    }
//		
//	}

	private static void forLoopEx() {
		for (int i=2; i<10; i++) {
			System.out.println("\n");
		
		    for (int m=1; m<10; m++) {
				System.out.println(i + "*" + m + " = " + (i*m));
			}
		}
	}
}

 