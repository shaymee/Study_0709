package com.google.s2.zz;

public class Test1 {
	// 프로그램을 시작하려면 main 메서드 필요함
	public static void main(String[] args) {
		System.out.println("On my way");
		System.out.println("Very good");
		
		// 정수 형태 값을 대입
		// 변수 선언 // 데이터타입 변수명;
		int num;
		// 초기화
		num = 100; // 여기서 =는 대입연산자
		
		// 변수 선언과 초기화
		long num2 = 100;
		
		// 1.123 (실수형)
		float num3;  // float 타입은 값 뒤에 F(or f)를 넣어야 함
		num3 = 1.123f;
		
		double num4 = 1.123;
		
		System.out.println("num : " + num);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		
		// char 문자 한글자
		// 한글, 문자를 집어넣을 땐 앞뒤로 홑따옴표로 감싸야 함
		char ch = 'a';
		char ch2 = '한';
		char ch3 = '1';
		
		System.out.println("ch : " + ch);
		System.out.println("ch2 : " + ch2);
		System.out.println("ch3 : " + ch3);
		
		// 논리형 , true or false 값이 정해져있고 둘 중 하나만 들어감
		
		boolean flag = true;
		boolean flag2 = false;
		
		System.out.println(flag);
		System.out.println(flag2);
		//
		flag = num>100;
		flag2 = num2>98;
		
		System.out.println("flag : " + flag);
		System.out.println("flag2 : " + flag2);
		
	}

}
