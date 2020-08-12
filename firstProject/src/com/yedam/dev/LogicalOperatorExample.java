package com.yedam.dev;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A'; // 65\
		if (charCode >= 65 & charCode <= 90) {
			System.out.println("대문자이무니다");
		}

		int num1 = 10;
		int num2 = 20;
		if (num1++ < 10 || num2++ > 20) {
			System.out.println("참입니다");
		}
		System.out.println(num1 + ", " + num2);

		int a = 10, b = 11;
		int result = a | b;
		System.out.println("논리곲결과 : " + result);
		result = a << 2;
		System.out.println("비트이동결과 " + result);

		result = 30 << 3;
		System.out.println("비트이동결과 : " + result);

		result = 80;
		boolean pass = false;
		if (result >= 80) {
			pass=true;
		}else pass= false;

		pass= (result >= 80) ? true : false;// 80이상이면 ? true를하고 : 아니면 false 
		
	
	
	}
}
