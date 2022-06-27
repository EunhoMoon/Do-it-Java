package lamda;

interface PrintString {
	void showString(String str);
}

public class LamdaTest {

	public static void main(String[] args) {
		
		PrintString lamdaPrint = str -> System.out.println(str);	// 변수에 담아 implement하는 방법
		lamdaPrint.showString("test");
		
		showMyString(lamdaPrint);	// implement된 내용이 매개변수로 method로 넘어가는 방법
		
		PrintString reStr = returnPrint();	// implement 자체를 반환값으로 하는 방법
		reStr.showString("hello");
	}
	
	public static void showMyString(PrintString lamda) {
		lamda.showString("test2");
	}
	
	public static PrintString returnPrint() {
		return s->System.out.println(s + " word");
	}
}
