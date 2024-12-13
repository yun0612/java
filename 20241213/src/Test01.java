// class = property + method
class Tag {
	// property
	String name;
	int avg;
	
	// constructor
	Tag (String name) {
		// this : 클래스 내부에서 클래스 변수/메서드를 호출할 때 사용
		this.name = name;
	}
	
	//method
	public String average(int kor_score, int eng_score) {
		avg = (kor_score + eng_score) / 2;
		return name + avg;
	}
}

public class Test01 {

	public static void main(String[] args) {
		// instantiation
		Tag tag = new Tag("pepe");
		// call method
		System.out.println(tag.average(80, 100));
	}

}
