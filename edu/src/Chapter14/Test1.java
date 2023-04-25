package Chapter14;

interface MyInterface {
	public void print();
}// interface 선언

class Myclass1 implements MyInterface {// interface 상속하는 class 구현
	public void print() {
		System.out.println("MyClass1");
	}// method override
}

class Myclass2 implements MyInterface {// interface 상속
	public void print() {
		System.out.println("MyClass2");
	}// method override
}

public class Test1 {
	//4. 매개변수가 선언된 경우
	static void test(MyInterface mi) {
		mi.print();
	}

	//5. 리턴 타입으로 반환하기
	public static MyInterface test2() {
		MyInterface mi = new MyInterface() {
			public void print() {
				System.out.println("test2() 메서드에서 반환된 MyInterface");
			}
		};
		return mi;
	}

	public static void main(String[] args) {
		Myclass1 mc1 = new Myclass1();
		Myclass2 mc2 = new Myclass2();
//		mc1.print(); // 1. mc1 객체 생성해서 print() 호출
//		mc2.print();
		test(mc1);// test()호출

		MyInterface mi2 = test2();
		mi2.print(); // test2() 호출한 객체 생성해서 print() 호출

		//2. 익명 클래스 생성 ; interface 변수명 = new interface(){ !method overriding! }
		MyInterface mi = new MyInterface() {
			public void print() {
				System.out.println("익명클래스로 구현");
			}
		};
		mi.print();// MyInterface method overriding
		test(mi); // 매개변수를 사용해 test()호출

		//3. 익명 클래스 선언, 생성,호출 한번에 다 처리 ; new interface(){ !method overriding! }).method();
		(new MyInterface() {
			public void print() {
				System.out.println("익명클래스로 선언,생성,호출 한번에 다 구현");
			}
		}).print();
		
		//5. 람다식 사용하기 : 교재 p664(그림 명령 스타일과 함수형 스타일 비교)
		MyInterface m = () -> System.out.println("hello");
	}
}
