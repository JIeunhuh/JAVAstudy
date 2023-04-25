package Chapter13.boundGen;
class Solid{}
class Liquid{}
//solid class를 상속
class Book extends Solid{}
class PencilCase extends Solid{}
class NoteBook extends Solid{}
//liquid class를 상속
class Water extends Liquid{}
class Coffee extends Liquid{}
class Bag<T extends Solid>{
	T thing;
	String owner; //field값 선언
	public Bag(T thing){
		this.thing=thing;
	}//생성자 
	public T getThing() {
		return thing;
	}
	//와일드 카드
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner=owner;
	}//getter&setter
	boolean isSameOwner(Bag<T> obj) {
		if (this.owner.equals(obj.owner))
			return true;
		else return false;
	}
}
public class BagTest {
public static void main(String[] args) {
	//타입 제한
	Bag<Book> bag =new Bag<>(new Book());
	//Bag<Water> water = new Bag<>(new Water());
	//error! : solid class를 상속 받았으므로 liquid class의 subclass인 water class를 참조한 bag class는 불러올 수 없음
	Bag<PencilCase> bag2 =new Bag<>(new PencilCase()); 
}
}
