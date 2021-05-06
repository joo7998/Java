package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		// 자식 타입의 객체 - 부모 타입 클래스로 참조
		Dog dog1 = new Dog("Snoopy");
		
		dog1.eat();
		dog1.walk();
		dog1.bark();
		
		// 자식 객체를 부모 타입으로 참조 : UpCasting
		Animal dog2 = new Dog("Coco");
		dog2.eat();
		dog2.walk();
//		dog2.bark();  // animal 설계도에 없어 : 실행 불가
		
		// 원래대로 돌려놓기 : DownCasting
		((Dog)dog2).bark();
		
		Animal pet = new Dog("Peanut");
		pet.eat();
		pet.walk();
		
		pet = new Cat("Cashewnut");
		pet.eat();
		pet.walk();
		
		// DownCasting 실제 객체 확인 필요 
		// Instanceof 연산자 활용 
		if (pet instanceof Dog) {  // pet이 Dog 클래스 instance?
		     ((Dog)pet).bark();
		} else if (pet instanceof Cat) {  
			((Cat)pet).meow();
		}

	}

}
