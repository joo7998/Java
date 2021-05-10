package com.javaex.api.collection.list;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// vector 선언 : buffer 기반 연속 데이터 처리 
		Vector v = new Vector();
		System.out.println("Size: " + v.size() + ", Capacity:" + v.capacity());
		
		// 1 ~ 10 
		for (int i = 1; i <=10; i++) {
			v.addElement(i);  // = v.addElement(Integer.valueOf(i)); 
		}
		System.out.println("Size: " + v.size() + ", Capacity:" + v.capacity());
		
		v.addElement(11);  // 허용량 자동 증가 
		System.out.println("Size: " + v.size() + ", Capacity:" + v.capacity());
		
		System.out.println("v : " + v);
		
		// 12 객체 : 5 index 에 추가 
		v.insertElementAt(12, 5);
		System.out.println("v : " + v);
		
		// 객체 조회: 특정 인덱스의 객체 조회 
		System.out.println("index 5의 객체 : " + v.elementAt(5));
		
		// 객체 인덱스 조회
		System.out.println("객체 12의 index: " + v.indexOf(12));
		
		// 없는 객체의 index = -1
		System.out.println("없는 객체의 index : " + v.indexOf(0));
		
		// 포함 여부 확인 : T/F
		System.out.println("v가 10을 포함? " +v.contains(10));
		
		// 내부 요소들 loop로 접근 
		for (int i = 0; i < v.size(); i++) {
			Integer item = (Integer)v.elementAt(i);
			System.out.print(item + " ");
		}
		System.out.println();
		// TODO : Loop 개선 
		
		// Buffer 비우기 
		v.clear();
		System.out.println("v : " + v);
		System.out.println("Size: " + v.size() + ", Capacity:" + v.capacity());
	}

}
