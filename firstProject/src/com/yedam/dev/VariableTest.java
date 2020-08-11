package com.yedam.dev;

public class VariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b= 0;
		int sum = 0;
			for(int i=0;i<10;i++) {
				b= b+1;
				sum=b+sum;
				System.out.println("sum = "+sum+", b = "+ b);
			}
			System.out.println(sum);
	}
		

}
