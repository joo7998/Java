package com.javaex.basics;

public class ConsoleEx {

	public static void main(String[] args) {
		consoleOutputEx();

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
