package inheritance;

public class GoldCustomer extends Customer {
	
	public GoldCustomer() {
		bonusRatio = 0.05;
	}
	
//	public GoldCustomer(int ID, String name) {
//		super(ID, name); 
//		bonusRatio = 0.05;
//	}


	@Override //�����Ϸ����� �����ǵ� �޼����� ���� �˸��� ����.
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		return super.calcPrice(price);
	}

	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo();
	}
	
	

}
