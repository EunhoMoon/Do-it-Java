package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		try (AutoCloseObj obj = new AutoCloseObj()) {
		 	throw new Exception();	// throw : 에러 강제 발생
		} catch (Exception e) {
			System.out.println("exception 발생");
		}
		
	}
	
}
