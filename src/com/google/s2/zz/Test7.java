package com.google.s2.zz;

public class Test7 {

	public static void main(String[] args) {
		System.out.println("====Test7 start====");
		int kor = 56; 
		int eng = 65;
		int math = 49;
		int total = kor + eng + math; 
		double avg = total / 3.0;
		
		System.out.println("Total : " + total); // 170
	//	System.out.println("Avg : " + avg); // 56.6666666..4
		
		avg = avg*100;
		System.out.println(avg); // avg를 강제로 int로 바꿔버리면 됨
		int result = (int)avg;
		System.out.println("result:"+ result);
		avg = result/100.0; // 100.0 으로 표현해서 double을 만들어야 함

		
		kor = 100;
	//	total = kor + eng + math; // 한번 실행이 끝난 코드는 없다. 프로그램은 위에서 아래로 순서대로
		System.out.println("Total :"+total); // kor 56 -> 100이 되도 total 바꾸라고 안했으니 원래대로
		System.out.println("Avg : " + avg); // 56.66
		
		
	}

}
