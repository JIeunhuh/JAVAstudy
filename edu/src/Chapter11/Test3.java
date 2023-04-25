package Chapter11;

public class Test3 {
	public static void c() throws Exception {//throws (try-catch문 안씀)
		String s = null;
		s.length();

	}

	public static void main(String[] args) {
		try {
			c();//해당 함수를 호출한 곳에서 try-catch문 써줌
		} catch (Exception e) {

		}
	}
}
