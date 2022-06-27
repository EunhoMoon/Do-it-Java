package singletone;

public class CompanyTest {

	public static void main(String[] args) {

		Company c1 = Company.getInstance();

		Company c2 = Company.getInstance();

		System.out.println(c1);
		System.out.println(c2);
		// 하나의 인스턴스만 생성되기 때문에 동이한 주소값을 가지고 있다.

	}
}
