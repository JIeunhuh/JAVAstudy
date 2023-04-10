package com.ruby.java.ch06;

public class ThisTest2 {
	private String name;

	public void setName(String name) {
		this.name = name; //this.name -> heap 영역의 name을 가리킴 
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		ThisTest2 exam = new ThisTest2();
		exam.setName("Amy");

		System.out.println(exam.getName());
	}
}
