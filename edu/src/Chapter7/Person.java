package Chapter7;

public class Person { //부모 클래스
	private String name; //일반적으로 필드값에 private을 붙임
	private int age;
	
	public Person() {
		
		System.out.println("Person에 생성자가 호출되었습니다.");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	} // 생성자 추가
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

//	public static void main(String[] args) {
//		Person person = new Person();
//		person.setAge(24);
//		person.setName("허지은");
//		
//		System.out.println(person);
//	}
}
