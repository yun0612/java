package 과제;

public class 배열3 {

	public static void main(String[] args) {
		/* 배열을 오름차순으로 정렬 */
		int[] a = {90, 80, 70, 60, 50, 10};
		
		for (int i=0; i<a.length-1; i++) {
			for (int j=i+1; j<a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
