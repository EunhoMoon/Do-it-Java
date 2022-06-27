package innerClass;

class Outer {
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable runnable = new Runnable() {
		// 변수에 대입하여 구현
		
		@Override
		public void run() {
			System.out.println("runnable!");
		}
	};
	
	public Runnable getRunnable(int i) {
		// Runnable : interface, 쓰레드를 생성할 때 사용
		
		int lNum = 100;
		
//		class MyRunnable implements Runnable {
//			@Override
//			public void run() {
////				lNum += 100;
////				i += 200;
//				// 지역 변수들은 상수화 되기 때문에 사용은 가능하나 값을 변경할 수는 없다.
//				
//				System.out.println("외부 클래스의 instance 변수 : " + outNum);
//				System.out.println("외부 클래스의 static 변수 : " + sNum);
//				System.out.println("내부 클래스의 instance 변수 : " + lNum);
//				System.out.println("파라미터 값 : " + i);
//			}		
//		}
//		
//		return new MyRunnable();
		
		return new Runnable() {	// 위의 지역객체(local class)를 익명객체(anonymous class)화
			// 메서드에 대입하여 구현
			
			@Override
			public void run() {
				System.out.println("외부 클래스의 instance 변수 : " + outNum);
				System.out.println("외부 클래스의 static 변수 : " + sNum);
				System.out.println("내부 클래스의 instance 변수 : " + lNum);
				System.out.println("파라미터 값 : " + i);
			}
		};
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(20);
		runnable.run();
		
		outer.runnable.run();
	}

}
