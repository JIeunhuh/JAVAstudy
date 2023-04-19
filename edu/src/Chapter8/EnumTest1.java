package Chapter8;

//열거형 클래스
enum Status {
	READY, SEND, COMPLETE, CLOSE
}

public class EnumTest1 {

	public static void main(String[] args) {
		Status work = Status.READY;
		System.out.println(work.name()); //.name() = 열거 상수의 이름반환
		System.out.println(work.ordinal());// .ordinal() = 열거상수의 선언된 위치값을 반환
		int n = 2;

		switch (n) {
		case 1:
			work = Status.READY;
			break;
		case 2:
			work = Status.SEND;
			break;
		case 3:
			work = Status.COMPLETE;
			break;
		case 4:
			work = Status.CLOSE;
			break;

		}
		System.out.println("현재 작업상태 : " + work);
		work.toString();
//		String name = "hello";
//		String sname = "good";
	//	if(name>sname) {} error!
	//	if(name.compareTo(sname)>0) {} .compareTo()
	} // switch문 이용

}
