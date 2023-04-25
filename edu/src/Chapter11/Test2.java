package Chapter11;

import java.io.FileInputStream;

public class Test2 {
	public static void main(String[] args) {
		
		try(FileInputStream fi = new FileInputStream("a.txt");) {
//			System.out.println("1");
//			System.out.println("2");
//			System.out.println("3");
//			String s = null;
//			s.length();//s=null값이기 때문에 length값이 없어서 에러뜸
			
		} catch (Exception e) {
			System.out.println("error !");
		} finally {
			System.out.println("ok");
		}
		
		System.out.println("4");
	}
}
