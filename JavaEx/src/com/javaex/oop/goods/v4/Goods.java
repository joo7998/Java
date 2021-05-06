package com.javaex.oop.goods.v4;

// v4 this : 객체 자신을 지칭
//    this() : 객체 자신의 다른 생성자를 지칭할때 사

public class Goods {
	// 필드
   private String name;
   private int price;
   

	//  생성자 
    public Goods(String name) {
    	this.name = name;
    }
    public Goods(String name, int price) {
    	// class 내부의 다른 생성자를 호출 시 : this()
    	this(name);
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