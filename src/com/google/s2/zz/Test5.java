package com.google.s2.zz;

public class Test5 {

	public static void main(String[] args) {
		System.out.println("==== Test5 start ====");
		int num = 5; // num 이라는 box를 만들었는데 거기에 5를 넣어 둠
					// int 4byte를 확보를 하고 메모리주소를 num이라고 하자(변수이자 주소)
		num=num+1; // 우측의 결과물을 왼쪽에 집어넣어라
	//	int num = 3; // 또 다른 box를 만들었는데 그게 num이랑 같은 박스임 
					// 에러 이름 -> 중복선언
	//	char ch='a';
		
			/// &&아래부터 형변환&&
			
			int num1 = 3;
			long num2 = 9L;
			
			System.out.println(num1);
			
	//		num1 = num2; // (x) 타입이 안맞아서 안들어감. 변수A =(대입연산자)  (변환할 데이터타입명 명시)변수B;
			
			num1 = (int)num2; // num2를 int 타입으로 변환, 강제 형변환
			System.out.println(num1);
			
			num1=3;
			
		//	num2 = (long)num1;
			num2 = num1; // 자동 형변환 int->long type
			System.out.println(num2);
			
			
			char ch = 'a';
			int num3 = ch; // int num3 = (int)ch; <--이렇게 써도 됨
			System.out.println("num3 : " + num3); // 아스키코드 문자1을 10진수로 바꾸면
			
			ch = (char)(num3+1); // 강제형변환
			System.out.println("ch : " + ch);
			// 얼마를 넣어야 z가 나올까?! 
			
			long num4 = 10L;
			float f1 = num4; // long 타입(우)을 float 타입(좌)으로 변환. 자동형변환
			// long : (이진수)숫자 1을 할 수 있는 경우의 수 -> 1
			// float :  " -> 더 많다 1.0, 1.00, 1.000, 1.0000, 1.00001 ....
			// 숫자를 표현하는 갯수가 누가 더 크냐? float이 long보다 표현 갯수 더 많다.
			// double이 float보다 크다.
			// 크기: double > float > long > int > short , char > byte
			// 얼마나 표현할 수 있는가?
			
	}

}
