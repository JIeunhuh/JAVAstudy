package Mission;

import java.util.Scanner;

//팩토리얼
// 4! = 1*2*3*4 =24
public class Mission8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int p =1;

		for (int i = 1; i <= num; i++) {
			p *= i;

		}
		System.out.println(p);
	
		sc.close();
	}
}


