package Chapter4_array;

public class Test35 {
	//확장 for문 ; for(변수 선언 : 배열 변수명 또는 컬렉션){실행문}
	// 배열 또는 변수에 저장된 값이 반복하면서 순서대로 변수에 저장
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		for (int num : arr) {
			System.out.println(num);
		}
	}
}
