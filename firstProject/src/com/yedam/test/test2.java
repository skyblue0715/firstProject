package com.yedam.test;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue=10;
		char charValue='A';
		double doubleValue=5.7;
		String strValue="A";
		
		double var =(double)intValue;
		System.out.println(var);
		
		byte var1=(byte)intValue;
		System.out.println(var1);
		
		int var11= (int)doubleValue;
		System.out.println(var11);
		
		//char var111 = (char)strValue;
		char var111 = strValue.charAt(0);
		System.out.println(var111);
	}

}
