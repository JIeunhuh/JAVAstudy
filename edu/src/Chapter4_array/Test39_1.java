package Chapter4_array;

public class Test39_1 {
	//for문 하나만 써서 대각선 배열 총합 구하기(오른쪽 대각선 순회)
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4, 5 }, 
						{ 6, 7, 8, 9, 10 }, 
						{ 11, 12, 13, 14, 15 }, 
						{ 16, 17, 18, 19, 20 },
						{ 21, 22, 23, 24, 25 } };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			//for (int j = 0; j < arr[i].length; j++) // i=j값이 같으므로 변수 j 하나 더 만들 필요 없음 
				if (i == i) {
					sum = sum + arr[i][i];
				}

			}

	
		System.out.println("합계 : " + sum);
	}

}
