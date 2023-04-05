package Chapter3;

import java.util.Scanner;

public class Test20_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("성적을 입력하세요 : ");
			int score = sc.nextInt(); // scanf
			char grade;

			if (score < 0 || score > 100) { // or 연산자 사용
				break;
				// return : 값을 반환 & break와의 차이 -> 하나의 반복문 탈출 , return -> 반복문을 포함한 메서드 자체를 종료
			}

			if (score >= 90) {
				grade = 'A';

			} else if (score >= 80) {
				grade = 'B';

			} else if (score >= 70) {
				grade = 'C';

			} else if (score >= 60) {
				grade = 'D';

			} else {
				grade = 'F';

			}

			System.out.println("당신의 성적은" + grade + "입니다.");
		}

		System.out.println("프로그램을 종료합니다.");

	sc.close();
	}// while문 사용해서 반복문 만들기

	
}
