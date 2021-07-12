package com.google.s2.zz;

public class Test8 {

	public static void main(String[] args) {
		System.out.println("====Test8 start====");
		
		//물건값의 합계를 담으려고 함. 25000원
		int price=300;
		//손님이 낸 돈을 담으려고 함. 30000원
		int money=400;
		//거스름돈을 담으려고 함. 5000원
		int change=100;
		
		// 단, 물건값의 합계보다 손님이 낸 돈이 더 많다고 가정
		/** Qus1)물건값의 합계, 손님이 낸 돈, 거스름돈을 각각 출력 */
		
		price = 35810;
		money = 89540;
		change = money - price; // 
		int man;    //만원짜리 갯수를 담을 변수
		int cheon; //천원짜리 갯수를 담을 변수
		int baek; //백원짜리 갯수를 담을 변수
		int sip; //십원짜리 갯수를 담을 변수
		
		/**Qus+) 만원 ??장
				천원 ??장
				백원 ??개
				십원 ??개 */
		
	//	int man1;
	//	int cheon1;
	//	int baek1;
	//	int sip1;
		
	//	man1=change-(cheon1+baek1+sip1);
	//	cheon1=change-(man1+baek1+sip1);
	//	baek1=change-(man1+cheon1+sip1);
	//	sip1=change-(man1+cheon1+baek1);
	
	 /** answer1) this method's used by me */	
		man = change/10000;
		cheon = (change-man*10000)/1000;
		baek = (change-man*10000-cheon*1000)/100;
		sip = (change-man*10000-cheon*1000-baek*100)/10;
		
	/** answer2) */	
	//	man = change/10000;
	//	cheon = change/1000 - man*10;
	//	baek = change/100 - man*100 - cheon*10;
	//	sip = change/10 - man*1000 - cheon*100 - baek*10;
		
	/** answer3) this method's used by teacher */
	//	man = change/10000;
	//	cheon = (change-(man*10000))/1000;
	//	baek = (change-(man*10000)-(cheon*1000))/100;
	//	sip = (change-(man*10000)-(cheon*1000)-(baek*100))/10;
	
		System.out.println("물건값:"+price);
		System.out.println("제시한 돈:"+money);
		System.out.println("거스름돈:"+change);
		
		System.out.println("만원권:"+man+"장");
		System.out.println("천원권:"+cheon+"장");
		System.out.println("백원:"+baek+"개");
		System.out.println("십원:"+sip+"개");
		
		/** teacher's advice: 정도는 없지만 다른 사람들이 짜놓은 코드를 계속 보면서 공부하는게 중요함! */
		
	}

}
