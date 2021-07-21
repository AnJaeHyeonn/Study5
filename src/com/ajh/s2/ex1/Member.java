package com.ajh.s2.ex1;

public class Member {

	private String id;
	private int age;
	private int muge;
	private int ki;

	// 외부 데이터를 멤버변수에 대입
	// 데이터를 입력하는 메서드는 set멤버변수명으로 설정
	// setter
	public void setAge(int age) {

		if (age > 0 && age < 150) {
			this.age = age;
		} else {
			this.age = 20;
		}

	}

	public void setId(String id) {
		this.id = id;
	}

	public void setMuge(int muge) {
		this.muge = muge;
	}

	public void setKi(int ki) {
		this.ki = ki;
	}

	// 멤버변수를 외부로 보낼 때
	// 데이터를 외부로 내보내는 메서드는 get멤버변수명으로 설정
	// getter
	public int getAge() {
		return this.age;
	}

	public String getId() {
		return this.id;
	}

	public int getMuge() {
		return this.muge;
	}

	public int getKi() {
		return this.ki;
	}

	public void info() {
		System.out.println("ID : " + id);
		System.out.println("Age : " + age);
		System.out.println("Muge : " + muge);
		System.out.println("Ki : " + ki);
		test();
	}

	private void test() {

	}

}
