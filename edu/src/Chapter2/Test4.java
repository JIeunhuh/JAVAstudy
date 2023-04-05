package Chapter2;

public class Test4 {
	public static void main(String[] args) {
		float exchangeRate = 1263.50f; // error message : cannot convert from double to float : 8byte -> 4byte로 바꿀 수 없음(double->float) 
										// f 안쓰면 double로 인식
		double USDAmount = 600.50;
		double KRWAmound = 682468.25;
		
		System.out.println(exchangeRate);
		System.out.println(USDAmount);
		System.out.println(KRWAmound);
	}
}
