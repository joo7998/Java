package com.javaex.api.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		dateEx();

	}

	private static void dateEx() {
		// 날짜 얻어보기
		Date now = new Date();
		
		System.out.println(now);
		
		// 형식화 출력 : DateFormat 객체 
		// FULL, LONG, MEDIU,, SHORT 
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("Full : " + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("Medium : " + df.format(now));
		
		// SimpleDateFormat : format 문자열 이용, 자유롭게 날짜 포맷
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss");
		System.out.println("SDF : " + sdf.format(now));
		
	}

}
