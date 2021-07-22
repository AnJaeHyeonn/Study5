package com.ajh.s2.ex1;

public class Member {

	private String id;
	private int age;
	private int muge;
	private int ki;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMuge() {
		return muge;
	}
	public void setMuge(int muge) {
		this.muge = muge;
	}
	public int getKi() {
		return ki;
	}
	public void setKi(int ki) {
		this.ki = ki;
	}

	// 외부 데이터를 멤버변수에 대입
	// 데이터를 입력하는 메서드는 set멤버변수명으로 설정
	// setter

	// 멤버변수를 외부로 보낼 때
	// 데이터를 외부로 내보내는 메서드는 get멤버변수명으로 설정
	// getter

}
