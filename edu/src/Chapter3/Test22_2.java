package Chapter3;

import java.util.Scanner;

public class Test22_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		while (true) {
			System.out.println("Op[+,-,*,/]: ");
			String op = sc.next(); // character
			int a=0, b=0;
			if (op == "+" || op == "-" || op == "*" || op == "/") {
				System.out.println("a의 값을 입력하세요 : ");
				a = sc.nextInt();
				
				System.out.println("b의 값을 입력하세요 : ");
				b = sc.nextInt();
				
			}

			switch (op) {
			case "+":
				System.out.println(" + : " + (a + b));
				break; // break : 조건 달성하면 실행을 멈추고 switch문 빠져나옴(나머지 case문 실행하지 않음)

			case "-":
				System.out.println(" - : " + (a - b));
				break;
			case "*":
				System.out.println(" * : " + (a * b));
				break;
			case "/":
				System.out.println(" / : " + (a / b));
				break;
			default:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			}
		}
	}
}
