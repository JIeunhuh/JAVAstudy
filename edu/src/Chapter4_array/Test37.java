package Chapter4_array;

public class Test37 {
	public static void main(String[] args) {
		int[] score = { 90, 85, 78, 100, 98 };
		int sum = 0; // 점수 합계
		double avg = 0.0; // 평균
		int max = 0; // 최댓값
		int min = 200; // 최솟값

		for (int i = 0; i < score.length; i++) {
			sum += score[i];
			if (max < score[i]) { // max=0<score[0]=90 -> max=90<score[1]=85이므로 여전히 max값 90, 그렇게 반복해서 최대값 100
				max = score[i];
			}
			if (min > score[i]) {// min값 : 위 코드랑 원리 똑같음
				min = score[i];
			}
		}

		avg = (double) sum / score.length; // double형으로 바꿈
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + String.format("%.2f", avg)); // string.format("%.2f", 변수명))
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	}

	// 점수 입력받아서 해보기
	// for loof문 도려서 해보기
}
