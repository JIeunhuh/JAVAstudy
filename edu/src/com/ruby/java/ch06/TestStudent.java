package com.ruby.java.ch06;

//하나의 java file에 Student class를 분리하여 정의 구현하는 실습
/*
 * 생성자 함수 구현 - this(); 호출 사용
 * static 데이터 멤버 사용
 * static 멤버 함수 구현
 * toString() 함수 구현과 사용
 * 객체 배열 사용
 */
class Student1 {
	static int countStudents;// 객체수
	int sid;// 학번
	String sname; // 학생 이름
	String city; // 주소 도시

	public String toString() {
		return sid + ":" + sname + ":" + city;
	}

	void showStudent() {
		System.out.print("객체: ");
		this.toString();
		System.out.println();
	}

	static void showNumberObjects() {// 생성된 객체수를 출력한다.

		System.out.println(countStudents);
	}

	public Student1() {
		this(0);
	}

	public Student1(int sid) {
		this(sid, null);
	}

	public Student1(int sid, String sname) {
		this(sid, sname, null);
	}

	public Student1(int sid, String sname, String city) {
		this.sid = sid;
		this.sname = sname;
		this.city = city;
		countStudents++;
	}
}

public class TestStudent {

	public static void main(String[] args) {
		int[] a = new int[5];
		Student1 arry[] = new Student1[5];
		Student1.showNumberObjects();
		arry[0] = new Student1();
		arry[1] = new Student1(202301);
		arry[2] = new Student1(202302, "Hong");
		arry[3] = new Student1(202303, "Lee", "Busan");
		arry[4] = new Student1(202304, "Na", "jeju");
		Student1.showNumberObjects();
		

		for (int i = 0; i < 5; i++) {
			arry[i].showStudent();// 생성된 객체 모두를 출력한다.
		System.out.println();
		}
	}

}
