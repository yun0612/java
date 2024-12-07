package 과제;

public class 배열1 {

	public static void main(String[] args) {
		/*배열의 총점과 평균 구하기*/
		int[] a = {90, 80, 70, 60, 50};
		int sum = 0;
		double average;
		
		for (int i=0; i<a.length; i++) {
			sum += a[i];
		}
		
		average = sum / (double)a.length;
		System.out.println("배열 a의 총점 = " + sum);
		System.out.println("배열 a의 평균 = " + average);
	}

}
