package com.ruby.java.ch06;

//1. class 이후의 첫자는 대문자, 함수는 소문자
public class Student_1 {
	private int sid;
	private String name;
	private String dept;

	public Student_1() {
	}// default 생성자

	public Student_1(int sid, String name, String dept) {// daya type 써야함
		this.sid = sid;
		this.name = name;
		this.dept = dept; // this.메소드명 : receiver object(수신 객체)
	}

	public static void main(String[] args) { // class생성하고 같은 파일에 main 생성 비추비추
		System.out.println("6장 시작");
		// int n=10;

		Student_1 s = null;
		// s=new Student();
		s = new Student_1(2023, "홍길동", "컴퓨터"); // new 객체 생성
		System.out.println(s.sid + ", " + s.name + ", " + s.dept); // private이지만 class내에 있으므로 사용가능
		System.out.println("Student 객체 : " + s);
	}
}
