package com.ruby.java.ch06;

public class Member_1 {
	private String name;
	private int age;

	public Member_1() {
		this.name = "guest";
		this.age = 11;
	} //생성자 함수 

	public void setName(String name) {
		this.name = name;
		this.age = age;
	}
	public void show() {
		System.out.println("name =" +"name"+"age");
	}
	public static void main(String[] args) {
		System.out.println("main() 메서드 실행 : ");
	Member_1 m1 = new Member_1();
	Member_1 m2 = new Member_1();
	m1.show();
	
	
	
	
	}
}
