package com.javaex.basics;

public class OperEx {

	public static void main(String[] args) {
		 arithOperEx();
	}

	
	// 산술 연산자
	private static void arithOperEx() {
		int a = 7;
		int b = 3;
		
		// 부호연산자: + -
		System.out.println(-a); // a * -1
		
		// 사칙연산: + - * / 
		System.out.println(a + "/" + b + "=" + (a / b));
		System.out.println("a를 b로 나눈 나머지:" + (a % b));
		
		// 정수 / 정수 = 정수
		
		// 실제 나눗셈 결과? 
		System.out.println((float)a / (float)b);  // int -> float 로 둘다 변
		System.out.print((float)a / b);           // 하나만 int -> float 로 변환
		
		System.out.println("------");
		// 증감 연산자 ++ --
		// 위치에 따라 연산순서 달라
		a = 7;
		System.out.println("a:" + a);
		System.out.println("전위 증감연산:" + (++a));
		System.out.println("최종 a:" + a);
		
		a = 7;
		System.out.println("a:" + a);
		System.out.println("후위 증감연산:" + (a++));
		System.out.println("최종 a:" + a);
		
		// 나눗셈 보충
		a = 7;
// 	    System.out.println(a / 0);   정수 / 0 = ArithmeticException
		System.out.println((float)a / 0);  //Infinity  
		
		//Infinity 가 포함 연산식 = 항상 Infinity
		System.out.println("7.0 / 0 은 유한수인가? " + Double.isFinite(7.0/0));
	  
		System.out.println("0.0 / 0.0 ? " + (0,0 / 0.0));  // Not A Number
		// NaN = 연산 불
		System.out.println("0.0 / 0.0 is NaN ? " + Double.isNaN(0.0 / 0.0));
		System.out.println(0.0 / 0.0 + 10);
		
	}
	
}
