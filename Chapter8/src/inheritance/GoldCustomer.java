package inheritance;

public class GoldCustomer extends Customer {
	
	public GoldCustomer() {
		bonusRatio = 0.05;
	}
	
//	public GoldCustomer(int ID, String name) {
//		super(ID, name); 
//		bonusRatio = 0.05;
//	}


	@Override //컴파일러에게 재정의된 메서드라는 것을 알리는 역할.
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
