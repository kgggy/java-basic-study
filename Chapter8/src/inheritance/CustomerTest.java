package inheritance;

public class CustomerTest {
	
	public static void main(String[] args) {
		
//		Customer customerLee = new Customer();
//		customerLee.setCustomerID(10100);
//		customerLee.setCustomerName("Lee");
		
//		VipCustomer customerkim = new VipCustomer(); // ���� Ŭ���� �⺻ ������
//		customerkim.setCustomerID(10101);
//		customerkim.setCustomerName("Kim");
		
//		VipCustomer customerkim = new VipCustomer(10101, "kim"); // ���� Ŭ������ �⺻ ������ ���� ���
		
		Customer customerkim = new VipCustomer(10101, "kim", 100); // ��ĳ����
		
		customerkim.bonusPoint = 1000; // ��ĳ���� �� VipCustomer�� ��������� �� �� ����.
		
//		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerkim.showCustomerInfo());
		
		
//		Customer customerGold = new GoldCustomer(101, "Gold");
//		System.out.println(customerGold.showCustomerInfo());
		
	}
	
}

