package Chapter7.abstraction1;

public class GalaxyMessenger implements Messenger, WorkFile { //interpace는 다중상속 가능

	
	public String getMessage() {
		return "galaxy";
	}

	@Override
	public void setMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("galaxy에서 메세지를 설정합니다 : "+msg);
	}
	public void changeKeyboard() {
		System.out.println("키보드아이콘 터치 후 키보드를 변경합니다.");
	}
//	public void fileDownload() {
//		System.out.println("File을 다운로드 합니다.");
//	}
//	
	
//	public void fileUpload() {
//
//	System.out.println("file을 업로드 합니다.");
//	}
//	
	
}
