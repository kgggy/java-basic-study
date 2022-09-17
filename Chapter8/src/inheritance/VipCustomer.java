package inheritance;

// vip 고객은 일반 고객과 다르게 보너스비율이 더 높고, 할인율 및 담당자가 있음. => 상속 사용.
public class VipCustomer extends Customer {
	
	private int agentID;
	double saleRatio;

//	public VipCustomer() {
//		//super(); // 하위클래스 기본 생성자 호출시 생략가능.
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//		
//		System.out.println("VipCustomer() 호출됨.");
//	}
	
	// 하위클래스 기본 생성자 없을 경우.
	public VipCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); 
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		
		System.out.println("VipCustomer(int, String) 호출됨.");
	}
	
	// 메서드 오버라이딩
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio); // 기존 Customer의 메서드에서 기능 추가해서 덮어씀.
	}
	
	public int getAgentId() {
		return agentID;
	}
	
}
