package com.ajh.s2.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		Member member = new Member();

		member.setAge(50);
		member.setId("ahn9801");
		member.setMuge(63);
		member.setKi(177);
		
//		member.info();
		
		int age = member.getAge();
		String id = member.getId();
		int muge = member.getMuge();
		int ki = member.getKi();
		
		System.out.println(age);
		System.out.println(id);
		System.out.println(muge);
		System.out.println(ki);
	}

}
