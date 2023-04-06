package Chapter4_array;

public class Mission_2 {
	public static void main(String[] args) {
		// 3*4행렬과 4*3행렬을 선언하고 두 행렬의 곱을 계산해서 출력
		int[][] arr_a = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int[][] arr_b = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		

		int row = arr_a.length;
		int col = arr_b[0].length;
		int row_2 = arr_b.length;
		int[][] res = new int[row][col];
//		int[][] res_arr = new int[][]
		//System.out.println(arr_b[0].length);
		
				
		for(int i=0; i<row; i++) {
			for(int j=0; j<col;j++) {
				for(int k=0; k<row_2;k++) { 
				
					res[i][j] += (arr_a[i][k] * arr_b[k][j]);
					
					
					
				}
				System.out.print(res[i][j]);
				System.out.print("\t");
			}
				
				System.out.println("\n");
		}
	}
}
