package Chapter7.abstraction;

//추상 메서드 ; abstract
abstract class Employee {
	String name;
	int salary;
	
public abstract void calcSalary();

	
}//추상 클래스 지정하면 하나 이상의 추상 메서드 가짐
//ex) void calcsalary(){body} : {}안에 아무내용이 없어도 body가 있다고 함
//		void calcsalary(); : body가 없다(추상 메서드는 body가 없어야 함!!)

//추상 클래스는 객체(인스턴스)를 가질 수 없음
class Salesman extends Employee{ 
	
	public void calcSalary() {
		System.out.println("Salesman 급여 : 기본급 + 판매수당");
	}
}

class Consultant extends Employee{
	public void calcSalary() {
		System.out.println("Consultant 급여 : 기본급 + 컨설팅 특별수당");
	}
}

class Manager extends Employee{
	public void calcSalary() {
		System.out.println("Manager 급여 : 기본급 + 팀 성과수당");
	}
}
class Director extends Manager{
		}

public class HRSTest{
	public static void main(String[] args) {
		Salesman s = new Salesman(); 
		Consultant c =new Consultant();
		Manager m=new Manager();
		
		s.calcSalary();
		c.calcSalary();
		m.calcSalary();
	}
}

