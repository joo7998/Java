package com.javaex.practice01;

import java.util.Scanner;

public class Problem01 {
	
	
	public static void main(String[] args) {
		problem01();
		problem02();
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
		for (int x = 1; y<=n; x++) {
			for (int y=0; y<x; y++)
				System.out.print
		}
		
	}
	
	private static void forLoopEx()
		Scanner scanner = new Scanner(System.in);
		System.out.print("단을 입력하세요:");
		int dan = scanner.nextInt();
		for (int num = 1; num <= 9; num++) {
			System.out.println(dan + "*" + num + "=" + (dan * num));
		}
		scanner.close();
	}


}