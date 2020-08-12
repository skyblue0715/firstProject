package com.yedam.dev;

public class InfinityExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		double y = 0.0;

		double z = x % y;
		if(Double.isInfinite(z)||Double.isNaN(z)) {
			System.out.println("의미없는값이에용");
		}else 
			System.out.println(z);
		Double.isNaN(z);
		
		
			
	}
		
	
}
