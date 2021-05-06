package com.javaex.oop.staticmember;

public class StaticExApp {

	public static void main(String[] args) {
		// 호출 순서 : static block -> 생성자
		//            두번째부터는 static 호출 x
		StaticEx s1 = new StaticEx(); 
		System.out.println("참조 카운트:" + StaticEx.refCount);
		//  static 멤버는 객체 생성(new) 없이도 접근할 수 있
		
	    StaticEx s2 = new StaticEx();
	    System.out.println ("참조 카운트:" + StaticEx.refCount);
	
	    // 참조 해제 
	    s1 = null;
	    System.out.println("s1 해제!");
	    System.out.println("참조 카운트:" + StaticEx.refCount);
	    // 강제로 Garbage Collector 호출 
	    // 주의 : 자바가 객체 관리 순서 보여주기 위한 코드 
	    //      강제로 Garbage collector 호출 말자 (memory 가 꼬여버릴수) 
	    System.gc();
	    try {
	    	Thread.sleep(3000); // 3초 대기
	    	System.out.println("참조 카운트:" + StaticEx.refCount);
	    }  catch (Exception e) {
	    	
	    }
	}
	

}
