package com.yedam.dev;

public class OverflowExample {

	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		// -2147483648
		int result = safeAdd(-2147483647, -10);
		System.out.println(result);
	}

	public static int safeAdd(int a, int b) {
		int sum = 0;
		if (Integer.MAX_VALUE - b < a) {
			System.out.println("유효값이 아닙니다1");
			sum = 0;
		}else if(Integer.MIN_VALUE - b > a)  {
			System.out.println("유효값이 아닙니다2");
			sum = 0;
		}
		else 
			sum=a+b;

			return sum;
	}
}
