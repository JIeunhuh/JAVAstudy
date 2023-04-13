package Mission;

import java.util.Scanner;

//최수 지폐 수 계산
//152,365원을 지불하기 위해 필요한 최소 지폐장수는 아래와 같다
//5만원 -3장 & 1만원 0장 & 5천원 0장 & 천원 2장
//임의의 금액을 지불하기위해 필요한 지폐 장수를 구하는 프로그램 작성(천원미만으론 날림)
public class Mission5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("돈을 입력하세요 : ");
		
		//단순계산으로 출력하기
		int m = sc.nextInt();
		int mon1 = 0;
		int mon2 = 0;
		int mon3 = 0;
		int mon4 = 0;
		// 50000원짜리가 몇장인지 계산
		mon1 = m / 50000;
		m %= 50000;
		// 나머지 돈을 10000이 몇장인지 계산
		mon2 = m / 10000;
		m %= 10000;
		// 나머지 돈을 5000이 몇장인지 계산
		mon3 = m / 5000;
		m %= 5000;
		// 나머지 돈을 1000이 몇장인지 계산
		mon4 = m / 1000;
		m %= 1000;

		System.out.println("최소 지폐");
		System.out.println("5만원 : " + mon1 + "원");
		System.out.println("1만원 : " + mon2 + "원");
		System.out.println("5천원 : " + mon3 + "원");
		System.out.println("1천원 : " + mon4 + "원");

		sc.close();
		
		//배열로 계산하기
//		
//		int[] mon= {50000,10000,5000,1000};
//		int[] m = new int[mon.length];
//		
//		int money = sc.nextInt();
//		
//		for(int i=0;i<=mon.length;i++) {
//			m[i] = money / mon[i];
//			money %= mon[i];
//			
//		}
//		
//		System.out.println("최소 지폐 ");
//		for(int i=0;i<mon.length;i++) {
//			System.out.println(mon[i]+"원 : "+m[i]+"장");
//		}
//		
	}

}
