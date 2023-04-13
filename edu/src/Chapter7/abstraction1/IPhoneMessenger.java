package Chapter7.abstraction1;

public class IPhoneMessenger extends GraphicIOS implements Messenger { //interpace 구현?

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "iPhone";
	}

	@Override
	public void setMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("iPhone에서 메시지를 설정합니다 :"+msg);
	} //messenger 인터페이스에서 정의된 setMessage() 메서드를 재정의(오버라이딩)
	public void clearMessenger() {
		System.out.println("좌우로 흔들어 문자열을 지웁니다.");
	}
	
	public void draw_textBox() {
		System.out.println("IPhoneMessenger : 텍스트 상자를 그린다.");
		super.draw_textBox(); //super.method() ; 부모클래스를 직접 호출
	}
	public void draw_submitButton() {
		System.out.println("IPhoneMessenger: 전송버튼을 그린다");
		super.draw_submitButton();
	}

}
