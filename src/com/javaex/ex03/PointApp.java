package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {
		// equals 예제
		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = new Point(100, 139);
		
		Point d = c;
				
		System.out.println(a==b); // 주소값이 같나요? 다르다
		System.out.println(d==c); // 주소값이 같나요? 같다
		
		System.out.println("===================");
		System.out.println(a.equals(b)); 
		// 객체가 같나요? 기본적으론 다르다, 하지만 메소드 오버라이딩을 이용해서
		// 이부분을 수정하면 true가 나오도록 할 수 있다.
		
		
		

	}

}
