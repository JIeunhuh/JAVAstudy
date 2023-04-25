package Chapter13;


//class Bag {
//	Book book;
//	Pencil pencil;
//class Book {
//	String name;
//}
//
//class Pencil {
//	String name;
//}
//class Note{
//	String name;
//}


class Bag<T> {// generic class ; class 클래스명<타입 매개변수>{ }
	T thing;

	public Bag(T thing) {
		this.thing = thing;
	}
	public T getThing() {
		return thing;
	}
}

public class Test1 {
	public static void main(String[] args) {	
		Bag<Book> b = new Bag<Book>(new Book()); // generic class 호출 방식 (객체 선언)
		Book book = b.getThing();
		// Bag b1= new Bag<>();
		Bag<Pencil> p =new Bag<Pencil>(new Pencil());
		//b=p; error! : type mismatch 
		
		//generic은 엄격한 타입 검사로 타입의 안전성 보장
	}
}