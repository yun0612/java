
public class Problem1 {
	// 20241206의 과제 패키지, 배열3.java를 메서드로 분리
	public static void ascending(int[] arr) {
		for (int i=0; i<arr.length-1; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void printArr(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] a = {90, 80, 70, 60, 50, 10};
		System.out.println("Before");
		printArr(a);
		
		ascending(a);
		System.out.println("After");
		printArr(a);
	}

}
