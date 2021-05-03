package com.javaex.basics;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
		
		ifElseEx();
		ifElseEx2();
	}


	private static void ifElseEx2() {
	   Scanner scanner = new Scanner(System.in);
	   System.out.print("정수를 입력하세요:");
	   
	   int num = scanner.nextInt();
	   
	   if (num > 0) {
		   if (num % 2 == 0) {
			   System.out.println("짝수:");
			 } else {
				 System.out.println("홀수:");
			 }
	   } else {
		   if (num == 0) {
			   System.out.println("0입니다:");
		   } else {
			   System.out.println("음수입니다:");
		   }
		  
		   scanner.close();
}
	
	
	private static void ifElseEx() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");

	    int num = scanner.nextInt();
	    
	    if (num > 0) {
	    	System.out.println("양수입니다.");
	    } else if(num < 0) {
	    	System.out.println("음수입니다.");
	    } else 
	    	System.out.println("0입니다.");
	
	    scanner.close();
	}
	
	
	
       
