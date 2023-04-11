package Chapter7;

//부모 클래스 상속 ; 자식 클래스
public class Professor extends Person {
	private String subject;

	
	public Professor() {

		System.out.println("Professor에 생성자가 호출되었습니다.");
	}
	
	public Professor(String name, int age, String subject) {
		setName(name);
		setAge(age); // 코드가 깔끔하지 않음 super(name, age)라고 하는게 좋음
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String toString() {
		
			return super.toString()+", subject ="+ subject; //부모 클래스 멤버에 직접 접근 ; 부모메서드 호출 super.method()
		}
}
