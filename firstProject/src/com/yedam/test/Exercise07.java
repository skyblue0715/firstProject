package com.yedam.test;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;
		int ye = 0;
		int intput=0;
		
		Scanner sc = new Scanner(System.in);
		int input=0;
		while (run) {
			System.out.println("____________________________ ");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("____________________________ ");
			System.out.print("선택> ");
			int menu = sc.nextInt();
			if(menu==1) {
				
				System.out.print("예금 금액을 입력해주세요> ");
				input=sc.nextInt();
				balance=balance+input;
				
			}else if(menu==2) {
				
				System.out.println("출금 금액을 입력해주세요> ");
				input=sc.nextInt();				
				balance=balance-input;
			}else if(menu==3) {
				System.out.println("잔고선택");
				System.out.println("잔고 : "+balance);
			}else if(menu == 4) {
				run = false;
			}//end of while
			System.out.println("종료");
		}//end of main
	}// end of class

}
