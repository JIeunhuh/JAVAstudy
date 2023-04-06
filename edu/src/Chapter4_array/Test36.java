package Chapter4_array;

public class Test36 {
	// 줄 더블 클릭하면 breakpoint 만들어짐 (거기서 부터 시작해서 하나씩 코드 디버깅 함 ; 에러뜰때 확인 용이)
	public static void main(String[] args) {
		char letter = 'A'; // int letter = A면 ascii 코드 ,char letter= 'a' 면 문자그대로의 a
		char[] alphabet = new char[26];
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char) (letter + i); // (letter + i) -> int형으로 계산해서 char형으로 바뀜 -> char형으로 바껴서 배열에 할당됨
		}
		for (char c : alphabet) {
			System.out.println(c); // A ~Z까지 출력됨
		}
	}
}
