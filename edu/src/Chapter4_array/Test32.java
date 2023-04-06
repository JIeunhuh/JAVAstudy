package Chapter4_array;

public class Test32 {

	public static void main(String[] args) {
		// java에서는 항상 데이터타입적고 변수 선언?
		// index는 0부터 시작
		// array -> new data type[요소 수] ; new int[5]
		// 배열 변수 선언 : 데이터타입[ ] 변수명; or 데이터타입 변수명[ ]
		// 참조변수 ex) int[ ] arr=new int[ ]일떄 arr=참조변수
		// 받는 데이터 타입과 선언한 데이터타입의 형식이 같아야 함
		// 변수를 선언하면 배열의 값이 0으로 자동으로 초기화됨
		// string = ""(글자가 없는 문자열) / string = null은 다름!(할당된 값이 없음)
		int[] arr = new int[5];

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

//	public static void main(String[] args) {
//		int[] arr=new int[5];
//		
//		arr[0]=10;
//		arr[1]=20;
//		arr[2]=30;
//		arr[3]=40;
//		arr[4]=50;
//		
//		for(int i=0; i<=4; i++) {
//			System.out.println(arr[i]);
//		
//	}
//		
	}
}
