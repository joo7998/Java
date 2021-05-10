package com.javaex.api.generic.v1;

public class BoxApp {

	public static void main(String[] args) {
		// Box 생성 int 값을 설정 
		Box intBox = new Box();
		intBox.setContent(2021);  // = intBox.setContent(Integer.valueOf(2021));

		// 내용물을 꺼내 봅시다
		int retVal = (int)intBox.getContent();
		System.out.println("내용물: "+ retVal);
		
		// Box 생성 String 값 설정
		Box strBox = new Box();
		strBox.setContent("Java");
		
		String strVal = (String)strBox.getContent();
		System.out.println("strBox 내용물 : " + strVal);
		
		// 만약에 캐스팅 잘못 
//		strVal = (String)intBox.getContent();
		
		// 1. Object 를 다룰 수 있는 class 생성 -> 캐스팅 해야하는 불편함
		// 2. 캐스팅 오류를 컴파일 타임에서 체크 (x)
	}

}
