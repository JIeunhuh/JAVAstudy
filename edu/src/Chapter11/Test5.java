package Chapter11;

class NegativeNumberException extends Exception {
	public NegativeNumberException() {
		super("음수는 허용하지 않음");
	}
}

public class Test5 {
	int battery = 0;

	public void charge(int time) {
		if (time < 0) {
			time = 0;
			try {
				throw new NegativeNumberException();
			} catch (Exception e) {
				e.printStackTrace(); //.printStackTrace(); =stack을 추적(함수 호출관계를 보여줌?)
			}
		}
		battery += time;
		System.out.println("현재 배터리 : " + battery);
	}

	public static void main(String[] args) {
		Test5 test = new Test5();
		test.charge(30);
		test.charge(20);
		
		test.charge(-10);
	}
}
