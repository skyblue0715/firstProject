package com.yedam.dev;

public class OperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val1=10;
		int result= 3 + (8 - 5) * 4+val1++;// <<<<<-----방향으로 계산됨 *  + -
		System.out.println(result);
		
		
		//나머지계산
		result=10 %7;
		System.out.println("나머지 계산 : "+result);
		//나누기
		result=10 / 7;
		System.out.println("나누기 계산 : "+result);
		
		double r1=10/7.0;
		System.out.println("나누기 계산 : "+r1); //실수 = 정수 /실수 
		for(int i=1;i<=10;i++) {
			if(i%2==1) {
				System.out.println(i +"홀수입니다.");
			}else
				System.out.println(i +"짝수입니다.");
		}
		
	}

}
