package com.javaex.io.bytestream;

import java.io.File;

public class FileClassEx {
	static String rootPath = System.getProperty("user.dir") + "\files";

	public static void main(String[] args) {
		File root = new File(rootPath); 	// 파일 객체 생성 
		System.out.println(rootPath + ":" + root.exists());		// 파일 실제 존재 ?	 
		printInfo(root);	// 파일 정보 출력 
    }		
	
	private static void printInfo(File f) {
		System.out.println("------");
		
		if (f.isDirectory()) { 		// 파일 객체가 directory? 
			System.out.println("Directory : " + f.getName());
			File[] files = f.listFiles(); 	// 파일 목록 확인 
			for (File file: files) {
				if (file.isFile()) {
					System.out.printf("     f %s - %d%n", file.getName(), file.length());
				} else {	// directory 이면
					System.out.printf("     d %s%n", file.getName());
				}
			}	
		} else {
			System.out.println("File : " + f.getName());
		}
		
		System.out.println("------");		
	}

}
