package com.yedam.cond;

public class WhileExample {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;

		/* while(i<10) { System.out.println(i); i++; } */

		/*
		 * while (i < 11) { sum = sum + i; i++; System.out.println("1~ " + i + "까지 합: "
		 * + sum); }
		 */

		int dan = 1;

		int num;
		while (dan < 10) {

			num = 1;
			while (num < 10) {
				System.out.println(dan + "*" + num + "=" + (dan * num));
				num++;
			}
			dan++;
		}

	}
}
