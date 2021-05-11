package com.javaex.api.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableEx {

	public static void main(String[] args) {
		// 생성 : Map Interface 
		Map<String, ClassRoom> map = new Hashtable<>(); // key 로 String 사용 , 값 ClassRoom
		
		// 데이터 담기 : put 
		map.put("101", new ClassRoom("Java", "R101"));
		map.put("202", new ClassRoom("C", "R202"));
		map.put("303", new ClassRoom("Python", "R303"));
		map.put("404", new ClassRoom("Linux", "R404"));
		
		// key : 순서 X , 중복 될 수 X
		System.out.println(map);
		
		// value 변경  
		map.put("404", new ClassRoom("SQL", "R404"));  // Linux 지우고, SQL 넣는
		System.out.println(map);
		
		// key 에 연결된 value 가져오기 : get
		System.out.println("303: " + map.get("303"));
		
		// containsKey (key 있는지) -> T/F
		System.out.println("303 이 있나 : " + map.containsKey("303"));
		System.out.println("505 가 있나 : " + map.containsKey("505"));
		
		// value 중 subject가 Java 인 값 있는가 : containsValue
		System.out.println("Java 가 값에 있나 : " + map.containsValue("Java"));
		
		// iterator 
		Iterator<String> it = map.keySet().iterator();  	// 키의 반복자 
		while(it.hasNext()) {
			String key = it.next();  	// key 추출 
			System.out.println(map.get(key));
		}
		
		// map 비우기 
		map.clear();
		System.out.println(map);
		

	}

}
