package 과제;

public class 배열6 {

	public static void main(String[] args) {
		/* 석차 구하기 */
		int[] a = {10, 20, 30, 50, 50, 60};
		int rank = 1;
		
		// 내림차순 정렬
		for (int i=0; i<a.length-1; i++) {
			for (int j=i+1; j<a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i] + "==" + rank);
			if (i < a.length-1 && a[i] != a[i+1]) rank++;
		}
	}

}
