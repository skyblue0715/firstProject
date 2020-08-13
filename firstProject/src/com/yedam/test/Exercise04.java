package com.yedam.test;

public class Exercise04 {
	public static void main(String[] args) {
		int dice1 = 0;
		int dice2 = 0;
		boolean run = true;

		// System.out.println(dice1);

		while (run) {

			{
				dice1 = (int) (Math.random() * 6) + 1;
				dice2 = (int) (Math.random() * 6) + 1;
				System.out.println("(" + dice1 + "," + dice2 + ")");
				
				if (dice1 + dice2 == 5) {
					// System.out.println("(" + dice1 + "," + dice2 + ")");
					run=false;
				}else run=true;
			}

		}

	}

}
