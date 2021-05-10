package com.javaex.api.generic.v2;

public class BoxApp {

	public static void main(String[] args) {
		// Box 생성 시 -> 내부 데이터 타입 결정 
		Box <Integer> intBox = new Box<>(); // 객체화 할 떄 내부 데이터 타입 결정 
		intBox.setContent(2021);  // = intBox.setContent(Integer.valueOf(2021));
//		intBox.setContent("Java");  // compile time 에 내부데이터 체크 (o) : 안전
		

		// 내용물을 꺼내 봅시다
		int retVal = (int)intBox.getContent(); // type casting 의 번거로움 제거 
		System.out.println("내용물: "+ retVal);
		
		// Box 생성 String 값 설정
		Box<String> strBox = new Box<>();
		strBox.setContent("Java");
		
		String strVal = strBox.getContent();
		System.out.println("strBox 내용물 : " + strVal);
		
		// 만약에 캐스팅 잘못 
		// compiler 가 내부 데이터 타입 확인, 실행 이전에 미리 체크 (o)
//		strVal = (String)intBox.getContent();
		
		// Generic 을 사용하
		// 1. 캐스팅 해야하는 불편함 해소 
		// 2. 캐스팅 오류를 컴파일 타임에서 체크 (o)
	}

}
