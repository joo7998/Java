package com.javaex.practice01;

import java.util.Scanner;

public class Problem01 {
	
	public static void main(String[] args) {
		variableEx();
//		variableInputEx();
		printStars();
		forMultiplicationLoop();
		problem01();
		problem02();
	}

	private static void variableEx() {
		int value = 5;
		int result = value + 3;
		System.out.println(result);
	}
		
	private static void variableInputEx() {		
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Enter a number smaller than 5:");
		int v1 = scanner.nextInt();	

		if (v1 < 5) {
			int v2 = v1 + 2;
		    int v3 = v1 + v2 + 3;
		    System.out.print(v3);
		}
		else {
			System.out.print("value >= 5");
		}
		
		
	}

	private static void printStars() {
		int i,j;                     // variable value 선언 
		for (i=0; i<7; i++) {
			System.out.println();
			
			for (j=1; j<1+i; j++) {
				System.out.print("*");
			}
		}
	}

	private static void forMultiplicationLoop() {
		for (int i=2; i<10; i++) {
			System.out.println("\n");
		
		    for (int m=1; m<10; m++) {
				System.out.println(i + "*" + m + " = " + (i*m));
			}
		}
	}
	
	private static void problem01() {
		for (int i = 1; i < 100; i++) {
			if (i % 5 == 0 && i % 7 == 0)	//continue; (배수 제외값들 모두 출력)
			System.out.println(i);   
		}
	}
	 
	private static void problem02() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요:");
		int n = scanner.nextInt();	
		
		for (int x = 1; x<=n; x++) {
			String result = "";
			for (int y=0; y<x; y++) {
				result += x;}
			System.out.println(result);
		}
		
	}
	
}
