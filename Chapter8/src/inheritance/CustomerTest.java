package inheritance;

public class CustomerTest {
	
	public static void main(String[] args) {
		
//		Customer customerLee = new Customer();
//		customerLee.setCustomerID(10100);
//		customerLee.setCustomerName("Lee");
		
//		VipCustomer customerkim = new VipCustomer(); // 상위 클래스 기본 생성자
//		customerkim.setCustomerID(10101);
//		customerkim.setCustomerName("Kim");
		
//		VipCustomer customerkim = new VipCustomer(10101, "kim"); // 상위 클래스에 기본 생성자 없는 경우
		
		Customer customerkim = new VipCustomer(10101, "kim", 100); // 업캐스팅
		
		customerkim.bonusPoint = 1000; // 업캐스팅 시 VipCustomer의 멤버변수는 볼 수 없음.
		
//		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerkim.showCustomerInfo());
		
		
//		Customer customerGold = new GoldCustomer(101, "Gold");
//		System.out.println(customerGold.showCustomerInfo());
		
	}
	
}

