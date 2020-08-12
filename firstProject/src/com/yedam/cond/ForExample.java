package com.yedam.cond;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		int sum = 0;
	
		sum += 1;
		sum += 1;
		sum += 1;
		System.out.println("결과는 ?" + sum);

		sum = 0;

		for (int i = 0; i < 3; i++) {
			sum += 1;

		}
		sum += 1;
		System.out.println(sum);
		sum = 0;
		for (int i = 3; i > 0; i--) {
			sum += 1;
		}
		System.out.println(sum);
		for (int i = 1; i <= 9; i++) {
			sum = sum + i;

		}
		System.out.println("1~10까지 합 : " + sum);
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			for (int a = 1; a <= 9; a++) {
				Scanner sc= new Scanner(System.in);
				String value = sc.next();
				System.out.println(i + "*" +a + "="+(i*a));

			}
		}
	}

}
