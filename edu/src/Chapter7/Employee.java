package Chapter7;

//부모 클래스 상속 ; 자식 클래스
public class Employee extends Person { // public class class명 extends class명 ; 부모 클래스로부터 상속받음
	private String dept;

	public Employee() {

		System.out.println("Employee에 생성자가 호출되었습니다.");
	}

	public Employee(String name, int age, String dept) {
	//	this.name = name; //error ; 부모 클래스에 있는데 private이라 접근할수 없음
		super(name, age); //부모 생성자 호출
		this.dept = dept;
	}
	public String getDept() {// getter
		return dept;
	}

	public void setDept(String dept) {// setter
		this.dept = dept;
	}

	@Override
	public String toString() {
		// return "Employee [name=" + name + ", age=" + age + "dept=" + dept + "]";
		// error : 부모클래스인 Parent의 필드값이 private으로 정의되어 있으므로 사용x
		return "Employee [name=" + getName() + ", age=" + getAge() + ", dept=" + dept + "]"; // public으로 정의된
																								// getName(),getAge()
																								// method를 불러오면 error안뜸
	}

}
