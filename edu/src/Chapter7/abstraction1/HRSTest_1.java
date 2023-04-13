package Chapter7.abstraction1;

//이름을 넣어주고 기본급 = salary 나머지 수당은 알아서 넣어서 만들기
abstract class Employee {

	private String name; //field 선언할때 기본적으로 private으로 선언 
	private int salary;

	public Employee(String name, int salary) {
		this.name=name;
		this.salary=salary;
	}
	public abstract void calcSalary();

	public abstract void calcBonus();

	public String getName() { 
		return name;
	}//private으로 선언해서 자식클래스가 해당클래스의 변수에 접근할 수 없으므로 getter, setter를 이용해 메서드를 호출 할 수 있도록 함

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}

class Salesman extends Employee {
	public Salesman(String name, int salary) {
		super(name, salary); //super(parameter) : 부모클래스에 직접 접근함
		
	}
	public void calcSalary() {
		System.out.println(getName()+"의 급여 ");
		System.out.println( "기본급 : "+ getSalary()+"만원");
		System.out.println("판매수당 : " + getSalary()*10+"만원");
		System.out.println("총계 : " +(getSalary()+getSalary()*10)+"만원");
	}

	public void calcBonus() {
		System.out.println("Salesman 보너스 : 기본급 * 12 * 4");
		System.out.println();
	}
}

class Consultant extends Employee {
	public Consultant(String name, int salary) {
		super(name, salary);
	}
	public void calcSalary() {
		System.out.println(getName()+"의 급여 ");
		System.out.println( "기본급 : "+ getSalary()+"만원");
		System.out.println("컨설팅 특별수당 : " + getSalary()*12+"만원");
		System.out.println("총계 : " +(getSalary()+getSalary()*12)+"만원");
	}

	public void calcBonus() {
		System.out.println("Consultant 보너스 : 기본급 * 12 * 2");
	}
}

abstract class Manager extends Employee {
	
	public Manager(String name, int salary) {
		super(name, salary);
	}
	public void calcSalary() {
	
		System.out.println(getName()+"의 급여 ");
		System.out.println( "기본급 : "+ getSalary()+"만원");
		System.out.println("팀 성과수당 : " + getSalary()*15+"만원");
		System.out.println("총계 : " +(getSalary()+getSalary()*15)+"만원");
	}
}// calcBonus를 구현하지 않았기 때문에 자기자신이 추상 클래스가 됨 
//Employee class를 상속받았기 때문에 하나이상의 abstract method가 만들어짐 

class Director extends Manager {
	public Director(String name, int salary) {
		super(name, salary);
	}
	public void calcBonus() {
		System.out.println("Director 급여 : 기본급 * 12 * 6");
	}
}// 부모클래스가 Manager class이기 때문에 calcSalary()를 상속받음
//default class가 되어 객체(인스턴스)를 생성할 수 있음

public class HRSTest_1 {
	public static void main(String[] args) {

		Salesman s = new Salesman("홍길동", 250);//생성자 안만들어놓은 상태에서 안에 parameter 집어넣으면 error 뜸. 생성자 다 만들어 줘야 함
		Consultant c = new Consultant("홍경", 400);
		Director d = new Director("로제", 550);
		
		
		s.calcSalary();
		c.calcSalary();
		d.calcSalary();
	}
}
