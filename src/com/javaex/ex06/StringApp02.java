package com.javaex.ex06;

public class StringApp02 {

	public static void main(String[] args) {
		
		String a = " abcd";
		String b = ",efg ";
		
		System.out.println("# concat()=============");
		System.out.println(a.concat(b));// concat() : a+b = abcd,efg
		System.out.println(b.concat(a));// b+a = ,efg abcd
		System.out.println(a+b);
		
		a = a.concat(b);
		System.out.println(a);
		
		System.out.println("# trim()================");
		
		System.out.println("--"+a+"--");
		a = a.trim();// 맨 앞이나, 맨 뒤에있는 공백을 없애줌
		System.out.println("--"+a+"--");
		
		System.out.println("# replace()=============");
		a = a.replace("ab", "황일영");//"ab"라는 글자를 "황일영"으로 바꾸어라.
		System.out.println(a);
		
		System.out.println("# split()=============");
		
		String[] sArray = a.split(","); //입력한 문자열을 기준으로 배열을 만들어줌, 인덱스의 수는 문자열을 기준으로 알아서 만들어짐.
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		System.out.println("# substring()=============");
		String str = "Hello JAVA!";
		
		String r01 = str.substring(3);//3번방부터 출력해라
		System.out.println(r01);
		
		String r02 = str.substring(8);
		System.out.println(r02);
		
		String r03 = str.substring(3, 8);//3번방부터 8번방"전"까지 출력해라
		System.out.println(r03);
		//응용법
		//substring 주민등록번호 뒷번호 첫번째자리만 받아내서, 남자인지 여자인지 구분 가능
		//replace 전화번호를 입력받았을때 -를 없애는 방법
		//
	}

}
