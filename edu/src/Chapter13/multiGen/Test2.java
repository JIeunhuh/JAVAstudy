package Chapter13.multiGen;

class Bag<T, N> {
	T thing;
	N name;

	public Bag(T thing, N name) {
		this.thing = thing;
		this.name = name;
	}

	public void showType() {
		System.out.println("T type = " + thing.getClass().getName());
		System.out.println("N type = " + name.getClass().getName());

	}
}

class Book {
	public String toString() {
		return "책";
	}
}

public class Test2 {
	public static void main(String[] args) {
		Bag<Book, String> bag = new Bag<Book, String>(new Book(), "과학");
		bag.showType();
		
		
		
	}
}
