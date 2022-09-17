package inheritance;

public class OverridingTest {

	public static void main(String[] args) {

//		Customer customerLee = new Customer(100010, "LEE");
//		int price = customerLee.calcPrice(10000);
//		System.out.println("지불 금액은 " + price + "원 이고, " + customerLee.showCustomerInfo());
//		
//		VipCustomer customerKim = new VipCustomer(100010, "KIM", 100);
//		price = customerKim.calcPrice(10000);
//		System.out.println("지불 금액은 " + price + "원 이고, " + customerKim.showCustomerInfo());
	
		// 재정의된 메서드가 있으면 그 메서드가 실행됨.(업캐스팅 됐지만 vip 클래스의 함수가 실행됨)
		Customer customerWho = new VipCustomer(10010, "Who", 100);
		int price = customerWho.calcPrice(10000);
		System.out.println("지불 금액은 " + price + "원 이고, " + customerWho.showCustomerInfo());
		
		
	}

}
