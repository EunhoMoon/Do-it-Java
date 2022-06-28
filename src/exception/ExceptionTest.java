package exception;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("a.txt")) {
			System.out.println(fis);
		} catch (IOException e) {
			System.out.println(e);
		} 
		System.out.println("end");

	}

}
