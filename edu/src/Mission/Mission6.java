package Mission;

import java.util.Scanner;

//임의의 수를 입력받아서 이진수로 변환해서 출력
//출력 예 : 입력 2 -> 10 & 입력 13 -> 1101
public class Mission6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] arr = new int[100];
		int i=0;
		// 2진수 계산
		for (; i < 10; i++) {
			arr[i] = num % 2;
			num /= 2;
			if(num==0) {
				break;
			}
		}//계속 나눠서 나오는 나머지 순으로 출력해서 배열에 저장
		
		for (; i >= 0; i--) {
			System.out.print(arr[i]);
			System.out.print(' ');
		} // 2진수로 출력하기 위해서 배열을 반대로 출력해야 함

		sc.close();
	}

}
