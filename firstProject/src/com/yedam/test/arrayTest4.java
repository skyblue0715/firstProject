package com.yedam.test;

import org.w3c.dom.css.Counter;

public class arrayTest4 {
	public static void main(String[] args) {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		// int sum=0;
		// double avg=0.0;
		int count = 0;
		int num = array.length;
		int textNum = array[0].length;
		int ii=0;
		int sum = 0;
		double avg = 0.0;// 평균\

		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array[i].length; j++) {
				sum = sum + array[i][j];
				ii++;
			}

		}
		
		System.out.println(array.length);
		

		System.out.println(sum);
		System.out.println("평균은 :" + (double)sum/ii);

	}
}
