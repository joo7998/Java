package com.javaex.basics.reftypes;

public class ArrayEx {

	public static void main(String[] args) {
//		arrayBasic();
//		multiDimArray();
//		arrayCopyFor();
		arrayCopySystem();
		
	}

	private static void arrayCopySystem() {
		int source[] = {1, 2, 3}; 
		int target[] = new int[10];
		
		System.arraycopy(source, 0, target, 3, source.length);
		
		for(int i = 0; i < target.length; i ++ ) {
			System.out.print(target[i] + "\t");
		}
		System.out.println();
		
		// Enchanced for loop : 값 추출
		for (int value: target) {
			System.out.print(value + "\t");
		}
		System.out.println();
	}

	private static void arrayCopyFor() {
		// 배열 은 크기 변경 x : 새 배열 생성, 복사해야
		int source[] = {1, 2, 3};
		int target[] = new int[10];
		
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i]; // 복
		}
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i] + "\t");
		}
	}

	private static void multiDimArray() {
		// new type [행/세로][열/가로]
		// new type [면] [행] [열]
		int [][] twoDimen = new int[5][10];
		
		int table[][] = {
				{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, 
				{2, 3, 4, 5, 6, 7, 8, 9, 0, 1},
				{3, 4, 5, 6, 7, 8, 9 ,0, 1, 2},
				{4, 5 ,6 ,7, 8, 9, 0, 1, 2, 3},
				{5, 6, 7, 8 ,9 ,0 ,1, 2, 3, 4}
		};
		
		// 배열 내부 모든 값 합산? 
		int total = 0;
		
		System.out.println("table 배열의 행수:" + table.length);
		for (int row = 0; row < table.length; row++) {
			for (int col = 0; col < table[row].length; col++) {
				System.out.print(table[row][col] + "\t");
				total += table[row][col];
			}
			System.out.println();
		}
		System.out.println("총계:" + total);
	}

	private static void arrayBasic() {
		String[] names; 
		int scores[];
		
		names = new String[] {
				"홍길동",
				"장갈산",
				"전우치",
				"임꺽정",
		};
		
		scores = new int[4];
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 88;
//		scores[4] = 100;  // 인덱스 범위 벗어난 접근 = 에러
		
		float heights[] = {
				175.3f,
				178.2f,
				165.3f,
				188
		};
		
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%s (%.2f) : score = %d%n", names[i], heights[i], scores[i]);
		}
		
		// 주의 
		int scores2[] = scores; // 참조 복사 유의
		System.out.println("scores ==scores2: " + (scores == scores2));
		// 같은 주소
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + "\t");
		}
		System.out.println();
		// scores 2 변경
	    scores2[2] = 100;
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + "\t");
	}
		
		
		
}

}


	
	