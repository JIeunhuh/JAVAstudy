package Mission;

import java.util.Scanner;

//최대공약수&최소공배수 구하기
//max, min 정수 -> rem=max%min -> rem==0 , 최대공약수 = 작은정수, 최소공배수 = 두정수의 곱/최대공약수 -> rem !=0, max=min,min=rem,2번 반복
public class Mission7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int max = sc.nextInt();
		int min = sc.nextInt();
		int rem = max % min;
		// rem=max%min
		int maxnum = 0;
		int minnum = 0;
		// rem==0 , 최대공약수 = 작은정수, 최소공배수 = 두정수의 곱/최대공약수
		for (int i=max; ; ) {
			if (rem == 0) {
				minnum = min;
				maxnum = (min * i) / minnum;
			}
			// rem !=0, max=min,min=rem,2번 반복
			else {
				i = min;
				min = rem;
				i = min;
				min = rem;
				
			} //좀만 고쳐도 될거 가틈ㅜㅜ
			System.out.println("최대공약수 : " + maxnum);
			System.out.println("최소공백수 : " + minnum);

			sc.close();
		}

	}
}
