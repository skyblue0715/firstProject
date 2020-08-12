package com.yedam.cond;

public class SwitchExample {

	public static void main(String[] args) {
		double m = (int) (Math.random() * 6) + 1;

		System.out.println(m);
		
		switch ((int)m) {
		case 1:
			System.out.println("1번이요");
			break;
		case 2:
			System.out.println("2번이요");
			break;
		case 3:
			System.out.println("3번이요");
			break;
		case 4: 
			System.out.println("4번이요");
			break;
		case 5: 
			System.out.println("5번이요");
			break;
		case 6: 
			System.out.println("6번이요");
			break;
		}
	}

}
