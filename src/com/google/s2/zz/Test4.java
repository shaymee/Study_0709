package com.google.s2.zz;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("====Test4 Start====");
		
		String name = "iu";
		System.out.println(name);
		
		int num = 3;		
		
		name = name + num;
		// name + num // +가 연결연산자로써 작동, String 타입이 됨
		System.out.println("Name : " + name);
	}

}
