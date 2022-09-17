package inheritance;

// vip ���� �Ϲ� ���� �ٸ��� ���ʽ������� �� ����, ������ �� ����ڰ� ����. => ��� ���.
public class VipCustomer extends Customer {
	
	private int agentID;
	double saleRatio;

//	public VipCustomer() {
//		//super(); // ����Ŭ���� �⺻ ������ ȣ��� ��������.
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//		
//		System.out.println("VipCustomer() ȣ���.");
//	}
	
	// ����Ŭ���� �⺻ ������ ���� ���.
	public VipCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); 
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		
		System.out.println("VipCustomer(int, String) ȣ���.");
	}
	
	// �޼��� �������̵�
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio); // ���� Customer�� �޼��忡�� ��� �߰��ؼ� ���.
	}
	
	public int getAgentId() {
		return agentID;
	}
	
}
