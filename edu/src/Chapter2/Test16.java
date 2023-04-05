package Chapter2;

public class Test16 {
	public static void main(String[] args) {
		byte a = 0b1011;
		byte b = 0b1101;
		char c = 'A';
	//	c= a; 2byte -> 1byte로 변환x
		int n;
		n = a; // 1byte -> 2byte로 변환 가능(자동 타입 변경)
		a = (byte)n; // type casting(직접 타입 변경) 
		
		
	}
}
