package com.ruby.java.ch06;

public class Member {
	private String name;
	private int age;

	public Member() {
//		this.name = "guest";
//		this.age = 0;
		this(null);
	}

	public Member(String name) {
//		this.name = name;
//		this.age = 0;
		this(name, 0); // this(parameter ); -> 생성자 함수를 호출(중복코딩 방지)
	}

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
//	public void show() {
//		this("guest");
//	} => 생성자가 아니기 떄문에 this()문 사용 불가 , 생성자 내에서만 사용가능

	public String toString() {
		return name+":"+age;
	}//toString() : 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드(함수)
	public static void main(String[] args) {
		Member m1 = new Member(); //객체 생성 m1 = 참조변수(객체) , new Member(); = 인스턴스 
		Member m2 = new Member("Amy");
		Member m3 = new Member("Bobby", 12);

		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
	}// 중복코딩 안좋음(중복코딩이 많으면 필드를 수정할때 그 필드를 사용한 모든 곳을 수정해야 함)
	
	
}
