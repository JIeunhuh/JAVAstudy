package Mission;

public class Mission4 {
	//method 이용해서 총합, 홀수합, 짝수합 만들어서 출력하기
	private int sum1; //총합
	private int sum2; //홀수합
	private int sum3; //짝수합

	public void setSum1(int sum1) {
		this.sum1 = sum1;
	}
	public int getSum1() {
		for (int i = 1; i <= 1000; i++) {
			sum1 += i;
		}
		return sum1; 
	}

	public int getSum2() {
		for (int i = 1; 2 * i - 1 <= 1000; i++) {
			sum2 += 2 * i - 1;
		}
		return sum2;
	}

	public void setSum2(int sum2) {
		this.sum2 = sum2;

	}

	public int getSum3() {
		for (int i = 1; 2 * i <= 1000; i++) {
			sum3 += (2 * i);
		}
		return sum3;
	}

	public void setSum3(int sum3) {
		this.sum3 = sum3;
	}
	
	public String toString() { //해당 리턴
		return "[총합 : "+getSum1()+", 홀수 합 : "+getSum2()+", 짝수 합 : "+getSum3()+"]"; 
	}
	public static void main(String[] args) {
		Mission4 res = new Mission4();
		System.out.println(res.toString()); //
	
	}
}
