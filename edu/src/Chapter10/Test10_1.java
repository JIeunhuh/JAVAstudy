package Chapter10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Test10_1 {

	public static void main(String[] args) {
		lotto_generator(5);
	}

	public static void lotto_generator(int n) {
		Random num = new Random();
		HashSet<Integer> lotto = null;
		HashSet<HashSet<Integer>> lot = new HashSet<HashSet<Integer>>(); //추가!!
		for (int i = 0; i < n; i++) { // for loop로 index 생성
			lotto = new HashSet<Integer>(); // HashSet<>
			for (int j = 0; lotto.size() <= 6; j++) {
				lotto.add(num.nextInt(45) + 1);
			} // 랜덤으로 나온 숫자 7개 list에 .add()로 집어넣음
			lot.add(lotto);
			List<Integer> L = new ArrayList<Integer>(lotto);// List<> 객체 선언
			Collections.sort(L); // ArrayList 내림차순으로 정렬
			System.out.println(L);// 객체 L 출력
		}
		
		System.out.println("============================");
		System.out.println(lot); //lot print
	}
}
