package com.javaex.ex04;

public class RectangleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle a = new Rectangle(6,4);
		Rectangle b = new Rectangle(6,4);
		Rectangle c = new Rectangle(12,2);
		
		System.out.println("==euals()값 비교");
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
	}

}
