package inheritance;

public class Circle {

	Point point;
	// 상속은 다른 객체를 활용하는 것이 아닌, 보편적인 객체를 구체화 시킬 때 사용
	
	private int radius;
	
	public Circle() {
		point = new Point();
	}
	
}
