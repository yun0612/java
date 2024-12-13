class Score {
	String name;
	int kor, eng, math;
	double avg;
	
	public void setter(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.average();
	}
	
	public void average() {
		avg = (kor+eng+math) / 3.0;
	}
	
	public void printAvg() {
		System.out.println("이름: " + name);
		System.out.printf("평균: %.2f\n", avg);
	}
}

public class Test03 {

	public static void main(String[] args) {
		Score test = new Score();
		test.setter("Anne", 80, 80, 100);
		test.printAvg();
	}

}
