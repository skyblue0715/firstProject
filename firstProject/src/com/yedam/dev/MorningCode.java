package com.yedam.dev;

public class MorningCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 ="Hello";
		String str2 ="World";
		System.out.println(str1+", "+str2);
		
		int v1 = 150, v2= 270;
		int result = add(v1,v2);
		add(v1,v2); System.out.println("결과값으뇨  "+result);
		introduce("김수한무두루미삼천갑자동방삭");
	}
		
	public static int add(int x , int y) {
			int sum=x+y;
			return sum;
		}
		public static void introduce(String name) {
			System.out.println("안녕하세요,저는 "+name);
		}
		
}
