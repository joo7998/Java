package com.javaex.api.objectclass.v1;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(10, 10);
		
		// Java 최상위 클래스 : Object 
		// 		-> 모든 클래스는 Object 의 모든 메서드를 물려받는
		System.out.println("클래스 이름:" + p.getClass().getName());
		System.out.println("객체 식별 정보:" + p.hashCode()); // 메모리 주소 
		System.out.println("객체 출력:" + p);
		System.out.println("객체 출력:" + p.toString());
		
		
		// 객체 p의 부모 클래스 정보 확인
		System.out.println("Point의 부모: " + p.getClass().getSuperclass().getName());
	
		

	
	}

}
