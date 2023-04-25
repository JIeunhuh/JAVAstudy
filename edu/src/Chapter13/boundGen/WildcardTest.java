package Chapter13.boundGen;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class WildcardTest {
public static void main(String[] args) {
	Integer[] inum = {1,2,3,4};
	Double[] dnum = {1.0,2.0,3.0};
	String[] snum = {"1","2","3"};
	List<Integer> iList= Arrays.asList(inum);
	List<Double> dList = Arrays.asList(dnum);
	List<String> sList = Arrays.asList(snum);
	
	double isum=sum(iList);
	double dsum =sum(dList);
	//sum(sList); error! : string 배열이므로 error뜸
	
	System.out.println("inum sum = "+ isum);
	System.out.println("dnum sum = "+dsum);
	
}

	public static double sum(List<? extends Number> list) {
		double total = 0;
		for (Number v : list) {
			total += v.doubleValue();
		}
		return total;
	} // sum method; 와일드카드에 제한을 둠 Number class와 그 상위 클래스만 상속받을 수 있음
}
