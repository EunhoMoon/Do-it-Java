package stream;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int sum = Arrays.stream(arr).sum();
		System.out.println("sum : " + sum);
		// 한번 사용한 stream은 재사용 불가
		
	}

}
