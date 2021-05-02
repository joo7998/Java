// this is test

package com.javaex.basics;

// 기본 타입 예
// this is also test

public class Types {
	
	public static void main(String[] args) {
		integerTypes();
		floatTypes();
		booleanEx();	
		charEx();
	}
	
	// 상수 예제
	// 이유 1.변경되면 아되는 값을 보호할 떄 
	// 이유 2. 코드 가독성이 높아진다

	private static void integerTypes() {
		// TODO Auto-generated method stub
		
	}

	private static void constantEx() {
		float PI = 3.14159F;
		final int SPEED_LIMIT = 110;   // 상수 생성 - final
		
		System.out.println("PI" + PI);
		System.out.println("SPEED_LIMIT:" + SPEED_LIMIT);
		
		int speed = 105; 
		
		// 과속단속
		boolean overspeed = speed > SPEED_LIMIT; 
		
		System.out.println("과속 ? " + overspeed); 
		
		SPEED_LIMIT = 80;  // 고의로든 실수로든 변경되는 안되면 : 상수로 
		
		boolean overspeed1 = speed > SPEED_LIMIT; 
				
		System.out.println("과속 ? " + overspeed1); 
	}
	
	// char형 자료 예제 - 내부에 문자에 해당하는 부호 없는 정수 코드 저장(2byte)
	private static void charEx() {
		char ch1 = 'A';  //내부에는 65가 저
		char ch2 = '한';
				
        System.out.println(ch1);
        System.out.println(ch2);
        
        System.out.println(ch1 + ch2);
        
        // 문자열은 ""
        String str = "Java";
        System.out.println(str); 
	}
	
	// 논리형 자료 예제
	private static void booleanEx() {
		boolean b1 = true; 
		boolean b2 = false;
		
		System.out.println("b1 - > " + b1);
		System.out.println("b2 - > " + b2);
		
	// 비교 연산, 논리 연산의 결과를 담을 수 있는 자료형
		int var1 = 7;
		int var2 = 5;
		
		boolean result = var1 > var2; 
		
		System.out.println("7 > 5 ? " + result);
	}
	

	//실수형 예
    private static void floatTypes() {
	     float floatVar = 3.12345F;
	     double doubleVar = 3.12345;
	     
	     System.out.println("floatVar:" + floatVar);
	     System.out.println("doubleVar:" + doubleVar);
	     
	     
	     //지수 표기법 m * 10의 n승
	     int intVar = 3000000;
	     floatVar = 3E6F; // 3.0 * 10 ^ 6 
	     doubleVar = 3E-6; // 3 * 10 ^ -6
	     
	     //주의 : float, double - 정밀도 포기 표혀 범위 넓 - 오차 
	     System.out.println(0.1 * 3);
    }

    //정수형 예

	private static void main() {
    	int intVar1;
    	int intVar2;
    	intVar1 = 2021;
    	intVar2 = 1234501234;
    	
        System.out.println(intVar1);
        long longVar1;
        long longVar2;
        
        longVar1 = 2021;
        longVar2 = 12345678901234L;  //L 혹은 l - long임을 알려
        
        System.out.println("longVar1:" + longVar1);
        System.out.println("longVar2" + longVar2); 
        
        //2,8,16 진
        int bin = 0b1101; 
        int oct = 072;
        int hex = 0xFF; 
        
        System.out.println("ob1101 - >" + bin);
        System.out.println("072 - >" + oct);
        System.out.println("0xFF - >");

}
	
}



