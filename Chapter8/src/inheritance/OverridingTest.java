package inheritance;

public class OverridingTest {

	public static void main(String[] args) {

//		Customer customerLee = new Customer(100010, "LEE");
//		int price = customerLee.calcPrice(10000);
//		System.out.println("���� �ݾ��� " + price + "�� �̰�, " + customerLee.showCustomerInfo());
//		
//		VipCustomer customerKim = new VipCustomer(100010, "KIM", 100);
//		price = customerKim.calcPrice(10000);
//		System.out.println("���� �ݾ��� " + price + "�� �̰�, " + customerKim.showCustomerInfo());
	
		// �����ǵ� �޼��尡 ������ �� �޼��尡 �����.(��ĳ���� ������ vip Ŭ������ �Լ��� �����)
		Customer customerWho = new VipCustomer(10010, "Who", 100);
		int price = customerWho.calcPrice(10000);
		System.out.println("���� �ݾ��� " + price + "�� �̰�, " + customerWho.showCustomerInfo());
		
		
	}

}
