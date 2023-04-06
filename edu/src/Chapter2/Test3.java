package Chapter2;

public class Test3 {
	public static void main(String[] args) {

		byte age; // byte = 1byte , 첫번째 byte = 1이면 음수, 0이면 양수
		short point; // short = 2byte
		int price; // int = 4byte
		long totalSales; // long = 8byte

		age = 25;
		point = 32000;
		price = 2147483647; // 2,147,483,648 = error : out of range
		totalSales = 2147483647l; // literal : 문자 그대로의 값

		System.out.println("age = " + age);
		System.out.println("point = " + point);
		System.out.println("price = " + price);
		System.out.println("totalSales = " + totalSales); // 변수이름 작명법 : 두 개 이상의 단어로 만들때는 첫 단어 소문자, 다음 단어 대문자 & x, y, z
															// 같은 문자 사용 x

	}
}
