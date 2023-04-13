package Chapter7.abstraction1;

public interface WorkFile {

	public default void fileUpload() {
		System.out.println("File을 다운로드 합니다.");
	}
	
	
	
	public default void fileDownload() {
		System.out.println("File을 업로드 합니다.");
	}
}
