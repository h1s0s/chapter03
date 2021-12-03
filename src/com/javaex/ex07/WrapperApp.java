package com.javaex.ex07;

public class WrapperApp {

	public static void main(String[] args) {
		//Wrapper 클래스
		//기본자료형에는 Wrapper라는 클래스형이 존재한다.
		//Wrapper 클래스형을 이용하면 기본자료형을 객체형으로 다룰 수 있게된다.
		int no= 10;
		Integer i = new Integer(10);
		short s = new Short((short)3);
		Byte b = new Byte((byte)3); //자료형 안쓰면 오류남.. 왜지?
		
		System.out.println(no);
		System.out.println(i);
		System.out.println(s);
		System.out.println(b);
		
		int num01 = 10;
		int num02 = 7;
		int intResult = num01 + num02;
		System.out.println(intResult);
		
		Integer i01 = new Integer(10);
		Integer i02 = new Integer(7);
		Integer result = i01 + i02;
		int result2 = i01 + i02;//언박싱
		Integer result3 = num01+num02;//박싱 
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		//박싱, 언박싱
		//기본 데이터타입을 Wrapper 타입으로 바꾸는것을 박싱
		//반대는 언박싱이라고 한다.
		//이경우 형변환이 아닌 서로에 담아지게 될경우 프로그램 자체에서 자동으로 변형(박싱or언박싱)이 일어난다.
		System.out.println("=============================================");
		
		//문자열(숫자형태) --> int, parselnt(String str) => 값을 숫자로 바꿔주는 메소드
		/*
		Integer i05 = 10;
		int r01 = i05.parseInt("12345");
		System.out.println(r01);
		*/
		//잘못쓴 예
		
		int r01 = Integer.parseInt("12345");
		System.out.println(r01);
		
		//int --> 문자열
		String snum = String.valueOf(555);
		System.out.println(snum);
		//더 쉬운 방법
		String r100 = "안녕"+1234;//int인 1234가 String 타입으로 담김.
		System.out.println(r100);
	}

}
