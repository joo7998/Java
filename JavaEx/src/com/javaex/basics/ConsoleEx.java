package com.javaex.basics;

public class ConsoleEx {
	
import java.util.Scanner; //java.util package의 Scanner class 로드	
	
	public static void main(String[] args) {
		consoleOutputEx();
		consoleInputEx();

	}
    
	private static void consoleInputEx() {
		// Tip.1 : ctrl + shift + O 
		//     2 : ctrl + space (자동완) 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력해 주세");
		System.out.println("이름:");
		
		String name = scanner.next();
		
		System.out.print("나이:");
		
		int age = scanner.nextInt();
		
		System.out.println("당신의 이름은 " + name + "이고 " + age + "살입니다.");
		
		// 쓰고나면 닫아주기
		scanner.close();
		
		
	}

	private static void consoleOutputEx() {
		
		// print 메서드 : 출력후 개행 안함
		// println 메서드 : 출력 후 개행
		// printf 메서드 : 형식화된 출
        System.out.print("Hello ");		
        System.out.println("Java");
        
        // Escape 문자 
        System.out.println("Hello\nJava");
        System.out.println("Hello\tJava");
        
        System.out.println("Hello, \"Java\"");
        String dir = "C:\\Windows\\System"; 
        System.out.println(dir);
        
        System.err.println("표준 에러 출력!");
		
	}
}
