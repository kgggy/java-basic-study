package inheritance;

public class Circle {
	// 단지 포인트 클래스의 참조변수만 사용하고 싶을땐 상속을 사용하지 않음.
//	private int x;
//	private int y;
	
	Point point;
	
	private int radius;
	
	// 변수만 사용하고 싶을땐 일반적으로 그냥 생성해서 사용.
	public Circle() {
		point = new Point();
	}

}
