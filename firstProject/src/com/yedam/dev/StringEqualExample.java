package com.yedam.dev;

public class StringEqualExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 20;
		int v2 = 30;
		if (v1 == v2) {
			System.out.println("기본타입 일 경우 비교");
		}

		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");

		if (str1 == str2) {
			System.out.println("같은 문자입니다.1==2");
		}

		if (str1.equals(str3)) {
			System.out.println("같은 문자 입니다.1==3");
		}

		System.out.println((1 == 1) && (2 == 3));

	}

}
