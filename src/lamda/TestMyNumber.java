package lamda;

public class TestMyNumber {

	public static void main(String[] args) {
		
		MyNumber maxNum = (x, y) -> (x >= y) ? x : y;
		// 람다식 내부에서 익명 객체가 생성된다.(java는 객체지향 언어이기 때문에 객체 없이 메소드 실행 불가)
		
		int max = maxNum.getMaxNumber(10, 20);
		
		System.out.println(max);
		
	}
	
}
