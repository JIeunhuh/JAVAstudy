package Chapter10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test5 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("Seoul");
		list.add("Busan");
		list.add("Jeju");
//		list.addFirst("부산");
//		list.remove(2);
		list.add(0, "LA");
		for (String i : list) {
			System.out.println(" "+i);
			
		}
		print(1, list);
		List<String> list2= Arrays.asList("Beijing","Shanghai");
		list.addAll(list2);
		
		print(2, list);

		Object obj[] = list.toArray();
		System.out.println("배열출력 : "+Arrays.toString(obj));
		
		
	}

	public static void print(int n, LinkedList<String> list) {
		System.out.println(n + " : " + list);
	}
}
