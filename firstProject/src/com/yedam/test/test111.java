package com.yedam.test;

import java.util.Scanner;

public class test111 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		
		
		
		System.out.print("첫번째 수를 입력하세요 :");
		int num1 = sc1.nextInt();
		System.out.println(num1);
		
		System.out.print("두번재 수를 입력하세요 :" );
		int num2 = sc2.nextInt();
		System.out.println(num2);

		System.out.print("3번째 수를 입력하세요 :");
		int num3 = sc3.nextInt();
		System.out.println(num3);
		  int a=Integer.compare(num1,num2);
		  int b=Integer.compare(num1,num3);
		  int c=Integer.compare(num2,num3);
		System.out.println(a + "," + b + "," + c);
		System.out.println("결과는 !");
		
		
		/*if (num1 > num2 && num1 < num3) {
			System.out.println(num3 + "," + num1 + "," + num2);
		} else if (num1 < num2 && num2 < num3) {
			System.out.println(num3 + "," + num2 + "," + num1);
		} else if (num1 > num2 && num2 > num3) {
			System.out.println(num1 + "," + num2 + "," + num3);
		}else if(num1<num3&&num2>num3) {
			System.out.println(num2 + "," + num3 + "," + num1);
		}else if(num1>num2&&num2<num3) {
			System.out.println(num1 + "," + num3 + "," + num2);
		}*/
			
	}
	
}
