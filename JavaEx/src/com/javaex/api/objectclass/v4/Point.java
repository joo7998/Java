package com.javaex.api.objectclass.v4;


// v2
// 두 객체 값의 비교 : equals (method) 정의 
public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	// 객체의 정보를 문자열로 반환
	// print 계열의 method 로 출력할때 
	// 문자열과 객체를 연결할 때 호출 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Point(%d, %d)", x, y);
	}


	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			// obj casting 
		    Point other = (Point)obj;
		    return x == other.x && y ==other.y; 
		    
		}
		return super.equals(obj);
	}

	
}
