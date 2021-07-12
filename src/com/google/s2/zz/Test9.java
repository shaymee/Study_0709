package com.google.s2.zz;

public class Test9 {

	public static void main(String[] args) {
		System.out.println("====Test9 start====");
	// 나머지 연산자를 활용한 풀이
		/*
		double num = 10.2;
		double num2 = 3.3;
		double result1 = num / num2;
		double result2 = num % num2;
		
		System.out.println("몫:"+result1);
		System.out.println("나머지:"+result2);
		*/
		
		
		int price;
		int money;
		int change;
		
		price = 35810;
		money = 89540;
		change = money - price; // 
		
		int man;    //만원짜리 갯수를 담을 변수
		int cheon; //천원짜리 갯수를 담을 변수
		int baek; //백원짜리 갯수를 담을 변수
		int sip; //십원짜리 갯수를 담을 변수

		man = (change/10000);
		cheon = (change%10000)/1000;
		baek = (change%1000)/100;
		sip = (change%100)/10;
		
		System.out.println(change);
		System.out.println(man);
		System.out.println(cheon);
		System.out.println(baek);
		System.out.println(sip);
		
		//refactory 완성된 코드를 다시 한번 보면서 불필요한걸 걷어내는 행위. 약간 복기 ?
		
	}

}
