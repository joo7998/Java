package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
//		stringBasic();
//		usefulMethods();
		stringBufferEx();

	}
	// 문자열 객체 : 연결,  method 수행시 매번 새 String 반환
	// StringBuffer : buffer 기반 작동 (메모리 효율에 더 좋다) 
	private static void stringBufferEx() {
		StringBuffer sb = new StringBuffer("This");
		
		// 추가 
		sb.append(" is pencil");
		// 삽입 
		sb.insert(8, "my");
		
		sb.replace(8, 10, "your ");
	
		System.out.println(sb);
		
		// buffer size 변경 (나머지 없어짐)
		sb.setLength(10);
		System.out.println(sb);
		
		//StringBuffer의 method들 연속 호출 : method chaining
		StringBuffer sb2 = new StringBuffer("This")
				.append(" is pencil")
				.insert(8,  "my")
				.replace(8, 10, "your ");
		String s = sb2.toString();  
		System.out.println("결과: " + s);
		
	}

	private static void stringBasic() {
		String s1 = "Java"; // 리터럴
		String s2 = new String("Java"); // new 
		String s3 = "Java"; // 리터럴
		
		System.out.println("s1 == s2 ? " + (s1 == s2));
		System.out.println("s1 == s3 ? " + (s1 == s3));
		// literal은 str pool 에서 관리 : 주소가 같으면 -> 같은 str 객체 
		
		// valueOf() method : 기본 타입 -> 문자열로 리턴
		String s4 = String.valueOf(Math.PI);
		System.out.println("ValueOf 메서드: " + s4);
	}
	
	private static void usefulMethods() {
		String str = "Java Programming JavaScript Programming";
		
		// 길이를 잡을 수 있고, 인덱스 접근 가능
		System.out.println("Length: " + str.length());
		System.out.println("5번 인덱스의 글자: " + str.charAt(5));
		
		// 변환 method 
		System.out.println("소문자로: " + str.toLowerCase());
		System.out.println("대문자로: " + str.toUpperCase());
		
		// 검색 관련 (중요!) 
		int idx;
		idx = str.indexOf("Java");
		System.out.println("1번째 검색: " + idx);
		idx = str.indexOf("Java", idx + 4);
		System.out.println("2번째 검색: " + idx);
		idx = str.indexOf("Java", idx + 4);
		System.out.println("3번째 검색: " + idx);  // 검색어가 없을 때 : -1
		// 역방향 검색 
		System.out.println("역방향 검색: " + str.lastIndexOf("Java"));
		
		// 문자열 추출 
		System.out.println("substring: " + str.substring(5)); // 끝까지  
		System.out.println("substring: " + str.substring(5, 16)); // 5~16 -1까지 
		
		// 치환 
		System.out.println("replace: " + str.replaceAll("Java", "java"));
		
		// 공백문자 제거
		String s2 = "        Hello 			";
		String s3 = "      , Java 		";
		
		System.out.println(s2.trim() + s3.trim());
		
		// 분할: split 
		String[] chunks = str.split(" "); // 공백을 기분으로 문자열 분할 
		for (String chunk: chunks) {
			System.out.println("WORD: " + chunk);	
		}
		
		// 문자열 비교 : Unicode 비교 
		// 같으면 0, 앞의 것이 작으면 음수, 앞의 것이 크면 양수 (sort) 
		System.out.println("ABC".compareTo("ABD"));
	}

}
