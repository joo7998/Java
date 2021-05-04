package com.javaex.basics.reftypes;

public class StringEx {

	public static void main(String[] args) {
		stringBasic();
		stringFormatEx();
	}

	private static void stringFormatEx() {
		// __의__중__먹었다. : 문자열 생성
		String food = "사과";
		int total = 10;
		int eat = 3;
		
		System.out.println(total + "개의 " + food + "중에서 " + eat + "개를 먹었다");
		
		// 형식화된 출력
		System.out.printf("%d개의 %s 중에서 %d개를 먹었다%n", total, food, eat);	
	
	
	// %d %f 등의 포맷문자에 부가정보 담기
    float rate = 1.234f;
    System.out.printf("현재 이자율은 %f%%입니다%n", rate);
    // 부가 정보로 소숫점 자리수 지정
    System.out.printf("현재 이자율은 %.2f%%입니다%n", rate);
    
}
	

	private static void stringBasic() {
		String str;
		str = "Java";
		String str2 = "Java";
		String str3 = new String("Java");
		
		System.out.println("str == str2 ? " + (str == str2));
		System.out.println("str == str3 ? " + (str == str3));
		//주소가 같은가? (주소값의 비교)
		
		System.out.println("str과 str2 내용 같은가? " + str.equals(str2));
		System.out.println("str과 str3 내용 같은가? " + str.equals(str3));
        //내용이 같은가? 
	}
}
