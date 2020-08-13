package com.yedam.test;

public class arrytest3 {

	public static void main(String[] args) {
		int max = 0;
		int min = 0;
		int[] array = { 1, 5, 8, 4, 2 };

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {

				max = array[i];

			}
			

		}
		System.out.println("max : " + max);
		//System.out.println("min : " + min);
	}// end of main;

}
