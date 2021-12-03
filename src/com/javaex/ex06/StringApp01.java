package com.javaex.ex06;

public class StringApp01 {

	public static void main(String[] args) {

		String str01 = new String("hi");
		String str02 = new String("hi");
		System.out.println(str01.equals(str02));
		System.out.println(str01.equals("hi"));
		
		System.out.println(str01 == str02); // 주소를 비교, 다르다
		System.out.println(str01.hashCode());
		System.out.println(str02.hashCode());
		Object x = str01.hashCode();
		Object y = str02.hashCode();
		System.out.println(x == y);
		
		System.out.println("----------------------------------약식형, 중요");
		String str03 = "hello";
		String str04 = "hello";
		System.out.println(str03.hashCode());
		System.out.println(str04.hashCode());
		System.out.println(str03 == str04); //주소를 비교, 같다.
		
		str04 = "hello!!!!";
		System.out.println(str03.hashCode());
		System.out.println(str04.hashCode());
		System.out.println(str03 == str04); //주소를 비교, 다르다
		
		System.out.println(str04);// 이게 나온다는건 str04에서 toString을 재정의 했다는 거임.
		

	}

}
