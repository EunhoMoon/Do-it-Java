package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();

		Customer cusLee = new Customer(10100, "이순신");
		Customer cusShin = new Customer(10101, "신사임당");
		Customer cusHong = new GoldCustomer(10102, "홍길동");
		Customer cusYul = new GoldCustomer(10103, "이율곡");
		Customer cusKim = new VIPCustomer(10104, "김유신", 100);

		customerList.add(cusLee);
		customerList.add(cusShin);
		customerList.add(cusHong);
		customerList.add(cusYul);
		customerList.add(cusKim);
		
		customerList.stream().forEach(c -> {
			int cost = c.calcPrice(10000);
			System.out.println(c.getCustomerName() + "님이 " + cost + "원을 지불하셨습니다.");
			System.out.println(c.showCustomerInfo());
		});

	}

}
