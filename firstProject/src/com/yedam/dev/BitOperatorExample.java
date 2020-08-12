package com.yedam.dev;

public class BitOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1=10;
		int v2=~v1;
		
		System.out.println("v1 : "+ v1);
		System.out.println("v2 : " + v2);
		
		byte b1= 10;
		byte b2=4;
		int b3 = b1 % b2;//+,-,%,/,* 연산자는 기본적으로 int로 변환해서 시작함
	
		int result = 10/4; //2.5
		
		System.out.println(result);
	}

}
