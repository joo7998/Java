package com.javaex.practice01;

import java.util.Scanner;

public class Problem01 {
	
	public static void main(String[] args) {
		printLine();
		variableEx();
//		variableInputEx();
		byteType();
		byteGarbage();
		printStars();	
		problem01();
//		problem02();
		problem02debug();
		problem031();
		problem03();
//		problem04();
		problem05();
		problem051();
	    problem06();
	}
	
	
	

	private static void printLine() {
		System.out.println(); // one line
		System.out.println("");
		System.out.print("\n"); // one line
		System.out.print("This does not create line.");
		System.out.println("\n"); // two lines ? 
	}

	private static void variableEx() {
		int value = 1;
		int result = value + 0;
		System.out.println(result + "\n");
	}
		
	private static void variableInputEx() {		
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Enter a number smaller than 5:");
		int v1 = scanner.nextInt();	

		if (v1 < 5) {
			int v2 = v1 + 1;
		    int v3 = v1 + v2 + 1;
		    System.out.println(v3);
		}
		else {
			System.out.println("value >= 5");
		}
	}

	private static void byteType() {
		byte var1 = 2;
		System.out.println(var1 + "\n");
	}
	
	private static void byteGarbage() {
		byte var1 = 126;
		int var2 = 126;
		for(int i=0; i<3; i++) {
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
		}	
	}

	private static void printStars() {
		int i,j;                     // variable value 선언 
		for (i=0; i<4; i++) {
			System.out.println(); 
			for (j=1; j<1+i; j++) {
				System.out.print("*");
			}
		}
		System.out.println("\n"); 
	}
	
	private static void problem01() {
		for (int i = 1; i < 100; i++) {
			if (i % 5 == 0 && i % 7 == 0)
			System.out.println(i + "\n");   
		}
	}
	 
	private static void problem02() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int n = scanner.nextInt();	
		
		for (int x = 1; x<=n; x++) {
			String result = "";
			for (int y=0; y<x; y++) {
				result += x;}     // result = result + x
			System.out.println(result);
		}
		
	}
	
	private static void problem02debug() {
		String a = "";   // String : storing "text"
		for (int b=0; b<5; b++) {
		a += 5;          // + : not as an equation, 두 문자를 연결
		System.out.println(a);
		}
	}
	
	private static void problem031() {
		for (int i=2; i<10; i++) {			
		    for (int m=1; m<10; m++) {
				System.out.println(i + "*" + m + " = " + (i*m));
			}
		    System.out.println();
		}
	}
	
	private static void problem03() {
		for(int x=2; x<10; x++) {
			System.out.print("["+x+"단]\t\t"); 
		}
		System.out.println();
		
		for (int x=1; x<10; x++) {
			for (int y=2; y<10; y++) {
				System.out.printf("%d * %d = %d\t", y,x,y*x);
			}
			System.out.println();
		}
	}
	private static void problem04() {
		for (int x=1; x<10; x++) {
			for (int y=2; y<10; y++) {
			System.out.printf("%d\t", x);
		    }
	    }
    }
	
	private static void problem05() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요\n");
		System.out.print("숫자: ");  		int a = scanner.nextInt();	
		System.out.print("숫자: ");		int b = scanner.nextInt();	
		System.out.print("숫자: ");		int c = scanner.nextInt();	
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
	    System.out.print("최대값은 " + max + " 입니다.");
	    }	
	
	// Math.math 사용하기 
	private static void problem051() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요\n");
		System.out.print("숫자: ");  		int a = scanner.nextInt();	
		System.out.print("숫자: ");		int b = scanner.nextInt();		
		int max = a;
        System.out.println(Math.max(a, b));
        }
	
	private static void problem06() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요\n");
		int a = scanner.nextInt();
		if ( a % 2 == 0) {
//			sum = 
		}
	}

}
