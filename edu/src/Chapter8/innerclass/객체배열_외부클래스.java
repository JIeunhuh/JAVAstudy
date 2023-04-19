package Chapter8.innerclass;

public class 객체배열_외부클래스 {
	class Student {
		String sname;
		int sid;

		public Student(int sid, String sname) {
			this.sid = sid;
			this.sname = sname;
		}

		public String toString() {
			return "학번 = " + sid + ", 이름 = " + sname;
		}
		void show() {
			System.out.println(this.toString());
		}
	}
	public static void main(String[] args) {
		int[] data = new int[10];
		Student[] sdata = new Student[10];
		객체배열_외부클래스 my = new 객체배열_외부클래스(); //Add new object

		data[0] = 10;
	//	sdata[0] = new Student(2023, "hong"); // error!
		sdata[0] = my.new Student(2023, "hong"); //내부클래스 사용하려면 새로운 객체를 정의하고 X.new class명();으로 만들어야 함
		sdata[1] = my.new Student(2022, "huh");
		sdata[2] = my.new Student(2021, "kim");
		sdata[3] = my.new Student(2020, "lee");
		sdata[4] = my.new Student(2015, "hwang");
		sdata[5] = my.new Student(2016, "choi");
		for (int i = 0; i < 5; i++) {
			sdata[i].show();
		}
	}
}
