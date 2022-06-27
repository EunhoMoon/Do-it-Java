package lamda;

@FunctionalInterface // 함수형 인터페이스라는 의미
public interface MyNumber {

	int getMaxNumber(int num1, int num2);
//	int testNumber(int x, int y);	lamda식을 위한 interface는 하나의 메서드만 있어야 한다.

}
