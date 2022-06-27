package singletone;

public class Company {

	private static Company instance = new Company();
	// 단 한개의 인스턴스만 생성(naming은 상관 없음)
	// private : 외부 접근 차단(내부에서만 접근 가능)
	// static : 단 한개만 생성

	private Company() {
	}
	// private constructor : 외부에서 생성자를 호출하지 못하도록 하겠다.

	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
	// private instance를 사용하기 위한 getter(외부에서 접근할 수 있도록 public 선언)
	// static : static 선언을 통해 객체를 생성하지 않고 class에서 바로 호출할 수 있다.

}
