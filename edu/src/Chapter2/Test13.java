package Chapter2;

public class Test13 {
	public static void main(String[] args) {
		
		byte a = 0b1011; // 2진수 표현은 0b로 시작
		byte b = 0b1101;
	//	byte c = a & b; 연산결과를 
//		int c = a & b; // 피연산자의 값이 모두 1이여야 1을 결과로 얻음   
//		System.out.println("c = "+c);
//		System.out.println("c = "+Integer.toBinaryString(c));
//		System.out.println(Byte.toString(b));
//		
//		int e = a ^ b; // 피연산자의 값이 서로 다를 때 1을 결과로 얻음
//		System.out.println(e);
//		System.out.println(Integer.toBinaryString(e));
//		
//		int f = 12;
//		int g = (~f) +1; // f=1100(이진수) (~f)=0011
//		System.out.println(g);
//		System.out.println(Integer.toBinaryString(g));
//		
//		int h = a|b; // 피연산자의 값이 하나라도 1일 경우 1을 결과로 얻음
//		System.out.println(h);
//		System.out.println(Integer.toBinaryString(h));
//		
//		int i = f << 1; // shift 연산자(왼쪽으로 이동) : << -> f=01100, i=11000
//		int j = f >> 1; // >> -> (오른쪽으로 이동)
//		
//		System.out.println(Integer.toBinaryString(i));
//		System.out.println(Integer.toBinaryString(j));
	
		char k = 'A'; // 'A' = 65 우리가 보는 것은 문자 A지만 컴퓨터는 65로 봄(ASCII 코드)
		int n = k;
		k ^= (1<<5);
		System.out.println(Integer.toBinaryString(n));
		
		int x = k;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		
	}
} 
