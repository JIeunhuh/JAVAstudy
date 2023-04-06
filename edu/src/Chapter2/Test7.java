package Chapter2;

public class Test7 {
	public static void main(String[] args) {
//		int a =10, b=0; // 변수 중복 안되게 조심
//		
//		b = a++;
//		
//		System.out.println(b);

		int a = 10;
		a++;
		System.out.println(a);
		++a;
		System.out.println(a); // n++ : n을 먼저 사용후 증가 / ++n : 1먼저 증가시킨 후 n 사용(for문에서 많이 사용)

		a++;
		System.out.println(a);

//		int a=1;
//		int b=++a;
//		
//		System.out.println(a); //증감 연산자가 붙어서 결과가 2가 나옴
//		System.out.println(b); //a++은 print문으로 출력할때 a먼저 출력 후 증감시킴
	}
}
