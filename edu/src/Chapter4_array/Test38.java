package Chapter4_array;

public class Test38 {
	public static void main(String[] args) {
		// 2차원 배열 선언 : new 데이터타입 [행의 수] [열의 수]
		// or int arr[]={{10,20},{20,30},,,}
		// 2차원 배열 접근 : 배열변수명[행 인덱스] [열 인덱스]
		// 2차원 배열 순회; 2차원 배열길이 : 배열변수명.length(행 길이) & 배열변수명[행 인덱스].length(열 길이)
		int[][] arr = new int[5][5];
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
				System.out.print("\t"); // \t : 탭 들여쓰기 & \n : 줄바꿈
				// 5열만큼 들여쓰기 하고 종료
			}
			System.out.println("\n");// 5행만큼 줄 띄우고 종료
		}
	}
}
