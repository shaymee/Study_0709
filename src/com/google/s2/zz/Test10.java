package com.google.s2.zz;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		System.out.println("====Test10 start====");
		// 45891321467 주민번호를 암호화해서 집어넣어야함
		
		// 특정 숫자가 들어오면 암호화해서 이 순서를 바꿔버리는 것
		// 1     (암호화 연산식)->     1
		// 2     (암호화 연산식)->     2
		// 4     (암호화 연산식)->     10
		// 7     (암호화 연산식)->     13
		// 8     (암호화 연산식)->     20
		
		/** 숙제 
		int num=5; // 우측의 결과물을 좌측에 대입하세요.
		int result=0; // 우측의 결과물을 좌측에 대입하세요.
		result = (num/4)*10+(num%4); // 몫과 나머지에 무지해서 시간이 오래걸렸다. 7/9 18:03 해결.
		System.out.println("num: "+num);
		System.out.println("result: "+result);*/
		
		//Java의 경우, 필요할 때에 변수 선언 가능
		
		// 실행 중에 데이터 키보드로부터 입력 받을 방법, 준비
		Scanner sc = new Scanner(System.in); // new는 예약어(reserved word)
		
		int input=10;
		int output=0; 
		
		System.out.println("숫자를 입력하세요");
		input = sc.nextInt(); // nextInt() -> 함수 / 메서드
		output = input/4*10 + input%4;
		
		System.out.println("input: "+input);
		System.out.println("output: "+output);
		
		// Github 사용하기
		// NEW CODE +
		// Wow
	}

}
