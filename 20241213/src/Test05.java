
public class Test05 extends Test04 {
	private int z;
	
	Test05 () {
		super();
		z = 0;
	}
	
	Test05 (int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public void setZ(int z) {
		this.z = z;
	}
	
	public void printXYZ() {
		super.printXY();
		System.out.println(", "+z);
	}
}
