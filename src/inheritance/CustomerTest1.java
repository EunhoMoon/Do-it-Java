package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10100, "Lee");
		
		VIPCustomer customerKim = new VIPCustomer(10101, "Kim", 100);
		// 하위 클래스가 생성될 때 항상 상위 클래스가 먼저 생성된다.
		// 하위 클래스는 상위 클래스로 형변환(UpCasting)이 가능(하위 클래스가 상위 클래스의 Type을 내포)
		// 하위 클래스를 상위 클래스로 형변환 할 경우 상위 클래스의 변수와 메서드만 사용 가능
		
		customerKim.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
		
	}
	
}
