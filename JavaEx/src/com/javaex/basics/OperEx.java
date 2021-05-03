package com.javaex.basics;

public class OperEx {

	public static void main(String[] args) {
		 arithOperEx();
		 logicOper();
		 bitOper();
		 
	}

	// 비트 연산자
	// 비트 단위로 미세한 조작 필요시 사용 : 하드웨어 제어, 이미지 프로세싱, 
	
	private static void bitOper() {
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		System.out.println(Integer.toBinaryString(b1));
		System.out.println(Integer.toBinaryString(b2));
		int result = b1 & b2; // 둘다 1 이여야 1 bit 로 세팅
		System.out.println("b1&b2:" + Integer.toBinaryString(result));
		result = b1 | b2; // 비트 논리합 둘 중 하나만 1이면 1 bit 
		System.out.println("b1|b2:" + Integer.toBinaryString(result));
		result = ~b1; // 비트 논리 부정 : 1 <--> 0 
		System.out.println("~b1:" + Integer.toBinaryString(result));
		
	}
	
	
	
	// 비교 연산, 논리 연산
	// 결과로 boolean : 논리값으로 흐름제어 중요
	private static void logicOper() {
		// 비교 연산  < > >= =< == !=
		int n1 = 7;
		int n2 = 3;
		
		System.out.println("a가 b와 같은가? " + (n1 == n2));
		System.out.println("a가 b와 같지 않은가? " + (n1 != n2));
		
		// 논리 연산 AND OR NOT
		int n3 = 5;
		
		// n3는 0초과 10미만 ?
		//    조건 1 : n3 >  0 
		//    조건 2 : n3 < 10
		//    조건 3 : 교집합 영역
		boolean r1 = n3 > 0;
		boolean r2 = n3 < 10;
		boolean r1andr2 = r1 && r2; 
		System.out.println("n3가 0 초과 10 미만 영역? " + r1andr2);
		
		// n3는 0이하 10이상 ?
		//    조건 1 : n3 <= 0
		//    조건 2 : n3 >= 10
		//    조건 1 or 조건 2 : 합집합 
		r1 = n3 <= 0;
		r2 = n3 >= 10;
		boolean r1orr2 = r1 || r2;
		System.out.println("n3가 0 이하 이거나 10 이상 영역? " + r1orr2); 
		
		// not 논리 부정 (true <--> false)
	    boolean rNot = !(n3 > 0 && n3 < 10);
	    System.out.println("논리부정:" +rNot);
	    
		
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
	  
		System.out.println("0.0 / 0.0 ? " + (0.0 / 0.0));  // NaN : Not A Number
		// NaN = 연산 불
		System.out.println("0.0 / 0.0 is NaN ? " + Double.isNaN(0.0 / 0.0));
		System.out.println(0.0 / 0.0 + 10);
		
	}
	
	
}
