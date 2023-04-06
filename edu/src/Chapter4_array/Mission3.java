package Chapter4_array;

//2023년 이후 윤년 10개를 찾아서 배열에 저장하고 이를 출력하는 메소드를 구현
public class Mission3 {
	public static void main(String[] args) {
//		int year = 2023;
		int[] year_arr = new int[40];
		int idx = 0;

		// year가 윤년이면 year_arr에 추가
		// year_arr[idx++]=year

		// year_arr가 가득차면 break, 그렇지 않으면 year 1++하고 반복
		// year++

//		while (true) {
//			if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
//				year_arr[idx++] = year;
//				year++;
//				continue;
//
//			} else {
//				year++;
//
//				if (idx == 40) {
//
//					
//					break;
//				}
//
//			}
//		}
//
//		for (int res : year_arr) { // 확장 for문
//			System.out.println(res);
//		}
//
		for (int i = 2023; ; i++) {
			//무조건 true로 인식되어 무한 루프를 돌게 된다.
			//i>2023인 조건이 필요하지 않음 i는 계속 증감해야 하기 때문에 공백 처리
			if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0))
				//continue; 조건이 공백란이기 때문에 i는 계속 증감되므로 필요없음 
			{
				year_arr[idx++] = i;
			}
			if (idx >= 40) {
				break;

			}

		}
		for (int res : year_arr) {
			System.out.println(res);
		}
	}
}
