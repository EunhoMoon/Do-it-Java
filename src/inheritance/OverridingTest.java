package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		
//		Customer customerLee = new Customer(10010, "Lee");
//		int price = customerLee.calcPrice(10000);
//		System.out.println("지불 금액은 " + price + "원이고, " +  customerLee.showCustomerInfo());
//		
//		VIPCustomer customerKim = new VIPCustomer(10011, "KIM", 100);
//		price = customerKim.calcPrice(10000);
//		System.out.println("지불 금액은 " + price + "원이고, " +  customerKim.showCustomerInfo());
		
		Customer customerWho = new VIPCustomer(10010, "who", 100);
		int price = customerWho.calcPrice(10000);
		System.out.println("지불 금액은 " + price + "원이고, " +  customerWho.showCustomerInfo());
		// 가상 메서드 : 상위클래스로 형변환 되었어도 하위 클래스에서 재정의(overring)된 메서드가 호출
		
		Customer customerGold = new GoldCustomer(10110, "gold");
		price = customerGold.calcPrice(10000);
		System.out.println("지불 금액은 " + price + "원이고, " +  customerGold.showCustomerInfo());
	}
	
}
