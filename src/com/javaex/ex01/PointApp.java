package com.javaex.ex01;

public class PointApp {

	public static void main(String[] args) {

		Object obj = new Object();
	
		//getClass() 본인의 클래스 이름을 나타냅니다.
		System.out.println("#obj.getClass()");
		System.out.println(obj.getClass());		//본인의 클래스 이름을 나타냅니다.
		System.out.println("==============================");
		
		//hashCode()주소를 대신할 수 있는 숫자를 출력합니다.
		System.out.println("#obj.hashCode()");
		Object obj01 = new Object();
		Object obj02 = new Object();
		Object obj03 = new Object();
		
		System.out.println(obj01.hashCode());
		System.out.println(obj02.hashCode());
		System.out.println(obj03.hashCode());
		System.out.println("==============================");
		
		//toString() 객체의 정보를문자열로 리턴
		System.out.println("#obj.toString()");
		System.out.println(obj.toString());
		System.out.println("==============================");
	
		//equals() 객체가 같은지 비교. 괄호값과 같다면 true, 다르면 false를 나타냅니다.
		System.out.println("#obj.equals(obj)");
		System.out.println(obj01.equals(obj01));	//객체가 같은지?
		System.out.println(obj01.equals(obj02));
		System.out.println(obj01==obj01);			//주소가 같은지?
		
	}

}
