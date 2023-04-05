package Chapter3;

public class Test20 {
	public static void main(String[] args) {
		//if ~ else if문 : 
		int score = 58;
		char grade;
		
		if(score>=90) {
			grade = 'A';
		}
		else if(score>=80) {
			grade = 'B';
		}
		else if(score>=70) {
			grade = 'C';
		}
		else if(score>=60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}

		
		System.out.println(grade);
	}
}
