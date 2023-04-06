package Chapter4_array;

public class Mission_2_1 {

	public void matrix() { // 행렬 곱셈



		int[][] arr_a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		int[][] arr_b = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

		int row = arr_a.length;
		int col = arr_b[0].length;
		int row_2 = arr_b.length;
		int[][] res = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				for (int k = 0; k < row_2; k++) {

					res[i][j] += (arr_a[i][k] * arr_b[k][j]);

				}
			}
		}

	}

	public static void main(String[] args) {
		Mission_2_1 m = new Mission_2_1(); // m = 인스턴스(참조 변수)

		m.matrix(); // 위의 void matrix의 결과를 m.matrix로 호출
		
	}
}
