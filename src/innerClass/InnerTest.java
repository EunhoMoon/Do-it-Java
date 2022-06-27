package innerClass;

class OutClass {

	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;

	public OutClass() {
//		내부 클래스는 보통 외부 클래스 의 생성자에서 생성한다
		inClass = new InClass();
	}

	private class InClass { // instance inner class
		int inNum = 200;
//		static sInNum = 100;	
//		내부 클래스 내에서 static 변수 사용 불가(static은 인스턴스 생성과 상관없이 생성할 수 있어야 하는데, 내부 클래스 안에 있을 경우 이 규칙에 위배)

		void inTest() { // 외부 클래스 내의 모든 변수를 사용할 수 있다.
			System.out.println("instance 내부 클래스 호출");
			System.out.println("외부 클래스의 instance 변수 : " + num);
			System.out.println("외부 클래스의 static 변수 : " + sNum); // 외부 클래스의 static도 사용은 가능
		}

	}

	// private 선언일 경우
	public void usingInTest() {
		inClass.inTest();
	}

	static class InStaticClass { // static inner class : 외부 클래스의 생성과 상관 없이 사용 가능
		int iNum = 100;
		static int sInNum = 200;

		void inTest() {
//			num += 10;	외부 클래스의 instance 변수는 사용 불가(외부 클래스의 생성과 상관없이 접근 가능해야 하기 때문)
			sNum += 10;
			System.out.println("static 내부 클래스 호출");
			System.out.println("외부 클래스의 static 변수 : " + sNum);
			System.out.println("내부 클래스의 instance 변수 : " + iNum);
			System.out.println("내부 클래스의 static 변수 : " + sInNum);
		}
		
		static void sTest() {
			System.out.println("static 내부 클래스의 static 메소드 호출");
			System.out.println("외부 static 클래스의 static 변수 : " + sNum);
//			System.out.println("내부 클래스의 instance 변수 : " + iNum);	// 내부 클래스의 instance 변수 사용 불가
			System.out.println("내부 static 클래스의 static 변수 : " + sInNum);
		}
	}

}

public class InnerTest {
	public static void main(String[] args) {

		/*
		 * instance 내부 클래스 사용
		 */
		OutClass outClass = new OutClass(); // 외부 클래스 생성시 내부 클래스도 생성(생성자 내에서)

		// private 선언이 아닐 경우(일반적이지 않음)
//		outClass.inClass.inTest();
//		
//		OutClass.InClass inClass = new OutClass().new InClass();	// 외부 클래스 내부에 있는 내부 클래스 생성 문법
//		inClass.inTest();

		outClass.usingInTest(); // private
		
		System.out.println();

		/*
		 * static 내부 클래스 사용
		 */
		OutClass.InStaticClass sIncClass = new OutClass.InStaticClass();
		sIncClass.inTest();
		System.out.println();
		OutClass.InStaticClass.sTest();
	}
}