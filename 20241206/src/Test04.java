public class Test04 {
	public static void main(String args[]) {
		/* 배열 array */
		// 선언		// 생성
		int[] arr1 = new int[5];	// new로 선언하면 배열 크기 지정
		// new로 생성시 한번에 초기화 불가능, 일일이 수작업으로 넣어야 함
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		for (int i=0; i<arr1.length; i++) {
			System.out.println(i + "번째 요소: " + arr1[i]);
		}
		System.out.println();
		
		// 선언			// 초기화
		String[] arr2 = {"Hi", "Hello", "Bye"};	// 배열 크기 자동 측정
		
		// .length : 배열의 길이(요소 개수) 반환하는 속성
		for (int i=0; i<arr2.length; i++) {
			System.out.println(i + "번째 요소: " + arr2[i]);
		}
	}
}