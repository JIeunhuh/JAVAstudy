package Chapter4_array;

public class Test40 {
	public static void main(String[] args) {
		// 배열 왼쪽 삼각형 합계 구하기 / 순회
		int[][] arr = { { 1, 2, 3, 4, 5 },
					{ 6, 7, 8, 9, 10 }, 
					{ 11, 12, 13, 14, 15 }, 
					{ 16, 17, 18, 19, 20 },
					{ 21, 22, 23, 24, 25 } };

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				sum = sum + arr[i][j];
				// System.out.println(sum);

			}
			
		}
		System.out.println("총합 : " + sum);
	}
}
