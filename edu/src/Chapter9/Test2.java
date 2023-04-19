package Chapter9;

public class Test2 {
	public static void main(String[] args) {
		String s1 = new String("java"); //String class는 좀 다름
		
		String s2 = "java";
		String s3 = new String("java");
		String s4 = "java";
		
		if (s1.equals(s2)) {
			System.out.println("동일한 객체입니다.");
		} else
			System.out.println("다른 객체입니다."); //.equals() ; 
		
		
		if (s1==s2) {
			System.out.println("동일한 객체입니다.");
		} else
			System.out.println("다른 객체입니다.");


		System.out.println(s1.hashCode() + ", " + s2.hashCode());
	}
}

