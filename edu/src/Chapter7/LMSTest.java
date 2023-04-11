package Chapter7;

public class LMSTest extends Person {

//	public static void main(String[] args) {
//		Employee employee = new Employee();
//		Professor professor = new Professor();
//		Student student = new Student();
//
//		employee.setName("오정임");
//		employee.setAge(47);
//		employee.setDept("입학처");
//
//		professor.setName("김푸름");
//		professor.setAge(52);
//		professor.setSubject("Big Data");
//
//		student.setName("김유빈");
//		student.setAge(20);
//		student.setMajor("Computer Science");
//
//		System.out.println(employee.toString());
//		System.out.println(professor.toString()); // 해당 클래스에 toString을 정의한적 없어도 age, name이 나오는 이유 : 부모클래스로부터 상속받았기 때문에
//													// 부모 클래스의 tostring()를 상속받음
//		System.out.println(student.toString()); // 각 클래스에 toString을 정의했으므로 값이 다 나옴
//
//	
//	}
//}
	public static void main(String[] args) {
		Employee e = new Employee(); // 초기값은 null값이 찍힘
		System.out.println(e);

		Employee e1 = new Employee("홍길동", 23, "입학처");
		System.out.println(e1);

		Professor p1 = new Professor("김푸름", 52, "빅데이터");
		System.out.println(p1);
		
		Student s1 =new Student("김유빈", 20, "computer science");
		System.out.println(s1);
		
	}
}