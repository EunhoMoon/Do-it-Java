package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

/*
 * reduce() 연산 
 *  - 정의된 연산이 아닌 개발자가 직접 지정하는 연산을 적용
 *  - 최종 연산으로 스트림의 요소를 소모하며 연산 수행
 *  - 파라미터
 *  	1) 초기값
 *  	2) 람다식
 */

class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String s1, String s2) {
		if (s1.getBytes().length >= s2.getBytes().length) {
			return s2;
		} else {
			return s1;
		}
	}

}

public class ReduceTest {

	public static void main(String[] args) {

		String[] greetings = { "안녕하세요~~~~~", "hello", "Good morning", "반갑습니다." };

		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
			if (s1.getBytes().length >= s2.getBytes().length) {
				return s1;
			} else {
				return s2;
			}
		}));

		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
	}

}
