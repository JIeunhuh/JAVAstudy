package Chapter8.innerclass;

class Student {
	String sname;
	int sid;

	public Student(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}
	void show() {
		System.out.println("학번 = " + sid+", 이름 = "+sname);
	}
}

public class 객체배열 {
	public static void main(String[] args) {
		int[] data = new int[10];
		Student[] sdata = new Student[10];
		
		data[0]=10;
		sdata[0]=new Student(2023, "hong");
		sdata[1]=new Student(2022, "huh");
		sdata[2]=new Student(2021, "kim");
		sdata[3]=new Student(2020, "lee");
		sdata[4]=new Student(2015, "hwang");
		sdata[5]=new Student(2016, "choi");
		for(int i =0;i<5;i++) {
			sdata[i].show();
		}
	}
}
