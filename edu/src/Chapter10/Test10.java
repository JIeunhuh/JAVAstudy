package Chapter10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

//lotto 만들기
public class Test10 {
	public static void main(String[] args) {
		lotto_generator(5); // lotto_generator() method 호출 /5개의 빈배열 생성
	}

	public static void lotto_generator(int n) { // 함수 정의
		Random num = new Random(); // 난수 생성
		HashSet<Integer> lotto = null;// HashSet<> 객체 선언; 초기값 null
		for (int i = 0; i < n; i++) { // for loop로 index 생성
			lotto = new HashSet<Integer>(); // HashSet<>
//			System.out.println(lotto);
			for (int j = 0; lotto.size() <= 6; j++) {
				lotto.add(num.nextInt(45) + 1);
			} // 랜덤으로 나온 숫자 7개 list에 .add()로 집어넣음
			List<Integer> L = new ArrayList<Integer>(lotto);// List<> 객체 선언
			Collections.sort(L); // arraylist 내림차순으로 정렬
			System.out.println(L);// 객체 L 출력
		}
		
	}
}
