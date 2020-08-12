package com.yedam.test;

public class Example04 {

	public static void main(String[] args) {
		int value = 356;

		System.out.println(floorValue(356));

	}public static int floorValue(int a)

	{
		a=356;
		int floorValue =(int) Math.floor(a/100)*100;
		return floorValue;
	}
}
