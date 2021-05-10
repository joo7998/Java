package com.javaex.api.collection.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

// Stack : 입력 , 출력이 한쪽 방향에서만 & 중간 삽입, 삭제 (x) 
public class StackEx {

	public static void main(String[] args) {
		// Stack 선언 
		Stack <Integer> stack = new Stack<>();
		
		for (int i = 1; i <= 10; i++) {
			stack.push(i);
			System.out.println("PUSH : " + stack);
		}
		
		// peek : 가장 위 데이터 확인 
		System.out.println("PEEK : " + stack.peek());
		System.out.println("Stack : " + stack);
		
		// pop : 데이터 인출 후 , 삭제 
		System.out.println("POP : " + stack.pop());
		System.out.println("Stack : " + stack);
		
		// 주의 : 비어있는 stack pop : EmptyStackException 
		while(!stack.empty()) { 		// stack 비어있지 않으면 : 실행 
			System.out.println("POP : " + stack.pop());
			System.out.println("Stack : " + stack);

		}
	}

}
