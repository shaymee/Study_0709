package com.google.s2.zz;

public class Test6 {

	public static void main(String[] args) {
		System.out.println("====Test6 start====");

		// 5 int
		// 3.12 double
		// 5 + 3.12 double. 서로 다른 데이터타입끼리는 연산 불가(작은게 큰걸로 자동형변환)
		int num=5;
		double num2= 3.12;
	// Qus) num=num+num2; // 이걸 num2가 아닌 num에 담으려하면 error가 뜸
	//	num=num+(int)num2; // answer1) num2를 int로 강제형변환
		num=(int)(num+num2); // answer2) (num+num2)를 int로 강제형변환
		System.out.println("Num : " + num); // 결과물은 8이 나와야 함
		
		// 국.영.수 점수 : 0 ~ 100(int type)
		int kor = 63;
		int eng = 35;
		int math = 53;
	    int total = kor + eng + math;
		// Qus1) 총점을 계산해서 총점을 출력하라
		System.out.println("Total : " + total);
		
		// Qus2)평균을 계산해서 출력해주세요
		//	double avg = total / 3; -> 소수점이 안나옴
		double avg = (double)total / 3; // 순서가 중요함. 
	// 일단 우항이 먼저 계산된 뒤 좌항으로 대입되어야 하기에 우선 우항의 total이 50.333..이 되어있어야함
	// 우항의 total or 3 중 한군데만 (double)로 돼있으면 됨. 둘다 돼있어도 됨.
	// 혹은, 3이 그냥 3.0으로 double type을 만들어 버리면 아주 간단히 해결됨.		
		System.out.println("Average : " + avg);
	// 코드는 정석이 없으니까 다른 사람 코드도 참고하는게 좋음
		
		double num3 = 5.124;
		int result = (int)num3;
		System.out.println(result);
		// double 타입을 int 타입으로 형변환하면 숫자 상관없이 정수부만 남기고 소수점 버림
		
		
	}

}
