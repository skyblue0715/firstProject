package com.yedam.test;

public class Exercise03 {

	public static void main(String[] args) {
		int third = 0;
		
		for(int i=0;i<100;i++) {
			if(i%3==0) {
				third+=third+i;
			}
			
			System.out.println(third);	
		}

	}

}
