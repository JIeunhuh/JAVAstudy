package Chapter5;

//class 선언 : class 클래스명{ 필드선언; 메서드 선언;}
//필드 선언 : data type 변수명; , data type 변수명=값;
//메서드 선언 : data type 메서드이름(){ 실행문 } 
//접근 제한자 : 
	
//ctrl+shift+O : 자동으로 import 시켜주거나 없앰

import java.util.List;
import java.io.*; //* = all

public class Armor { 
	private int height; //필드 선언하면 초기값에 null 값이 들어감
	private int weight;
	private String color;
	private String name;
	private Boolean isFly;

	public void setName() { //private로 선언된 필드에 데이터를 설정하는 메서드 ; '세터'라고 함
		String value = "mark6";
		name = value;
	} //ex. public void setName(String value){ name = value; }

	public String getName() { //String형의 data를 리턴 | private로 선언된 필드값을 반환하는 메서드 ; '게터'
		
		if(name == null)
			System.out.println("No name");
		
		return name; // return : 이 메소드를 끝내고 돌아가라
	}
}//ex. public void getName() {return name;}
