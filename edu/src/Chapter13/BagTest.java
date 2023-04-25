package Chapter13;


class Book {
	String name;
}

class Pencil {
	String name;
}

class Note {
	String name;
}

class Bag1 {
	Object thing;

	public Bag1(Object thing) {
		this.thing = thing;
	}
	public Object getThing() {
	return thing;	
	}
}

public class BagTest {
	public static void main(String[] args) {
		Bag1 bag1 = new Bag1(new Book());
		Bag1 bag2 = new Bag1(new Pencil());
		Bag1 bag3 = new Bag1(new Note());
		Book book = (Book)bag1.getThing(); //type 변경 해줘야함
		bag1=bag2; // error 발생 안하지만 심각한 논리적인 오류 ; 
		//같은 Bag 타입이지만 bag1 = Book , bag2 = Pencil을 가지는 bag객체를 참조하므로 다른 객체 
	}
}
