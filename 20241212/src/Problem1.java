
public class Problem1 {
	// 20241206의 과제 패키지, 배열3.java를 메서드로 분리
	// 결과 출력 코드 추가
	public static void ascending(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] a = {90, 80, 70, 60, 50, 10};
		ascending(a);
	}

}
