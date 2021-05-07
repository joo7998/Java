package com.javaex.api.objectclass.v2;


// v3
// 객체의 복제 
// thin clone : 단순히 필드 값을 복제 
// 				기본 타입의 필드는 문제 X 
// clone method 사용 위해서는 : Cloneable interface 구현 해야 
public class Point implements Cloneable {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point getClone() {
		Point clone = null; 
		
		try {
			clone = (Point)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone; 	// 복제본 반
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
