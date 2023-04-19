package Chapter8.innerclass;

import Chapter7.abstraction1.GalaxyMessenger;

interface Messenger {
	String getMessage();

	void setMessage(String msg);

	void changeMode();
}

//class galaxayMessenger implements Messenger {
//	public String getMessage() { //overriding
//		return "good";
//	}
//
//	public void setMessage(String msg) { //overriding
//		System.out.println("my data =" + msg);
//	}
//	public void changeMode() {
//		System.out.println("changed");
//	}
//}

public class 익명클래스 {
	public static void main(String[] args) {
		Messenger galaxy = new Messenger() {

			@Override
			public void setMessage(String msg) {
				System.out.println("my data : " + msg);

			}

			@Override
			public String getMessage() {
				return "good";
			}

			public void changeMode() {
				System.out.println("changed.");
			}
		};// 익명클래스 생성(클래스 이름 뭔지 모름) ; 인터페이스를 구현한 클래스일 때 ; 딱 한번 인스턴스 생성해서 사용하고 더는 사용할 일 없을때 익명클래스 사용
		
		galaxy.getMessage();
		galaxy.setMessage("huhhuh");
		galaxy.changeMode();
	}
}
