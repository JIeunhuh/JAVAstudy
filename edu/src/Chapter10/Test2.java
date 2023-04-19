package Chapter10;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	list.add("서울");
	list.add("부산");
	list.add("제주");
	list.add(0,"대구"); //list는 배열 중간에 끼워넣기 할 수 있음
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}

	String sl[]= new String[10];
	sl[0]="서울";
	sl[1]="부산";
	sl[2]="제주";
	//sl[0]에 대구를 입력하려면
	sl[3]=sl[2];
	sl[2]=sl[1];
	sl[1]=sl[0]; //배열을 하나씩 다 옮겨야 함 
	sl[0] = "대구";
	for(String s : sl) {
		System.out.print(" "+s);
	}//arraylist와 array의 차이 : arraylist는 배열 중간에 추가, 삭제 등등 가능 / array는 배열 하나 추가 하려면 기존 위치의 배열을 하나씩 다 옮겨야 함(arraylist가 더 편함)
	
	//Iterator ; 중요!
//	Iterator<String> iter=list.iterator();
//	while(iter.hasNext()) {
//		System.out.println(iter.next());
//	}
}
}
