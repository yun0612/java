
public class Test04 {
	private int x, y;
	
	Test04() {
		x=0;
		y=0;
	}
	
	Test04 (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void printXY() {
		System.out.print(x + ", " + y);
	}
}
