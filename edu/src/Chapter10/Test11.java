package Chapter10;

import java.util.HashSet;
import java.util.Iterator;

//User class 생성
class User {
	String ssn;
	String name;

	User(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}// user 생성자

	public String toString() {
		return ssn + " : " + name;
	}// @override toString()

	public boolean equals(Object obj) {
		User u = (User) obj;
		if (this.ssn.equals(u.ssn))
			return true;
		else
			return false; //@override equals()
	}
}

public class Test11 {
	public static void main(String[] args) {
		User u1 = new User("123", "김푸름");// 생성자 호출
		User u2 = new User("321", "김파랑");

		HashSet<User> users = new HashSet<User>();// HashSet<> 객체생성

		if (u1.equals(u2))
			users.add(u2);
		else
			users.add(u1); //.equals() 사용
		
		Iterator<User> iter = users.iterator();
		while (iter.hasNext()) {
			User u =iter.next();
			System.out.println(u);
		}
	}
}
