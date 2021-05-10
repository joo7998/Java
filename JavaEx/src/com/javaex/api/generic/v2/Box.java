package com.javaex.api.generic.v2;

// v2.
// Generic 이용, 설계시 - 데이터 타입 결정 x, instance 화 할때 외부에서 타입을 지정 
// type 문자 : T(Type) R(Return) K(Key) V(Values) -> 가급적 관례 지키

public class Box<T> {
	T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	} 
	
	

}
