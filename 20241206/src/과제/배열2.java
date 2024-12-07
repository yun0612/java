package 과제;

public class 배열2 {

	public static void main(String[] args) {
		/* 배열의 최대값과 최소값 */
		int[] a = {90, 80, 70, 60, 50, 10};
		int max = a[0];
		int min = a[0];
		
		for (int i=1; i<a.length; i++) {
			if (max < a[i]) max = a[i];
			if (min > a[i]) min = a[i];
		}
		
		System.out.println("최대값=" + max);
		System.out.println("최소값=" + min);
	}

}
