package com.javaex.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
//		Shape s = new Shape();	//	추상 클래스는 인스턴스화 불가
		
		Shape r = new Rectangle(10, 20, 100, 50);
		Shape c = new Circle(30, 40, 30);
		
		if (r instanceof Drawable) {
			((Drawable)r).draw();
		}
		
		if (c instanceof Drawable) {
		    ((Drawable)r).draw();
		}
		
		// 그림판에서 그리기 객체를 관리 
		Drawable d1 = (Drawable)r;
		Drawable d2 = (Drawable)c;
		
		// Interface type 으로 해당 interface 를 구현한 instance를참조할수있다
		Drawable objs[] = {
				d1, 
				d2,
				new Point(10,20)
		};
		
		for (Drawable obj: objs) {
			obj.draw();
			
		}
	}

}