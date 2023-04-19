package Chapter11;

//예외 처리
public class Test1 {
	public static void main(String[] args) {
		int arr[] = new int[3];
		try {
		arr[3] = 30; //error! ; arr[3] = 존재하지 않음
		String s = "java";
		s = null;
		System.out.println(s.length());
			System.out.println("OK");
		}catch (NullPointerException e) {
			System.out.println("null error!");
			e.printStackTrace(); //.printStackTrace()
		}//try-catch문 
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("array indexout error!" +e1);
		}
		System.out.println("Good.");
		
	}

}
