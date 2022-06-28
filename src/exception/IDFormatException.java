package exception;

public class IDFormatException extends Exception {
	// 입력 받은 ID가 null이거나 8자 미만, 20자 초과일 경우

	public IDFormatException(String message) {
		super(message);
	}
	
}
