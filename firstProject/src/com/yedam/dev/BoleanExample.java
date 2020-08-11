package com.yedam.dev;

public class BoleanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			long l1=10L;
			int i1=10;
			
			boolean trueOrFalse= false;
			trueOrFalse=l1!=i1;
			
			if(!trueOrFalse) {
				System.out.println("이 내용이 참일 경우에 출력됩니다.");
			}
			if(l1>i1) {
				System.out.println("왼쪽이 크거나 같습니다");
			}else
				System.out.println("");
			System.out.println(trueOrFalse);
	}

}
