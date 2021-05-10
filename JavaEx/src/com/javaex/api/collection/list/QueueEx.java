package com.javaex.api.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	// input , output : 출력 방향 반대 
	// First Input First Output (FIFO)
	

	public static void main(String[] args) {
		// 실체 클래스가 없다 
		Queue<Integer> queue = new LinkedList<>();
		
		for (int i = 1; i <= 10; i++) {
			queue.offer(i);
			System.out.println("OFFER : " + queue.peek());
		}
		System.out.println("PEEK : " + queue.peek());
		System.out.println("QUEUE : " + queue);
		
		while(!queue.isEmpty()) {
			System.out.println("POLL : " + queue.poll()); // 인출 후 삭제 
			System.out.println("QUEUE : " + queue);
		}

	}

}
