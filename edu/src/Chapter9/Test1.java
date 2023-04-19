package Chapter9;

public class Test1 {
	class myObject{
		public String toString() {
			return "MyObject"; //toString() @overriding
		}
	}//내부클래스(클래스 내에서 한번만 사용할때)
	public static void main(String[] args) {
		Test1 t= new Test1();
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		myObject my = t.new myObject(); //내부클래스 객체선언
		
		System.out.println(obj1.hashCode());
		System.out.println(my.toString());
		
		Class c = obj1.getClass(); //getClass() ; class에 대한 정보만 담는 객체를 새로 생성해 활용할때
		System.out.println(c.getName());//getName() ; 객체의 이름을 반환
		
		System.out.println(obj1.toString());//.toString()
		System.out.println(obj1.equals(obj3)); //.equals() 
	}
}
