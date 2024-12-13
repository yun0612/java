class Point {
	// private : 클래스 내에서만 사용 가능 (정보 은닉)
	// 직접 접근이 불가한 대신 setter, getter 메서드를 만들어 사용
	private int x, y;
	
	public void setter(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y; 
	}
	
	public void printPoint() {
		System.out.printf("(%d, %d)", x, y);
	}
}


public class Test02 {
	public static void main(String[] args) {
		Point p = new Point();
		p.setter(10, 3);
		p.printPoint();
	}
}
