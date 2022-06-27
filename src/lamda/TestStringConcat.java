package lamda;

public class TestStringConcat {

	public static void main(String[] args) {
		// 객체 지향 방식(interface를 구현하는 방식)
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("hello", "java");
		
		// lamda식
		StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2);
		concat.makeString("hello", "java");
		
	}

}
