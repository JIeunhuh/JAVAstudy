package Chapter2;

public class Test9 {
	public static void main(String[] args) {
		int a=10;
		int b=2;
		
		boolean gender = true; //boolean(참/거짓)
		
		System.out.println(a==10 && b==2 && gender==true);
		System.out.println(a==10 & gender==false); 
		// (논리연산)&& -> 실행된 조건식이 거짓이면 바로 종료, (비트연산)& -> 조건식 모두 실행
		
		System.out.println(a!=10 || !gender); //부정연산자 gender = true 일때, !gender = false로 바뀜 
	}
}
