package com.javaex.oop.staticmember;

public class StaticEx {
	public static int refCount; // class member - 참조카운트 
	public static String classVar; // class member
	public String instanceVar; // instance member 
	
	// instance : class 영역 접급 가능 
	// class : instance  영역 접근 불가
	
	// 클래스 영역 초기화는 static block서 수행 
	static {
		refCount = 0; 
		classVar = "Static Member"; 
//		instanceVar = "Instance Member"; // static->instance 접근불
	    System.out.println("Static Block");
	}
	// 생성자 : instance 초기화
	public StaticEx() {
		refCount++;  // refCount 증가
	    System.out.println("refCount:" + refCount);
	    System.out.println("새 Instance 가 생성!");	
	} 
	
	// 소멸자 : 객체가 해제될 때 호출 
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();  //ctrl + space
	}

}
