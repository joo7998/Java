package com.javaex.oop.goods.v3;

// v3. 생성자 : 객체를 instantify 할 때 초기화를 담당
//     return (x), class 명 과 같아

public class Goods {
	// 필드
   private String name;
   private int price;
   

	//  생성자 
    //  1. 사용자가 정의한 생성자 없 - 컴파일러가 기본 생성자 추가
    //  2. 사용자가 생성자 선언 - 컴파일러는 추가 안해
    public Goods(String name, int price) {
    	// 초기화 코드  
    	this.name = name;
    	this.price = price; 
    	
    }
   
   
    //	Getter
    //  Setter가 없을 경우 : 읽기 전
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	//	메서드
	public void showInfo() {
		System.out.println("상품명 : " + name);
		System.out.println("가격 : " + price);
	}

}