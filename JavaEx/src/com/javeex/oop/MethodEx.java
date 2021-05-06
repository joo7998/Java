package com.javeex.oop;

public class MethodEx {

	public static void main(String[] args) {
		printMessage();
		System.out.println("SQUARE:" + square(2));
		System.out.println("4 + 5 = " + getSum(4, 5));
		
		printDivide(7, 3);
		printDivide(7, 0);
	}

	private static void printDivide(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		System.out.printf("%d / %d = %d%n", num1, num2, num1 / num2);
	}
	
	private static double getSum(double num1, double num2) {
		return num1 + num2;
	}
	
	
	private static double square(double num) {
		return num * num;
		
	}

	
}
