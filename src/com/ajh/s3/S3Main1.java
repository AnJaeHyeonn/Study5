package com.ajh.s3;

public class S3Main1 {
	public static void main(String[] args) {

		StaticTest.num = 2;

		System.out.println(StaticTest.num);

		StaticTest.staticMethod();

		StaticTest staticTest = new StaticTest();
		System.out.println(staticTest.num2);
		System.out.println(staticTest.num);

		staticTest.num = 4000;
		System.out.println(staticTest.num);
		
		System.out.println(StaticTest.num);
	}

}
