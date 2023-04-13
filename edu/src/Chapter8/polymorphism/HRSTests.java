package Chapter8.polymorphism;

abstract class Employee {
	String name;
	int salary;

	public abstract void calcSalary();

	public abstract void calcBonus();
}

// 추상 클래스 지정하면 하나 이상의 추상 메서드 가짐
// ex) void calcsalary(){body} : {}안에 아무내용이 없어도 body가 있다고 함
// void calcsalary(); : body가 없다(추상 메서드는 body가 없어야 함!!)
// 추상 클래스는 객체(인스턴스)를 가질 수 없음
class Salesman extends Employee {

	public void calcSalary() {
		System.out.println("Salesman 급여 : 기본급 + 판매수당");
	}

	public void calcBonus() {
		System.out.println("Salesman 보너스 : 기본급 * 12 * 4");
	}
}

class Consultant extends Employee {
	public void calcSalary() {
		System.out.println("Consultant 급여 : 기본급 + 컨설팅 특별수당");
	}

	public void calcBonus() {
		System.out.println("Consultant 보너스 : 기본급 * 12 * 2");
	}
}

class Manager extends Employee {
	public void calcSalary() {
		System.out.println("Manager 급여 : 기본급 + 팀 성과수당");
	}

	public void calcBonus() {
		System.out.println("Manager 보너스 : 기본급 * 12 * 6");
	}
}

class Director extends Manager {

	public void calcBonus() {
		System.out.println("Director 보너스 : 기본급 * 12 * 6");
	}
}

public class HRSTests {
	public static void calcTax(Employee e) {
		System.out.println("소득세를 계산합니다.");
	}//다형성 적용
//	public static void main(String[] args) {
//		Salesman s = new Salesman();
//		Consultant c = new Consultant();
//		Director d = new Director();
//		
//		Salesman s2=s;
//		
//		s.calcBonus();
//		c.calcBonus();
//		d.calcBonus();
//	//다형성	
//		calcTax(s); 
//		calcTax(c);
//		calcTax(d);
//		
//		System.out.println(s.toString()); //instanc s에 toString() 호출
//		System.out.println(c.toString());
//		System.out.println(d.toString());
//		
//		if(s.equals(s2)) {//
//			System.out.println("동일한 객체입니다.");
//		}
//		else {
//			System.out.println("서로 다른 객체입니다.");
//		} //object class's method : equals()
//		
//	}
	
	//오류 나는 경우
//	public static void main(String[] args) {
//		Salesman s1 = new Salesman();
//		Employee s2 = new Salesman();
//		Object s3 = new Salesman();
//	
//		Object m1 = new Manager();
//		Employee m2 = new Manager();
//	//	Director m3 = new Mangager(); : error!(자식클래스는 부모클래스를 받아올 수 없음)
//		
//	
//	}
	
	
	//
	public static void main(String[] args) {
		Salesman s1 =new Salesman();
		Employee s2=new Salesman();
		Object s3=new Salesman();
		
		Object m1=new Manager();
		Employee m2=new Manager();
		Manager m3=new Manager();
		
		Object arr[]= new Object[6];
		arr[0]=s1;
		arr[1]=s2;
		arr[2]=s3;
		arr[3]=m1;
		arr[4]=m2;
		arr[5]=m3;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
