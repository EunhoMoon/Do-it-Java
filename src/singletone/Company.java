package singletone;

public class Company {

	private static Company instance = new Company();
	// 단 한개의 인스턴스만 생성

	private Company() {
	}
	// private constructor : 외부에서 생성자를 호출하지 못하도록 하겠다.

	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
	// private instance를 사용하기 위한 getter
	// static : 객체를 생성하지 않고 class에서 바로 호출할 수 있다.

}
