package com.yedam.ref;

import java.util.Scanner;

public class AdvancedForExample {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int[] scores = new int[5];
		int sum = 0;
		int maxVal = 0;
		for (int i = 0; i < scores.length; i++) {
			System.out.println("점수를 입력하세요");
			scores[i] = scn.nextInt();
			if(maxVal<scores[i]) {
				maxVal=scores[i];
			}
		}
		double avg = 0;

	
		for (int score : scores) {
			sum = sum + score;

		}
		avg = (double) sum / scores.length;
		
							//Arrays.sort(array); // 배열 정렬
		System.out.println("합계점수 : " + sum + "평균 " + avg+"최대값"+maxVal);

	}

}
