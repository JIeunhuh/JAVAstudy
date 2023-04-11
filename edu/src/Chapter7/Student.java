package Chapter7;

//부모 클래스 상속 ; 자식 클래스
public class Student extends Person {

	private String major;

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
//	public String getMajor() {
//		return major;
//	}
//
//	public void setMajor(String major) {
//		this.major = major;
//	}
	
	public String toString() {
		
		return "Student [name=" + getName() + ", age=" + getAge() + ", major=" + major + "]"; 
	}
}
