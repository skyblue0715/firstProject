package com.yedam.ref;

public class ArrayCopyExample {

	public static void main(String[] args) {
		int[] origAry;
		origAry = new int[] { 3, 6, 9, 2, 4 };

		int[] cpyAry = new int[5];

		for (int i = 0; i < origAry.length; i++) {
			cpyAry[i] = origAry[i];
		}
		for (int i = 0; i < origAry.length; i++) {
			//System.out.println(cpyAry[i]);

		}
		System.arraycopy(origAry, 0, cpyAry,1,4);
		for(int i=0;i<origAry.length;i++) {
			System.out.println(cpyAry[i]);
		}
		//확장 for
		for(int num : cpyAry) {
			System.out.println(num);
		}
	}

}
