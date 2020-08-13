package com.yedam.test;

import java.util.Scanner;

public class arrayTest5 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("___________________________________");
			System.out.println("1.학생수 |2.점수입력|3.점수리스트|4.점수|5.종료");
			System.out.println("------------------------------------");

			int selectNO = scanner.nextInt();

			if (selectNO == 1) {
				//
			} else if (selectNO == 2) {

			} else if (selectNO == 3) {
				//
			} else if (selectNO == 4) {

			} else if (selectNO == 5) {
					run=false;
			}
				System.out.println("프로그램 종료");
		}

	}
}
