package com.yedam.ref;

public class ArrayExample {

	public static void main(String[] args) {
		int score1 = 10, score2 = 20, score3 = 30, score4 = 40;
		int sum = 0;

		int[] intAry = { 10, 20, 30, 40 };
		sum = intAry[0] + intAry[1] + intAry[2] + intAry[3];
		intAry[1] = 50;

		for (int i = 0; i < 4; i++) {
			System.out.println(intAry[i]);
			sum = sum + intAry[i];
		}
		System.out.println("sum : " + sum);
		String[] sAry = { "hello", "world", "nice", "good" };
		for (int i = 0; i < sAry.length; i++) {
			System.out.println(sAry[i]);
			System.out.println(" ");
		}
		String[] scoreAry = new String[5];
		for (int i = 0; i < scoreAry.length; i++) {
			System.out.println(scoreAry[i]);
		}
		scoreAry[0] = "one";
		scoreAry[1] = "two";
		scoreAry[2] = "three";
		for (int i = 0; i < scoreAry.length; i++) {
			System.out.println(scoreAry[i]);
		}
		int[] mathAry;
		mathAry = new int[] { 1, 2, 3, 4 };
	}

}
